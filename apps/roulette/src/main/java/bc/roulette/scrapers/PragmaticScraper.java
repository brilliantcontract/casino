package bc.roulette.scrapers;

import bc.roulette.Config;
import bc.roulette.CriticalException;
import bc.roulette.history.Histories;
import bc.roulette.history.History;
import bc.roulette.history.Number;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

final public class PragmaticScraper {

    private final PragmaticDownloader downloader = new PragmaticDownloader();
    private final PragmaticParser parser = new PragmaticParser();
    private final PragmaticThread thread = new PragmaticThread();
    private final Histories histories = new Histories();

    /*
        Get full history from Pragmatic website.
     */
    public void initialze() {
        initializeHistories();
        initializeDownloadFullHistories();
    }

    private void initializeHistories() {
        for (Map.Entry<String, String> table : Config.PRAGMATIC_TABLE_IDS.entrySet()) {
            histories.addPragmatic(table.getKey(), table.getValue());
        }
    }

    private void initializeDownloadFullHistories() {
        for (History history : histories) {
            String page = "";
            try {
                page = downloader.downloadFullHistoryPage(history.getTableId());
            } catch (CriticalException ex) {
                Logger.getLogger(PragmaticScraper.class.getName()).log(Level.SEVERE, "Cannot download full history page. Table ID is " + history.getTableId(), ex);
                System.exit(1);
            }

            List<Number> numbers = new ArrayList();
            try {
                numbers = parser.parseJson(page);
            } catch (CriticalException ex) {
                Logger.getLogger(PragmaticScraper.class.getName()).log(Level.SEVERE, "Cannot parse raw JSON code and convert it to Numbers list.", ex);
            }

            try {
                history.append(numbers);
            } catch (CriticalException ex) {
                Logger.getLogger(PragmaticScraper.class.getName()).log(Level.SEVERE, "Numbers cannot be append to history.", ex);
            }

            System.out.printf(
                    "%s roulette, \"%s\" table, \"%s\" id was initialized.\n",
                    history.getRouletteName(),
                    history.getTableName(),
                    history.getTableId()
            );
        }
    }

    /*
        Run thread to monitor Pragmatic website.
     */
    public void startMonitoring() {

    }

    public void stopMonitoring() {

    }

}
