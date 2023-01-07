package bc.rlt.strategies;

import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.StrategyTarget;
import bc.rlt.history.Histories;
import bc.rlt.history.Spin;
import bc.rlt.history.Number;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class JsonFieldTest {

    @Test
    public void test() throws Exception {
        Field field = new Field();
        field.setRouletteName(ROULETTE_NAME.PRAGMATIC);
        field.setStrategyTarget(StrategyTarget.COLOR);
        field.setTableName("Mega Roulette");
        
        Cell cell = new Cell();
        cell.setX(1);
        cell.setY(1);
        cell.setStatus("RED");
        cell.setSpin(new Spin(new Number(1), 0));
        field.cells.add(cell);
        
        System.out.println(field.asJson());
    }

}