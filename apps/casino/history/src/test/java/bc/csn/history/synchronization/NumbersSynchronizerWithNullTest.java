package bc.csn.history.synchronization;

import bc.csn.history.History;
import bc.csn.history.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumbersSynchronizerWithNullTest {

    @Test
    public void test() throws Exception {
        List<Number> initialNumbers = new NumbersGenerator().generateNull();
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

        assertThat(history.getSpins().size(), is(5));
        
        assertThat(history.getSpins().get(0).getNumber().getValue(), is(3));
        assertThat(history.getSpins().get(1).getNumber().getValue(), is(3));
        assertThat(history.getSpins().get(2).getNumber().getValue(), is(3));
        assertThat(history.getSpins().get(3).getNumber().getValue(), is(3));
        assertThat(history.getSpins().get(4).getNumber().getValue(), is(3));
    }

}
