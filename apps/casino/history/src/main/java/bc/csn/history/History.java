package bc.csn.history;

import bc.csn.essential.Config;
import bc.csn.essential.CriticalException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class History {

    private final Queue<Spin> spins;
    private final String tableId;
    private final String tableName;
    private final String rouletteName;
    private List<Number> lastAppendNumbers = new ArrayList();

    /**
     * Create History object.
     *
     * @param rouletteName
     * @param tableName
     * @param tableId
     */
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

    public Spin getLastSpin() {
        return this.spins.get(this.spins.size() - 1);
    }

    public String asJson() {
        if (this.spins.isEmpty()) {
            return "[]";
        }

        List<String> jsonSpins = new ArrayList<>();
        for (Spin spin : this.spins) {
            jsonSpins.add(spin.asJson());
        }
        String json = "[\n" + jsonSpins.stream().collect(Collectors.joining(",\n")) + "]";

        return json;
    }

    public List<Number> getSpinsAsNumbers() {
        List<Number> numbers = new ArrayList<>();

        for (Spin spin : this.spins) {
            numbers.add(spin.getNumber());
        }

        return numbers;
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
     *
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
     *
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
        if (currentNumbers.isEmpty()) {
            return newNumbers;
        }

        return _synchronize(currentNumbers, newNumbers);
    }

    private List<Number> _synchronize(List<Number> currentNumbers, List<Number> newNumbers) {
        int matchedIndex = -1;
        outterLoop:
        for (int nni = 0; nni < newNumbers.size(); nni++) {
            Number newNumber = newNumbers.get(nni);
            int originalNni = nni;

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
                        if (nni < newNumbers.size()) {
                            newNumber = newNumbers.get(nni);
                        }
                    }
                } else {
                    matches = 0;
                    nni = originalNni;
                }
            }
        }

        List<Number> synchronizedNumbers = new ArrayList<>();
        if (matchedIndex > -1) {
            for (int index = 0; index <= matchedIndex; index++) {
                synchronizedNumbers.add(newNumbers.get(index)); // @todo fix issue.
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.tableName, other.tableName)) {
            return false;
        }
        return true;
    }

    public void clear() {
        this.spins.clear();
    }

}

/*
Exception in thread "Thread-282" java.lang.IndexOutOfBoundsException: Index: 20, Size: 20
	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
	at java.util.ArrayList.get(ArrayList.java:435)
	at bc.csn.history.History._synchronize(History.java:146)
	at bc.csn.history.History.synchronize(History.java:110)
	at bc.csn.history.History.append(History.java:91)
	at bc.csn.scrapers.pragmatic.PragmaticScraper.scrapeTable(PragmaticScraper.java:54)
	at bc.csn.scrapers.pragmatic.PragmaticScraper.lambda$asyncScrapeTable$0(PragmaticScraper.java:82)
	at java.lang.Thread.run(Thread.java:748)
 */
