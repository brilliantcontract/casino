package bc.rlt.strategies;

import bc.rlt.essential.Config;
import bc.rlt.essential.CriticalException;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.StrategyTarget;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.PathParam;

public class RouletteMirrorStrategyDemo {

    private final Histories histories = Histories.create();

    public String calculate(String strategyTarget, String tableName) throws CriticalException {
        Strategy strategy = new RouletteMirrorStrategy();

        if (Config.IS_DEBUG_MODE) {
            histories.addPragmatic(tableName, "1hl65ce1lxuqdrkr");
        }

        History history = histories.getHistory(tableName);

        if (Config.IS_DEBUG_MODE) {
            addFakeNumbersToHistory(history, 0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6, 8, 1, 0, 30);
        }

        StrategyTarget target = StrategyTarget.valueOf(strategyTarget.toUpperCase());

        if (target == null) {
            throw new CriticalException("Specified incorrect strategy target.");
        }

        Field field = strategy.calculate(ROULETTE_NAME.PRAGMATIC, tableName, StrategyTarget.COLOR);

        String json = field.asJson();

        return json;
    }

    private void addFakeNumbersToHistory(History history, Integer... integers) throws CriticalException {
        List<bc.rlt.history.Number> numbers = new ArrayList<>();
        for (Integer integer : integers) {
            numbers.add(new bc.rlt.history.Number(integer));
        }

        history.clear();
        history.append(numbers);
    }
}
