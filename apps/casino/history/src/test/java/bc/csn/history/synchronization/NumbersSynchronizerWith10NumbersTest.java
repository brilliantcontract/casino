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

public class NumbersSynchronizerWith10NumbersTest {

    @Test
    public void testMatch() throws Exception {
        List<Number> initialNumbers = new NumbersGenerator().generate10numbers();
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

        assertThat(history.getSpins().size(), is(15));
        
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
        List<Number> initialNumbers = new NumbersGenerator().generate10numbers();
        History history = new History("Best roulette", "Best table", "777");
        history.append(initialNumbers);

        List<Number> newNumbers = Arrays.asList(
                new Number(10),
                new Number(11),
                new Number(12),
                new Number(13),
                new Number(14),
                new Number(15),
                new Number(16),
                new Number(17),
                new Number(18),
                new Number(19)
        );

        history.append(newNumbers);

        assertThat(history.getSpins().size(), is(10));
        
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
