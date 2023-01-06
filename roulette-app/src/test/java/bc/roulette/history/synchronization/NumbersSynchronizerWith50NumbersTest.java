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
import org.junit.Ignore;
import org.mockito.Mockito;

public class NumbersSynchronizerWith50NumbersTest {

    @Test
    public void testMatch() throws Exception {
        List<Number> initialNumbers = new NumbersGenerator().generate50numbers();
        History history = new History("Best roulette", "Best table", "777");
        history.append(initialNumbers);

        List<Number> newNumbers = Arrays.asList(
                new Number(32),
                new Number(31),
                new Number(30),
                new Number(29),
                new Number(28),
                new Number(0),
                new Number(1),
                new Number(2),
                new Number(3),
                new Number(4)
        );

        history.append(newNumbers);

        assertThat(history.getSpins().size(), is(55));
        
        assertThat(history.getSpins().get(0).getNumber().getValue(), is(32));
        assertThat(history.getSpins().get(1).getNumber().getValue(), is(31));
        assertThat(history.getSpins().get(2).getNumber().getValue(), is(30));
        assertThat(history.getSpins().get(3).getNumber().getValue(), is(29));
        assertThat(history.getSpins().get(4).getNumber().getValue(), is(28));
        assertThat(history.getSpins().get(5).getNumber().getValue(), is(0));
        assertThat(history.getSpins().get(6).getNumber().getValue(), is(1));
        assertThat(history.getSpins().get(7).getNumber().getValue(), is(2));
        assertThat(history.getSpins().get(8).getNumber().getValue(), is(3));
        assertThat(history.getSpins().get(9).getNumber().getValue(), is(4));
        assertThat(history.getSpins().get(10).getNumber().getValue(), is(5));
        assertThat(history.getSpins().get(11).getNumber().getValue(), is(6));
        assertThat(history.getSpins().get(12).getNumber().getValue(), is(7));
        assertThat(history.getSpins().get(13).getNumber().getValue(), is(8));
        assertThat(history.getSpins().get(14).getNumber().getValue(), is(9));
    }
    
    @Test
    public void testNoMatch() throws Exception {
        List<Number> initialNumbers = new NumbersGenerator().generate50numbers();
        History history = new History("Best roulette", "Best table", "777");
        history.append(initialNumbers);

        List<Number> newNumbers = Arrays.asList(
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7),
                new Number(7)
        );

        history.append(newNumbers);

        assertThat(history.getSpins().size(), is(50));
        
        assertThat(history.getSpins().get(0).getNumber().getValue(), is(0));
        assertThat(history.getSpins().get(1).getNumber().getValue(), is(1));
        assertThat(history.getSpins().get(2).getNumber().getValue(), is(2));
        assertThat(history.getSpins().get(3).getNumber().getValue(), is(3));
        assertThat(history.getSpins().get(4).getNumber().getValue(), is(4));
        assertThat(history.getSpins().get(5).getNumber().getValue(), is(5));
        assertThat(history.getSpins().get(6).getNumber().getValue(), is(6));
        assertThat(history.getSpins().get(7).getNumber().getValue(), is(7));
        assertThat(history.getSpins().get(8).getNumber().getValue(), is(8));
        assertThat(history.getSpins().get(9).getNumber().getValue(), is(9));
    }

}
