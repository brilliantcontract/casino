package bc.roulette.history;

import bc.roulette.Config;
import java.util.logging.Level;
import java.util.logging.Logger;
import bc.roulette.CriticalException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class History {

    private final Queue<Spin> spins;
    private final String tableId;
    private final String tableName;
    private final String rouletteName;
    private List<Number> lastAppendNumbers = new ArrayList();

    public History(final String rouletteName,
            final String tableName, final String tableId) {
        this.spins = new Queue<>(10_000);
        this.tableName = tableName;
        this.tableId = tableId;
        this.rouletteName = rouletteName;
    }

    public Queue<Spin> getSpins() {
        return spins;
    }

    public String getTableId() {
        return tableId;
    }

    public String getRouletteName() {
        return rouletteName;
    }

    public String getTableName() {
        return tableName;
    }

    /**
     * You should use append() function.
     * @param number
     * @throws CriticalException 
     */
    private void add(Number number)
            throws CriticalException {
        if (number == null) {
            return;
        }

        final Spin spin;

        try {
            spin = new Spin(number, spins.size());
            spins.push(spin);
        } catch (NullPointerException | NumberFormatException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, ex.getMessage() + "Critical exception. Cannot create and add new Spin to History.");
            throw new CriticalException();
        }
    }

    /**
     * You should use append() function.
     * @param numbers
     * @throws CriticalException 
     */
    private void addAll(List<Number> numbers) throws CriticalException {
        if (numbers == null) {
            return;
        }

        for (Number number : numbers) {
            add(number);
        }
    }

    public void append(List<Number> newNumbers) throws CriticalException {
        if (newNumbers == null) {
            return;
        }

        if (!spins.isEmpty() && spins.size() < Config.NUMBER_OF_SPINS_TO_MATCH) {
            throw new CriticalException("History has fewer spins than reqired to do analyse. Stored spins " + spins.size() + ", required spins " + Config.NUMBER_OF_SPINS_TO_MATCH + ".");
        }

        List<Number> synchronizedNumbers = synchronize(newNumbers);
        Collections.reverse(synchronizedNumbers);

        addAll(synchronizedNumbers);
    }

    private List<Number> synchronize(List<Number> newNumbers) {
        // Skip synchronization for the same list of numbers that was synchronized last time.
        if (lastAppendNumbers.equals(newNumbers)) {
            return new ArrayList();
        } else {
            lastAppendNumbers = newNumbers;
        }

        List<Number> currentNumbers = getCurrentNumbers();

        return _synchronize(currentNumbers, newNumbers);
    }

    private List<Number> _synchronize(List<Number> currentNumbers, List<Number> newNumbers) {
        if (currentNumbers.isEmpty()) {
            return newNumbers;
        }

        int matchedIndex = -1;
        outterLoop:
        for (int nni = 0; nni < newNumbers.size(); nni++) {
            Number newNumber = newNumbers.get(nni);

            int matches = 0;
            for (int cni = 0; cni < currentNumbers.size(); cni++) {
                Number currentNumber = currentNumbers.get(cni);

                if (newNumber.equals(currentNumber)) {
                    matches += 1;

                    if (matches == Config.NUMBER_OF_SPINS_TO_MATCH) {
                        matchedIndex = cni;
                        break outterLoop;
                    } else {
                        nni += 1;
                        newNumber = newNumbers.get(nni);
                    }
                } else {
                    matches = 0;
                }
            }
        }

        List<Number> synchronizedNumbers = new ArrayList<>();
        if (matchedIndex > -1) {
            for(int index = 0; index <= matchedIndex; index++) {
                synchronizedNumbers.add(newNumbers.get(index));
            }
        }

        return synchronizedNumbers;
    }

    private List<Number> getCurrentNumbers() {
        List<Number> currentNumbers = new ArrayList<>();

        for (Spin spin : this.spins) {
            currentNumbers.add(spin.getNumber());
        }

        return currentNumbers;
    }

}
