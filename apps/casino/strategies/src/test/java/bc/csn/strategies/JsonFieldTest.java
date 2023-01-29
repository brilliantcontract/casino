package bc.csn.strategies;

import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.StrategyTarget;
import bc.csn.history.Histories;
import bc.csn.history.Spin;
import bc.csn.history.Number;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class JsonFieldTest {

    @Test
    public void test() throws Exception {
        Field field = new Field();
        field.setRouletteName(ROULETTE_NAME.PRAGMATIC_PLAY);
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