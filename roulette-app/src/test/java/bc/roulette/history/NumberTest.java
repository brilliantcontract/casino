package bc.roulette.history;

import bc.roulette.CriticalException;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumberTest {

    @Test(expected = NumberFormatException.class)
    public void testNegativeNumber() throws Exception {
        Number number = new Number(-1);
    }

    @Test
    public void test0() throws Exception {
        Number number = new Number(0);
        
        assertThat(number.getValue(), is(0));
    }

    @Test
    public void test15() throws Exception {
        Number number = new Number(15);
        
        assertThat(number.getValue(), is(15));
    }

    @Test
    public void test36() throws Exception {
        Number number = new Number(36);
        
        assertThat(number.getValue(), is(36));
    }

    @Test(expected = NumberFormatException.class)
    public void test37() throws Exception {
        Number number = new Number(37);
        
        assertThat(number.getValue(), is(37));
    }

    @Test(expected = NullPointerException.class)
    public void testNull() throws Exception {
        Integer theNull = null;
        Number number = new Number(theNull);
    }

}