package bc.rlt.scrapers.pragmatic;

import bc.rlt.essential.Config;
import bc.rlt.essential.CriticalException;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import bc.rlt.history.Number;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

final public class PragmaticScraper {

    private static final Logger LOGGER = LogManager.getLogger();

    private final Histories histories = Histories.create();
    private final Map<String, Boolean> scrapingTablesCompletnesStatuses = new HashMap<>();

    public PragmaticScraper() {
        initializeHistories();
    }

    /*
        Get full history from Pragmatic website.
     */
    public void initialze() {
        initializeDownloadFullHistories();
    }

    public void scrapeTable(String tableName) {
        scrapeTable(tableName, false);
    }

    public void scrapeFullTable(String tableName) {
        scrapeTable(tableName, true);
    }

    private void scrapeTable(String tableName, Boolean scrapeFullHistory) {
        Configurator.setAllLevels(LOGGER.getName(), Level.getLevel(Level.ALL.name()));

        scrapingTablesCompletnesStatuses.put(tableName, false);

        PragmaticDownloader downloader = new PragmaticDownloader();
        PragmaticParser parser = new PragmaticParser();
        History history = histories.getHistory(tableName);

        String page = "";
        try {
            if (scrapeFullHistory) {
                page = downloader.downloadFullHistoryPage(history.getTableId());
            } else {
                page = downloader.downloadShortHistoryPage(history.getTableId());
            }
        } catch (CriticalException ex) {
            LOGGER.error("Cannot download full history page. Table ID is " + history.getTableId(), ex);
            System.exit(1);
        }

        List<Number> numbers = new ArrayList();
        try {
            numbers = parser.parseJson(page);
        } catch (CriticalException ex) {
            LOGGER.error("Cannot parse raw JSON code and convert it to Numbers list.", ex);
        }

        try {
            log(numbers, tableName);
            history.append(numbers);
        } catch (CriticalException ex) {
            LOGGER.error("Numbers cannot be append to history.", ex);
        }

        System.out.printf(
                "%s roulette, \"%s\" table was scraped.\n",
                history.getRouletteName(),
                history.getTableName()
        );

        scrapingTablesCompletnesStatuses.put(tableName, true);
    }

    private void initializeHistories() {
        histories.initializeAllPragmaticTables();
    }

    private void initializeDownloadFullHistories() {
        for (History history : histories) {
            scrapeFullTable(history.getTableName());
        }
    }

    public void asyncScrapeTable(String tableName) {
        new Thread(() -> {
            scrapeTable(tableName);
        }).start();
    }

    public Boolean isAsyncScrapeTableCompleted(String tableName) {
        sleep(50);

        if (scrapingTablesCompletnesStatuses.get(tableName) == null) {
            return true;
        }

        return scrapingTablesCompletnesStatuses.get(tableName);
    }

    public void waitAsyncScrapeTableCompleted(String tableName) {
        while (!isAsyncScrapeTableCompleted(tableName)) {
        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            LOGGER.error("Sleep method was interrupted.", ex);
        }
    }

    public void asyncScrapeTables(List<String> tablesNames) {
        for (String tableName : tablesNames) {
            asyncScrapeTable(tableName);
        }
    }

    public void waitAsyncScrapeTablesCompleted(List<String> tablesNames) {
        for (String tableName : tablesNames) {
            waitAsyncScrapeTableCompleted(tableName);
        }
    }

    private void log(List<Number> numbers, String tableName) {
        String message = tableName + ": ";

        for (Number number : numbers) {
            message += number.getValue() + ", ";
        }
        message = message.replaceAll(", $", "");

        LOGGER.info("Collected numbers: " + message);
    }

}
