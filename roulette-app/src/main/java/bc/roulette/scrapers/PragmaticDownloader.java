package bc.roulette.scrapers;

import bc.roulette.Config;
import bc.roulette.CriticalException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

class PragmaticDownloader {

    private final Http http = new Http();
    private final Config config = Config.create();

    String downloadFullHistoryPage(final String tableId)
            throws CriticalException {
        URL historyPageUrl = generateHistoryUrl(tableId, Config.TOTAL_NUMBER_OF_SPINS_IN_PRAGMATIC_HISTORY);
        String historyPageContents = http.downloadCriticalTextFile(historyPageUrl);

        return historyPageContents;
    }

    String downloadShortHistoryPage(final String tableId)
            throws CriticalException {
        URL historyPageUrl = generateHistoryUrl(tableId, Config.NUMBER_OF_SPINS_TO_ANALYZE);
        String historyPageContents = http.downloadCriticalTextFile(historyPageUrl);

        return historyPageContents;
    }

    /**
     *
     * @param tableId
     * @param numbeOfGamesToShow
     * @return Could return null.
     */
    URL generateHistoryUrl(final String tableId, final Integer numbeOfGamesToShow) {
        final String historyUrlTemplate = "https://gs3.pragmaticplaylive.net/api/ui/statisticHistory?tableId=<TABLE-ID>&numberOfGames=<NUMBER-OF-GAMES>&JSESSIONID=<JSESSIONID>&ck=1649254961351&game_mode=roulette_desktop";

        final String historyUrl = historyUrlTemplate
                .replace("<TABLE-ID>", tableId)
                .replace("<NUMBER-OF-GAMES>", numbeOfGamesToShow.toString())
                .replace("<JSESSIONID>", config.getRouletteWebsiteSessionId());

        URL url = null;
        try {
            url = new URL(historyUrl);
        } catch (MalformedURLException ex) {
            Logger.getLogger(PragmaticScraper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return url;
    }
}
