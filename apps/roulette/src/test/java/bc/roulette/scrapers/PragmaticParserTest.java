package bc.roulette.scrapers;

import bc.roulette.history.Number;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class PragmaticParserTest {

    @Test
    public void test() throws Exception {
        String textJson = "{\"errorCode\":\"0\",\"description\":\"ok\",\"history\":[{\"gameId\":\"291849803\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"28 Black\",\"megaRoulette\":false},{\"gameId\":\"291847803\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"7  Red\",\"megaRoulette\":false},{\"gameId\":\"291846503\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"29 Black\",\"megaRoulette\":false},{\"gameId\":\"291845003\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"16 Red\",\"megaRoulette\":false},{\"gameId\":\"291843503\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"33 Black\",\"megaRoulette\":false},{\"gameId\":\"291842003\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"7  Red\",\"megaRoulette\":false},{\"gameId\":\"291840603\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"8  Black\",\"megaRoulette\":false},{\"gameId\":\"291839303\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"20 Black\",\"megaRoulette\":false},{\"gameId\":\"291837803\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"7  Red\",\"megaRoulette\":false},{\"gameId\":\"291836403\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"29 Black\",\"megaRoulette\":false},{\"gameId\":\"291835103\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"27 Red\",\"megaRoulette\":false},{\"gameId\":\"291833803\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"32 Red\",\"megaRoulette\":false},{\"gameId\":\"291832403\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"33 Black\",\"megaRoulette\":false},{\"gameId\":\"291831003\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"2  Black\",\"megaRoulette\":false},{\"gameId\":\"291829503\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"34 Red\",\"megaRoulette\":false},{\"gameId\":\"291828103\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"28 Black\",\"megaRoulette\":false},{\"gameId\":\"291826703\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"15 Black\",\"megaRoulette\":false},{\"gameId\":\"291825403\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"10 Black\",\"megaRoulette\":false},{\"gameId\":\"291824103\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"30 Red\",\"megaRoulette\":false},{\"gameId\":\"291822803\",\"gameType\":\"0000000000000001\",\"betCount\":0,\"playerCount\":0,\"playerWinCount\":0,\"gameResult\":\"0  Green\",\"megaRoulette\":false}],\"numberOfGames\":20}";
        List<Number> expectedNumbers = expectedNumbers();
        
        PragmaticParser parser = new PragmaticParser();
        List<Number> numbers = parser.parseJson(textJson);
        
        assertThat(numbers.size(), is(20));
        assertThat(numbers, contains(expectedNumbers.toArray()));
    }
    
    private List<Number> expectedNumbers() {
        List<Number> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(new Number(28));
        expectedNumbers.add(new Number(7));
        expectedNumbers.add(new Number(29));
        expectedNumbers.add(new Number(16));
        expectedNumbers.add(new Number(33));
        expectedNumbers.add(new Number(7));
        expectedNumbers.add(new Number(8));
        expectedNumbers.add(new Number(20));
        expectedNumbers.add(new Number(7));
        expectedNumbers.add(new Number(29));
        expectedNumbers.add(new Number(27));
        expectedNumbers.add(new Number(32));
        expectedNumbers.add(new Number(33));
        expectedNumbers.add(new Number(2));
        expectedNumbers.add(new Number(34));
        expectedNumbers.add(new Number(28));
        expectedNumbers.add(new Number(15));
        expectedNumbers.add(new Number(10));
        expectedNumbers.add(new Number(30));
        expectedNumbers.add(new Number(0));
        
        return expectedNumbers;
    }

}