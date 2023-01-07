package bc.rlt.history;

import bc.rlt.essential.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Histories implements Iterable<History> {

    private final List<History> histories = new ArrayList();
    private static Histories historiesInstance;

    private Histories() {
    }

    public static Histories create() {
        if (Histories.historiesInstance == null) {
            Histories.historiesInstance = new Histories();
        }

        return Histories.historiesInstance;
    }
    
    public void initializeAllPragmaticTables() {
        for (Map.Entry<String, String> table : Config.PRAGMATIC_TABLE_IDS.entrySet()) {
            addPragmatic(table.getKey(), table.getValue());
        }
    }

    public void addPragmatic(String tableName, String tableId) {
        History history = new History(Config.PRAGMATIC_ROULETTE_NAME,
                tableName, tableId);

        if (histories.contains(history)) {
            Logger.getLogger(Histories.class.getName()).log(Level.WARNING, "Histories object already have the history with table name: " + tableName);
        } else {
            histories.add(history);
        }
    }

    @Override
    public Iterator<History> iterator() {
        return histories.iterator();
    }

    @Override
    public void forEach(Consumer<? super History> action) {
        histories.forEach(action);
    }

    public History getHistory(String tableName) {
        for (History history : this.histories) {
            if (history.getTableName().equals(tableName)) {
                return history;
            }
        }

        return null;
    }

}
