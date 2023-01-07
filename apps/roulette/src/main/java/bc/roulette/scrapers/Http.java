package bc.roulette.scrapers;

import bc.roulette.Config;
import bc.roulette.CriticalException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

final class Http {

    String downloadTextFile(final URL url) throws IOException {
        URLConnection connection = url.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }

    String downloadCriticalTextFile(URL url) throws CriticalException {
        String pageContents = "";

        for (Integer tries = 1; tries <= Config.NUMBER_OF_TRIES_TO_DOWNLOAD_CRITICAL_FILE; tries++) {
            try {
                pageContents = downloadTextFile(url);
                break;
            } catch (IOException ex) {
                Logger.getLogger(Http.class.getName()).log(Level.WARNING, ex.getMessage() + "Cannot download critical file. Try " + tries + "/" + Config.NUMBER_OF_TRIES_TO_DOWNLOAD_CRITICAL_FILE + ". URL is " + url);
                sleep(Config.SLEEP_BETWEEN_DOWNLOAD_CRITICAL_FILE_TRIES);
            }

            if (tries >= Config.NUMBER_OF_TRIES_TO_DOWNLOAD_CRITICAL_FILE) {
                Logger.getLogger(Http.class.getName()).log(Level.SEVERE, "Failed to download critical file. URL " + url);
                throw new CriticalException();
            }
        }
        
        return pageContents;
    }

    void sleep(Integer ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Http.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
