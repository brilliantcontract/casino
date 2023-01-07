package bc.rlt.strategies;

import bc.rlt.essential.CriticalException;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.StrategyTarget;

public interface Strategy {

    public Field calculate(ROULETTE_NAME rouletteName, String tableName, StrategyTarget strategyTarget)
            throws CriticalException;
}
