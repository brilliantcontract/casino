package bc.rlt.scrapers.pragmatic.performance;

import bc.rlt.scrapers.pragmatic.*;
import bc.rlt.essential.Config;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Ignore;
import org.mockito.Mockito;

/**
 * Fetch data from 9 table every 2 seconds. Test duration is 2 hours.
 */
@Ignore
public class Performance4Test {

    private static final List<String> SESSION_IDS = Arrays.asList(new String[]{
        "a-SIPzoQgMPGVXuIebv_h_tVqr1dckt6-i3YfpNzoSwq5ELLD6SH!1716413934",
        "coqIQJgTqU_2dfAQYqi52IKzz7un2RU4P8_WLkucfTprmFlZsnmd!1270971755",
        "xgqIQKBUnlv31rq0AlU1_sqiE-AyyG4ANUkH4NV0fwy0LY0HObun!1203978714",
        "oX-IQKnYKMY452d0qCbPgwNoy_6ed8hDgsVMpNr_faoU_xQ3kwMB!-458316126"
    });
    private static final List<String> TABLE_NAMES = Arrays.asList(
            "Mega Roulette",
            "Roulette 1 - Azure",
            "Speed Roulette 1",
            "Roulette 2",
            "Auto-Roulette 1",
            "Roulette 3 - Macao",
            "Roulette 8 - Indian",
            "Roulette 9 - The Club",
            "Roulette 10 - Ruby"
    );

    private static final Integer PAUSE_MS = 2_000;
    private static final Integer ITERATIONS = 7200;

    @Test
    public void test() {
        Config config = Config.create();
        config.setRouletteWebsiteSessionId(SESSION_IDS);

        History history = null;
        Histories histories = Histories.create();
        PragmaticScraper scraper = new PragmaticScraper();

        for (int iteration = 1; iteration <= ITERATIONS; iteration++) {
            System.out.println("Iteration " + iteration + "/" + ITERATIONS);
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

            scraper.asyncScrapeTables(TABLE_NAMES);
            scraper.waitAsyncScrapeTablesCompleted(TABLE_NAMES);

//            history = histories.getHistory(TABLE_NAMES.get(0));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(1));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(2));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(3));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(4));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(5));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(6));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(7));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));
//
//            history = histories.getHistory(TABLE_NAMES.get(8));
//            assertThat(history == null, is(false));
//            assertThat(history.getSpins().size(), greaterThanOrEqualTo(Config.NUMBER_OF_SPINS_TO_ANALYZE));

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
