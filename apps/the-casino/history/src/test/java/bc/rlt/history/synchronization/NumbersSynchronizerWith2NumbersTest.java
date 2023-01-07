package bc.rlt.history.synchronization;

import bc.rlt.essential.CriticalException;
import bc.rlt.history.Number;
import bc.rlt.history.History;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumbersSynchronizerWith2NumbersTest {

    /**
     * Test has only 2 initial numbers. It cause exception "History has fewer
     * spins than reqired to do analyse.".
     *
     * @throws Exception
     */
    @Test(expected = CriticalException.class)
    public void test() throws Exception {
        List<Number> initialNumbers = new NumbersGenerator().generate2numbers();
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
