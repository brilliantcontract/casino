package bc.roulette.history;

import bc.roulette.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Histories implements Iterable<History> {

    private final List<History> histories = new ArrayList();

    public void addPragmatic(String tableName, String tableId) {
        History history = new History(Config.PRAGMATIC_ROULETTE_NAME,
                tableName, tableId);
        histories.add(history);
    }

    @Override
    public Iterator<History> iterator() {
        return histories.iterator();
    }

    @Override
    public void forEach(Consumer<? super History> action) {
        histories.forEach(action);
    }

}
