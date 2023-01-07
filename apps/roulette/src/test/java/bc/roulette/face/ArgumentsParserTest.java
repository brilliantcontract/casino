package bc.roulette.face;

import bc.roulette.Config;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.Mockito;

public class ArgumentsParserTest {

    private final ArgumentsParser parser = new ArgumentsParser();
    private final Config config = Config.create();

    @Test
    public void test() throws Exception {
        String[] args = {"-roulette", "pragmatic", "-session", "wSY4l4UK8U-h7H2RkobSt6ljIC9Z5o9cHe3FB1gcI1ziakn-9x-B!-894986081"};
        parser.parse(args);

        assertThat(config.getRouletteNameForMonitoring(), is("pragmatic"));
        assertThat(config.getRouletteWebsiteSessionId(), is("wSY4l4UK8U-h7H2RkobSt6ljIC9Z5o9cHe3FB1gcI1ziakn-9x-B!-894986081"));
    }

}
