package bc.csn.strategies;

import bc.csn.essential.Config;
import bc.csn.essential.CriticalException;
import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.RouletteTableConfig;
import bc.csn.essential.RouletteTableConfigBuilder;
import bc.csn.essential.StrategyTarget;
import bc.csn.history.Histories;
import bc.csn.history.History;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.PathParam;

public class RouletteMirrorStrategyDemo {

    private final Histories histories = Histories.create();

    public String calculate(String strategyTarget, String tableName) throws CriticalException {
        Strategy strategy = new RouletteMirrorStrategy();

        if (Config.IS_DEBUG_MODE) {
            RouletteTableConfig tableConfig = new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable(tableName)
                        .setHttpId("1hl65ce1lxuqdrkr")
                        .setWsId("2169334708")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create();
            histories.addPragmatic(tableConfig);
        }

        History history = histories.getHistory(tableName);

        if (Config.IS_DEBUG_MODE) {
            addFakeNumbersToHistory(history, 0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6, 8, 1, 0, 30);
        }

        StrategyTarget target = StrategyTarget.valueOf(strategyTarget.toUpperCase());

        if (target == null) {
            throw new CriticalException("Specified incorrect strategy target.");
        }

        Field field = strategy.calculate(ROULETTE_NAME.PRAGMATIC_PLAY, tableName, StrategyTarget.COLOR);

        String json = field.asJson();

        return json;
    }

    private void addFakeNumbersToHistory(History history, Integer... integers) throws CriticalException {
        List<bc.csn.history.Number> numbers = new ArrayList<>();
        for (Integer integer : integers) {
            numbers.add(new bc.csn.history.Number(integer));
        }

        history.clear();
        history.append(numbers);
    }
}
