package bc.rlt.strategies;

import bc.rlt.essential.Config;
import bc.rlt.essential.CriticalException;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.StrategyTarget;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Before;
import org.mockito.Mockito;
import bc.rlt.history.Number;
import java.util.ArrayList;
import org.junit.BeforeClass;

public class RouletteMirrorStrategyTest {

    private final String tableName = "Mega Roulette";
    private final String tableId = "1hl65ce1lxuqdrkr";
    private final ROULETTE_NAME rouletteName = ROULETTE_NAME.PRAGMATIC_PLAY;
    private final StrategyTarget strategyTarget = StrategyTarget.COLOR;
    private History history;
    private final Strategy strategy = new RouletteMirrorStrategy();

    @Before
    public void beforeTestRunning() {
        Histories histories = Histories.create();
        histories.addPragmatic(tableName, tableId);
        history = histories.getHistory(tableName);
    }

    @Test
    public void testStep0() throws Exception {
        appendToHistory();
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));
    }

    @Test
    public void testStep1() throws Exception {
        appendToHistory(0);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(1));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep2() throws Exception {
        appendToHistory(0, 1);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(2));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep3() throws Exception {
        appendToHistory(0, 1, 4);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(3));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep4() throws Exception {
        appendToHistory(0, 1, 4, 6);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(3));
        assertThat(cell.getY(), is(2));
    }

    @Test
    public void testStep5() throws Exception {
        appendToHistory(0, 1, 4, 6, 8);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(3));
        assertThat(cell.getY(), is(3));
    }

    @Test
    public void testStep6() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(4));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep7() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(5));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep8() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(6));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep9() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(6));
        assertThat(cell.getY(), is(2));
    }

    @Test
    public void testStep10() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(6));
        assertThat(cell.getY(), is(3));
    }

    @Test
    public void testStep11() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(6));
        assertThat(cell.getY(), is(4));
    }

    @Test
    public void testStep12() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(7));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep13() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(8));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep14() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(9));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep15() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(9));
        assertThat(cell.getY(), is(2));
    }

    @Test
    public void testStep16() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6, 8);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(9));
        assertThat(cell.getY(), is(3));
    }

    @Test
    public void testStep17() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6, 8, 1);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(10));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep18() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6, 8, 1, 0);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(11));
        assertThat(cell.getY(), is(1));
    }

    @Test
    public void testStep19() throws Exception {
        appendToHistory(0, 1, 4, 6, 8, 1, 0, 7, 9, 12, 14, 0, 1, 4, 6, 8, 1, 0, 30);
        Field field = strategy.calculate(rouletteName, tableName, strategyTarget);

        assertThat(field.cells.size(), is(history.getSpins().size()));

        Cell cell = field.cells.fetchLast();
        assertThat(cell.getStatus(), is(history.getLastSpin().getColor().toString()));
        assertThat(cell.getSpin().getNumber().getValue(), is(history.getLastSpin().getNumber().getValue()));
        assertThat(cell.getX(), is(12));
        assertThat(cell.getY(), is(1));
    }

    private void appendToHistory(Integer... integers) throws CriticalException {
        List<Number> numbers = new ArrayList<>();
        for (Integer integer : integers) {
            numbers.add(new Number(integer));
        }

        history.clear();
        history.append(numbers);
    }

}
