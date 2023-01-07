package bc.rlt.history;

import bc.rlt.history.Number;
import bc.rlt.history.NumberRecognizer;
import bc.rlt.history.spin_enums.Color;
import bc.rlt.history.spin_enums.Parity;
import bc.rlt.history.spin_enums.Range;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class NumberNomenclatureTest {
    
    private final NumberRecognizer recognizer = new NumberRecognizer();

    @Test
    public void testColorRecognition() throws Exception {
        assertThat(recognizer.recognizeColor(new Number(0)), is(Color.GREEN));
        assertThat(recognizer.recognizeColor(new Number(1)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(2)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(3)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(4)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(5)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(6)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(7)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(8)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(9)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(10)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(11)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(12)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(13)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(14)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(15)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(16)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(17)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(18)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(19)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(20)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(21)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(22)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(23)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(24)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(25)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(26)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(27)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(28)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(29)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(30)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(31)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(32)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(33)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(34)), is(Color.RED));
        assertThat(recognizer.recognizeColor(new Number(35)), is(Color.BLACK));
        assertThat(recognizer.recognizeColor(new Number(36)), is(Color.RED));
    }

    @Test
    public void testParityRecognition() throws Exception {
        assertThat(recognizer.recognizeParity(new Number(0)), is(Parity.NONE));
        assertThat(recognizer.recognizeParity(new Number(1)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(2)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(3)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(4)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(5)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(6)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(7)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(8)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(9)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(10)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(11)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(12)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(13)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(14)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(15)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(16)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(17)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(18)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(19)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(20)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(21)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(22)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(23)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(24)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(25)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(26)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(27)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(28)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(29)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(30)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(31)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(32)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(33)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(34)), is(Parity.EVEN));
        assertThat(recognizer.recognizeParity(new Number(35)), is(Parity.ODD));
        assertThat(recognizer.recognizeParity(new Number(36)), is(Parity.EVEN));
    }

    @Test
    public void testRangeRecognition() throws Exception {
        assertThat(recognizer.recognizeRange(new Number(0)), is(Range.NONE));
        assertThat(recognizer.recognizeRange(new Number(1)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(2)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(3)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(4)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(5)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(6)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(7)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(8)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(9)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(10)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(11)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(12)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(13)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(14)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(15)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(16)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(17)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(18)), is(Range.LESS));
        assertThat(recognizer.recognizeRange(new Number(19)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(20)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(21)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(22)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(23)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(24)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(25)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(26)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(27)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(28)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(29)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(30)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(31)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(32)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(33)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(34)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(35)), is(Range.GREAT));
        assertThat(recognizer.recognizeRange(new Number(36)), is(Range.GREAT));
    }

}