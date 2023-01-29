package bc.csn.strategies;

import bc.csn.essential.CriticalException;
import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.StrategyTarget;

public interface Strategy {

    public Field calculate(ROULETTE_NAME rouletteName, String tableName, StrategyTarget strategyTarget)
            throws CriticalException;
}
