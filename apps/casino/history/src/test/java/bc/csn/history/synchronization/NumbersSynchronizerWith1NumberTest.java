package bc.csn.history.synchronization;

import bc.csn.essential.CriticalException;
import bc.csn.history.Number;
import bc.csn.history.History;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumbersSynchronizerWith1NumberTest {

    /**
     * Test has only 1 initial numbers. It cause exception "History has fewer
     * spins than reqired to do analyse.".
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
