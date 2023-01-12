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

public class ScraperScrapeTableInAsyncModeTest {

    private static final String TABLE_NAME = "Mega Roulette";

    @Ignore
    @Test
    public void test() {
        Config config = Config.create();
        config.setRouletteWebsiteSessionId(TestConfig.JSESSIONID);

        PragmaticScraper scraper = new PragmaticScraper();
        scraper.asyncScrapeTable(TABLE_NAME);
        scraper.waitAsyncScrapeTableCompleted(TABLE_NAME);

        Histories histories = Histories.create();
        History history = histories.getHistory(TABLE_NAME);

        assertThat(history == null, is(false));
        assertThat(history.getSpins().size(), is(Config.NUMBER_OF_SPINS_TO_ANALYZE));
    }

}
