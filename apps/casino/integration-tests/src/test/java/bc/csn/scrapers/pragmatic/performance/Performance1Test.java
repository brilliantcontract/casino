package bc.csn.scrapers.pragmatic.performance;

import bc.csn.TestConfig;
import bc.csn.scrapers.pragmatic.*;
import bc.csn.essential.Config;
import bc.csn.history.Histories;
import bc.csn.history.History;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Ignore;
import org.mockito.Mockito;

/**
 * Fetch data from 1 table every 15 seconds. Test duration is 2 hours.
 */
@Ignore
public class Performance1Test {

    private static final String TABLE_NAME = "Mega Roulette";

    private static final Integer PAUSE_MS = 15_000;
    private static final Integer ITERATIONS = 480;

    @Test
    public void test() {
        Config config = Config.create();
        config.setRouletteWebsiteSessionId(TestConfig.JSESSIONID);

        Histories histories = Histories.create();
        PragmaticScraper scraper = new PragmaticScraper();

        for (int iteration = 1; iteration <= ITERATIONS; iteration++) {
            System.out.println("Iteration " + iteration + "/" + ITERATIONS);
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            
            assertThat(scraper.isAsyncScrapeTableCompleted(TABLE_NAME), is(true));
            scraper.asyncScrapeTable(TABLE_NAME);
            assertThat(scraper.isAsyncScrapeTableCompleted(TABLE_NAME), is(false));
            scraper.waitAsyncScrapeTableCompleted(TABLE_NAME);
            assertThat(scraper.isAsyncScrapeTableCompleted(TABLE_NAME), is(true));

            History history = histories.getHistory(TABLE_NAME);

            assertThat(history == null, is(false));
            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
            
            sleep(PAUSE_MS);
        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(PragmaticScraper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
