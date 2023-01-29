package bc.csn.history;

import bc.csn.history.Number;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumberStringParseTest {

    @Test
    public void test15() throws Exception {
        Number number = new Number("15");
        
        assertThat(number.getValue(), is(15));
    }

    @Test
    public void test36() throws Exception {
        Number number = new Number("36");
        
        assertThat(number.getValue(), is(36));
    }

    @Test(expected = NumberFormatException.class)
    public void test37() throws Exception {
        Number number = new Number("37");
        
        assertThat(number.getValue(), is(37));
    }

}