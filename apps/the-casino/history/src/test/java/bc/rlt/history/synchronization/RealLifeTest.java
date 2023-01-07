package bc.rlt.history.synchronization;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;
import bc.rlt.history.History;
import bc.rlt.history.Number;
import org.junit.Ignore;

/**
 * 15:59:59.213 Roulette 1 - Azure: 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25,
 * 0, 18, 3, 22, 36, 30, 15, 6
 *
 * 16:00:59.872 Roulette 1 - Azure: 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5,
 * 15, 25, 0, 18, 3, 22, 36, 30
 *
 * 16:02:00.623 Roulette 1 - Azure: 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33,
 * 5, 15, 25, 0, 18, 3, 22, 36
 *
 * 16:03:01.222 Roulette 1 - Azure: 34, 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2,
 * 33, 5, 15, 25, 0, 18, 3, 22
 *
 * 16:04:01.886 Roulette 1 - Azure: 2, 27, 34, 1, 32, 31, 4, 31, 21, 6, 18, 31,
 * 0, 2, 33, 5, 15, 25, 0, 18
 *
 * 16:05:02.596 Roulette 1 - Azure: 2, 2, 27, 34, 1, 32, 31, 4, 31, 21, 6, 18,
 * 31, 0, 2, 33, 5, 15, 25, 0
 *
 * 16:06:03.240 Roulette 1 - Azure: 23, 25, 2, 2, 27, 34, 1, 32, 31, 4, 31, 21,
 * 6, 18, 31, 0, 2, 33, 5, 15
 *
 *
 *
 * 15:59:59.213 Auto-Roulette 1: 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28,
 * 35, 30, 4, 33, 27, 26, 21, 35
 *
 * 16:00:59.872 Auto-Roulette 1: 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16,
 * 14, 28, 35, 30, 4, 33, 27, 26
 *
 * 16:02:00.548 Auto-Roulette 1: 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24,
 * 16, 14, 28, 35, 30, 4, 33, 27
 *
 * 16:03:01.215 Auto-Roulette 1: 12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34,
 * 24, 16, 14, 28, 35, 30, 4, 33
 *
 * 16:04:01.882 Auto-Roulette 1: 21, 12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36,
 * 34, 24, 16, 14, 28, 35, 30, 4
 *
 * 16:05:02.574 Auto-Roulette 1: 23, 14, 21, 12, 25, 29, 19, 35, 8, 22, 10, 2,
 * 5, 36, 34, 24, 16, 14, 28, 35
 *
 * 16:06:03.128 Auto-Roulette 1: 11, 23, 14, 21, 12, 25, 29, 19, 35, 8, 22, 10,
 * 2, 5, 36, 34, 24, 16, 14, 28
 *
 *
 *
 * 15:59:59.213 Roulette 2: 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5,
 * 0, 30, 29, 20, 0, 0
 *
 * 16:00:59.874 Roulette 2: 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14,
 * 29, 34, 5, 0, 30, 29, 20
 *
 * 16:02:00.612 Roulette 2: 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10,
 * 14, 29, 34, 5, 0, 30, 29
 *
 * 16:03:01.302 Roulette 2: 16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10,
 * 10, 14, 29, 34, 5, 0, 30
 *
 * 16:04:02.014 Roulette 2: 17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2,
 * 35, 10, 10, 14, 29, 34, 5
 *
 * 16:05:02.573 Roulette 2: 17, 17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35, 35,
 * 2, 35, 10, 10, 14, 29, 34
 *
 * 16:06:03.146 Roulette 2: 23, 17, 17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35,
 * 35, 2, 35, 10, 10, 14, 29
 *
 *
 *
 * 15:59:59.213 Roulette 3 - Macao: 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24,
 * 5, 10, 16, 21, 0, 21, 13, 31
 *
 * 16:00:59.956 Roulette 3 - Macao: 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18,
 * 18, 24, 5, 10, 16, 21, 0, 21
 *
 * 16:02:00.550 Roulette 3 - Macao: 2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4,
 * 18, 18, 24, 5, 10, 16, 21, 0
 *
 * 16:03:01.289 Roulette 3 - Macao: 0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3, 0,
 * 7, 4, 18, 18, 24, 5, 10, 16
 *
 * 16:04:02.013 Roulette 3 - Macao: 25, 0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3,
 * 0, 7, 4, 18, 18, 24, 5, 10
 *
 * 16:05:02.500 Roulette 3 - Macao: 31, 17, 25, 0, 10, 2, 16, 36, 36, 34, 35,
 * 31, 22, 3, 0, 7, 4, 18, 18, 24
 *
 * 16:06:03.149 Roulette 3 - Macao: 35, 31, 17, 25, 0, 10, 2, 16, 36, 36, 34,
 * 35, 31, 22, 3, 0, 7, 4, 18, 18
 *
 *
 *
 * 15:59:59.266 Roulette 8 - Indian: 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29,
 * 17, 36, 31, 16, 12, 14, 1, 23, 25
 *
 * 16:00:59.954 Roulette 8 - Indian: 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31,
 * 29, 17, 36, 31, 16, 12, 14, 1, 23
 *
 * 16:02:00.660 Roulette 8 - Indian: 15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8,
 * 31, 29, 17, 36, 31, 16, 12, 14
 *
 * 16:03:01.193 Roulette 8 - Indian: 20, 15, 4, 5, 16, 13, 15, 19, 7, 11, 31,
 * 15, 8, 31, 29, 17, 36, 31, 16, 12
 *
 * 16:04:01.885 Roulette 8 - Indian: 36, 33, 20, 15, 4, 5, 16, 13, 15, 19, 7,
 * 11, 31, 15, 8, 31, 29, 17, 36, 31
 *
 * 16:05:02.486 Roulette 8 - Indian: 8, 36, 33, 20, 15, 4, 5, 16, 13, 15, 19, 7,
 * 11, 31, 15, 8, 31, 29, 17, 36
 *
 * 16:06:03.139 Roulette 8 - Indian: 36, 8, 36, 33, 20, 15, 4, 5, 16, 13, 15,
 * 19, 7, 11, 31, 15, 8, 31, 29, 17
 *
 *
 *
 * 15:59:59.267 Roulette 10 - Ruby: 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15,
 * 34, 1, 12, 29, 27, 25, 1, 14
 *
 * 16:00:59.877 Roulette 10 - Ruby: 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26,
 * 15, 34, 1, 12, 29, 27, 25, 1
 *
 * 16:02:00.621 Roulette 10 - Ruby: 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24,
 * 14, 26, 15, 34, 1, 12, 29, 27
 *
 * 16:03:01.286 Roulette 10 - Ruby: 34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25,
 * 24, 14, 26, 15, 34, 1, 12, 29
 *
 * 16:04:02.018 Roulette 10 - Ruby: 9, 34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15,
 * 25, 24, 14, 26, 15, 34, 1, 12
 *
 * 16:05:02.568 Roulette 10 - Ruby: 25, 30, 9, 34, 14, 2, 22, 31, 5, 9, 25, 6,
 * 9, 15, 25, 24, 14, 26, 15, 34
 *
 * 16:06:03.216 Roulette 10 - Ruby: 34, 25, 30, 9, 34, 14, 2, 22, 31, 5, 9, 25,
 * 6, 9, 15, 25, 24, 14, 26, 15
 *
 *
 *
 * 15:59:59.271 Mega Roulette: 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18,
 * 30, 0, 4, 5, 17, 21, 3
 *
 * 16:00:59.954 Mega Roulette: 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24,
 * 8, 18, 30, 0, 4, 5, 17
 *
 * 16:02:00.615 Mega Roulette: 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9,
 * 24, 8, 18, 30, 0, 4, 5
 *
 * 16:03:01.304 Mega Roulette: 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17,
 * 9, 24, 8, 18, 30, 0, 4
 *
 * 16:04:01.889 Mega Roulette: 3, 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28,
 * 17, 9, 24, 8, 18, 30, 0
 *
 * 16:05:02.496 Mega Roulette: 0, 3, 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36,
 * 28, 17, 9, 24, 8, 18, 30
 *
 * 16:06:03.237 Mega Roulette: 35, 20, 0, 3, 36, 33, 35, 28, 13, 31, 28, 9, 8,
 * 13, 36, 28, 17, 9, 24, 8
 *
 *
 *
 * 15:59:59.272 Roulette 9 - The Club: 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0,
 * 15, 22, 19, 34, 5, 5, 5, 30, 31
 *
 * 16:00:59.955 Roulette 9 - The Club: 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25,
 * 0, 15, 22, 19, 34, 5, 5, 5, 30
 *
 * 16:02:00.636 Roulette 9 - The Club: 32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12,
 * 25, 25, 0, 15, 22, 19, 34, 5, 5
 *
 * 16:03:01.216 Roulette 9 - The Club: 14, 32, 18, 15, 22, 5, 6, 5, 10, 9, 17,
 * 12, 25, 25, 0, 15, 22, 19, 34, 5
 *
 * 16:04:02.025 Roulette 9 - The Club: 26, 36, 14, 32, 18, 15, 22, 5, 6, 5, 10,
 * 9, 17, 12, 25, 25, 0, 15, 22, 19
 *
 * 16:05:02.479 Roulette 9 - The Club: 0, 26, 36, 14, 32, 18, 15, 22, 5, 6, 5,
 * 10, 9, 17, 12, 25, 25, 0, 15, 22
 *
 * 16:06:03.137 Roulette 9 - The Club: 17, 22, 0, 26, 36, 14, 32, 18, 15, 22, 5,
 * 6, 5, 10, 9, 17, 12, 25, 25, 0
 *
 *
 *
 * 15:59:59.273 Speed Roulette 1: 2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11,
 * 1, 26, 8, 20, 0, 22, 2, 10
 *
 * 16:00:59.876 Speed Roulette 1: 21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21,
 * 8, 11, 1, 26, 8, 20, 0, 22
 *
 * 16:02:00.531 Speed Roulette 1: 6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22,
 * 11, 21, 8, 11, 1, 26, 8, 20
 *
 * 16:03:01.303 Speed Roulette 1: 0, 21, 6, 11, 21, 31, 2, 27, 23, 21, 10, 15,
 * 27, 22, 11, 21, 8, 11, 1, 26
 *
 * 16:04:02.024 Speed Roulette 1: 23, 29, 0, 21, 6, 11, 21, 31, 2, 27, 23, 21,
 * 10, 15, 27, 22, 11, 21, 8, 11
 *
 * 16:05:02.581 Speed Roulette 1: 9, 24, 23, 29, 0, 21, 6, 11, 21, 31, 2, 27,
 * 23, 21, 10, 15, 27, 22, 11, 21
 *
 * 16:06:03.139 Speed Roulette 1: 6, 10, 9, 24, 23, 29, 0, 21, 6, 11, 21, 31, 2,
 * 27, 23, 21, 10, 15, 27, 22
 */
@Ignore
public class RealLifeTest {

    private static final String ROULETTE_1_AZURE_TABLE_NAME = "Roulette 1 - Azure";
    private static final String AUTO_ROULETTE_1_TABLE_NAME = "Auto-Roulette 1";
    private static final String ROULETTE_2_TABLE_NAME = "Roulette 2";
    private static final String ROULETTE_3_MACAO_TABLE_NAME = "Roulette 3 - Macao";
    private static final String ROULETTE_8_INDIAN_TABLE_NAME = "Roulette 8 - Indian";
    private static final String ROULETTE_10_RUBY_TABLE_NAME = "Roulette 10 - Ruby";
    private static final String MEGA_ROULETTE_TABLE_NAME = "Mega Roulette";
    private static final String ROULETTE_9_THE_CLUB_TABLE_NAME = "Roulette 9 - The Club";
    private static final String SPEED_ROULETTE_1_TABLE_NAME = "Speed Roulette 1";

    @Test
    public void testRoulette1Azure() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("23, 25, 2, 2, 27, 34, 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0, 18, 3, 22, 36, 30, 15, 6");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(ROULETTE_1_AZURE_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testAutoRoulette1() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("11, 23, 14, 21, 12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35, 30, 4, 33, 27, 26, 21, 35");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(AUTO_ROULETTE_1_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testRoulette2() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("23, 17, 17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5, 0, 30, 29, 20, 0, 0");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(ROULETTE_2_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testRoulette3Macao() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("35, 31, 17, 25, 0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24, 5, 10, 16, 21, 0, 21, 13, 31");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(ROULETTE_3_MACAO_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testRoulette8Indian() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("36, 8, 36, 33, 20, 15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36, 31, 16, 12, 14, 1, 23, 25");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(ROULETTE_8_INDIAN_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testRoulette10Ruby() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("34, 25, 30, 9, 34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34, 1, 12, 29, 27, 25, 1, 14");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(ROULETTE_10_RUBY_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testMegaRoulette() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("35, 20, 0, 3, 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30, 0, 4, 5, 17, 21, 3");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(MEGA_ROULETTE_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testRoulette9TheClub() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("17, 22, 0, 26, 36, 14, 32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22, 19, 34, 5, 5, 5, 30, 31");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(ROULETTE_9_THE_CLUB_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    @Test
    public void testSpeedRoulette1() throws Exception {
        final List<Number> correctlySynchronizedNumbers = parse("6, 10, 9, 24, 23, 29, 0, 21, 6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11, 1, 26, 8, 20, 0, 22, 2, 10");
        final List<List<Number>> numbersFromRoulette = generateListsOfNumbers(SPEED_ROULETTE_1_TABLE_NAME);
        final History history = new History("Best roulette", "", "");
        
        for(List<Number> numbers : numbersFromRoulette) {
            history.append(numbers);
        }
        
        final List<Number> synchronizedNumbers = history.getSpinsAsNumbers();
        assertThat(synchronizedNumbers, is(correctlySynchronizedNumbers));
    }

    private List<List<Number>> generateListsOfNumbers(String tableName) {
        List<List<Number>> lists = new ArrayList<>();

        switch (tableName) {
            case ROULETTE_1_AZURE_TABLE_NAME:
                lists.add(parse("4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0, 18, 3, 22, 36, 30, 15, 6"));
                lists.add(parse("32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0, 18, 3, 22, 36, 30"));
                lists.add(parse("1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0, 18, 3, 22, 36"));
                lists.add(parse("34, 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0, 18, 3, 22"));
                lists.add(parse("2, 27, 34, 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0, 18"));
                lists.add(parse("2, 2, 27, 34, 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15, 25, 0"));
                lists.add(parse("23, 25, 2, 2, 27, 34, 1, 32, 31, 4, 31, 21, 6, 18, 31, 0, 2, 33, 5, 15"));
                break;

            case AUTO_ROULETTE_1_TABLE_NAME:
                lists.add(parse("35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35, 30, 4, 33, 27, 26, 21, 35"));
                lists.add(parse("29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35, 30, 4, 33, 27, 26"));
                lists.add(parse("25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35, 30, 4, 33, 27"));
                lists.add(parse("12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35, 30, 4, 33"));
                lists.add(parse("21, 12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35, 30, 4"));
                lists.add(parse("23, 14, 21, 12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28, 35"));
                lists.add(parse("11, 23, 14, 21, 12, 25, 29, 19, 35, 8, 22, 10, 2, 5, 36, 34, 24, 16, 14, 28"));
                break;

            case ROULETTE_2_TABLE_NAME:
                lists.add(parse("24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5, 0, 30, 29, 20, 0, 0"));
                lists.add(parse("31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5, 0, 30, 29, 20"));
                lists.add(parse("34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5, 0, 30, 29"));
                lists.add(parse("16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5, 0, 30"));
                lists.add(parse("17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34, 5"));
                lists.add(parse("17, 17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29, 34"));
                lists.add(parse("23, 17, 17, 31, 16, 34, 31, 25, 24, 3, 25, 29, 35, 35, 2, 35, 10, 10, 14, 29"));
                break;

            case ROULETTE_3_MACAO_TABLE_NAME:
                lists.add(parse("36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24, 5, 10, 16, 21, 0, 21, 13, 31"));
                lists.add(parse("16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24, 5, 10, 16, 21, 0, 21"));
                lists.add(parse("2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24, 5, 10, 16, 21, 0"));
                lists.add(parse("0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24, 5, 10, 16"));
                lists.add(parse("25, 0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24, 5, 10"));
                lists.add(parse("31, 17, 25, 0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18, 24"));
                lists.add(parse("35, 31, 17, 25, 0, 10, 2, 16, 36, 36, 34, 35, 31, 22, 3, 0, 7, 4, 18, 18"));
                break;

            case ROULETTE_8_INDIAN_TABLE_NAME:
                lists.add(parse("16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36, 31, 16, 12, 14, 1, 23, 25"));
                lists.add(parse("5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36, 31, 16, 12, 14, 1, 23"));
                lists.add(parse("15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36, 31, 16, 12, 14"));
                lists.add(parse("20, 15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36, 31, 16, 12"));
                lists.add(parse("36, 33, 20, 15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36, 31"));
                lists.add(parse("8, 36, 33, 20, 15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17, 36"));
                lists.add(parse("36, 8, 36, 33, 20, 15, 4, 5, 16, 13, 15, 19, 7, 11, 31, 15, 8, 31, 29, 17"));
                break;

            case ROULETTE_10_RUBY_TABLE_NAME:
                lists.add(parse("31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34, 1, 12, 29, 27, 25, 1, 14"));
                lists.add(parse("22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34, 1, 12, 29, 27, 25, 1"));
                lists.add(parse("14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34, 1, 12, 29, 27"));
                lists.add(parse("34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34, 1, 12, 29"));
                lists.add(parse("9, 34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34, 1, 12"));
                lists.add(parse("25, 30, 9, 34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15, 34"));
                lists.add(parse("34, 25, 30, 9, 34, 14, 2, 22, 31, 5, 9, 25, 6, 9, 15, 25, 24, 14, 26, 15"));
                break;

            case MEGA_ROULETTE_TABLE_NAME:
                lists.add(parse("13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30, 0, 4, 5, 17, 21, 3"));
                lists.add(parse("35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30, 0, 4, 5, 17"));
                lists.add(parse("33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30, 0, 4, 5"));
                lists.add(parse("36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30, 0, 4"));
                lists.add(parse("3, 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30, 0"));
                lists.add(parse("0, 3, 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8, 18, 30"));
                lists.add(parse("35, 20, 0, 3, 36, 33, 35, 28, 13, 31, 28, 9, 8, 13, 36, 28, 17, 9, 24, 8"));
                break;

            case ROULETTE_9_THE_CLUB_TABLE_NAME:
                lists.add(parse("22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22, 19, 34, 5, 5, 5, 30, 31"));
                lists.add(parse("15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22, 19, 34, 5, 5, 5, 30"));
                lists.add(parse("32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22, 19, 34, 5, 5"));
                lists.add(parse("14, 32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22, 19, 34, 5"));
                lists.add(parse("26, 36, 14, 32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22, 19"));
                lists.add(parse("0, 26, 36, 14, 32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0, 15, 22"));
                lists.add(parse("17, 22, 0, 26, 36, 14, 32, 18, 15, 22, 5, 6, 5, 10, 9, 17, 12, 25, 25, 0"));
                break;

            case SPEED_ROULETTE_1_TABLE_NAME:
                lists.add(parse("2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11, 1, 26, 8, 20, 0, 22, 2, 10"));
                lists.add(parse("21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11, 1, 26, 8, 20, 0, 22"));
                lists.add(parse("6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11, 1, 26, 8, 20"));
                lists.add(parse("0, 21, 6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11, 1, 26"));
                lists.add(parse("23, 29, 0, 21, 6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21, 8, 11"));
                lists.add(parse("9, 24, 23, 29, 0, 21, 6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22, 11, 21"));
                lists.add(parse("6, 10, 9, 24, 23, 29, 0, 21, 6, 11, 21, 31, 2, 27, 23, 21, 10, 15, 27, 22"));
                break;
        }

        return lists;
    }

    private List<Number> parse(String string) {
        List<Number> numbers = new ArrayList<>();

        for (String chunk : string.split(", ")) {
            numbers.add(new Number(chunk));
        }

        return numbers;
    }

}
