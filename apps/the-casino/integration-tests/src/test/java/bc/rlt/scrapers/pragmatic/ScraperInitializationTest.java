package bc.rlt.scrapers.pragmatic;

import bc.rlt.TestConfig;
import bc.rlt.essential.Config;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Ignore;
import org.mockito.Mockito;

public class ScraperInitializationTest {

    private static final String TABLE_NAME = "Mega Roulette";

    //@Ignore
    @Test
    public void test() {
        Config config = Config.create();
        config.setRouletteWebsiteSessionId(TestConfig.JSESSIONID);

        PragmaticScraper scraper = new PragmaticScraper();
        scraper.initialze();

        Histories histories = Histories.create();
        History history = histories.getHistory(TABLE_NAME);

        assertThat(history == null, is(false));
        assertThat(history.getSpins().size(), is(500));
        System.out.println("");
    }

}
