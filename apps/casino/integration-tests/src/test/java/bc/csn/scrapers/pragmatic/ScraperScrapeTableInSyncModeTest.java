package bc.csn.scrapers.pragmatic;

import bc.csn.TestConfig;
import bc.csn.essential.Config;
import bc.csn.history.Histories;
import bc.csn.history.History;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Ignore;
import org.mockito.Mockito;

public class ScraperScrapeTableInSyncModeTest {

    private static final String TABLE_NAME = "Mega Roulette";

    @Ignore
    @Test
    public void test() {
        Config config = Config.create();
        config.setRouletteWebsiteSessionId(TestConfig.JSESSIONID);

        PragmaticScraper scraper = new PragmaticScraper();
        scraper.scrapeTable(TABLE_NAME);

        Histories histories = Histories.create();
        History history = histories.getHistory(TABLE_NAME);

        assertThat(history == null, is(false));
        assertThat(history.getSpins().size(), is(Config.NUMBER_OF_SPINS_TO_ANALYZE));
        System.out.println("");
    }

}
