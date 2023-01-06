package bc.roulette.history.synchronization;

import bc.roulette.CriticalException;
import bc.roulette.history.History;
import bc.roulette.history.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumbersSynchronizerWith1NumberTest {

    /**
     * Test has only 1 initial numbers. It cause exception.
     *
     * @throws Exception
     */
    @Test(expected = CriticalException.class)
    public void test() throws Exception {
        List<Number> initialNumbers = new NumbersGenerator().generate1number();
        History history = new History("Best roulette", "Best table", "777");
        history.append(initialNumbers);

        List<Number> freshNumbers = Arrays.asList(
                new Number(3),
                new Number(3),
                new Number(3),
                new Number(3),
                new Number(3)
        );

        history.append(freshNumbers);
    }

}
