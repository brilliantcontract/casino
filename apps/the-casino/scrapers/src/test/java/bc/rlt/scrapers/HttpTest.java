package bc.rlt.scrapers;

import bc.rlt.essential.Config;
import bc.rlt.essential.CriticalException;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class HttpTest {
    
    @Test(expected = CriticalException.class)
    public void testNotExistUrl() throws MalformedURLException, CriticalException {
        // Reduce number of tries and pause in order to run unit test faster.
        Config.NUMBER_OF_TRIES_TO_DOWNLOAD_CRITICAL_FILE = 3;
        Config.SLEEP_BETWEEN_DOWNLOAD_CRITICAL_FILE_TRIES = 1_000;
        
        Http http = new Http();
        http.downloadCriticalTextFile(new URL("https://not-existed-domain-name.com/not-existed-page.not-existed-file-extension"));
    }

    @Test
    public void testPragmaticUrl() throws Exception {
        Http http = new Http();
        String pageContents = http.downloadCriticalTextFile(new URL("https://gs3.pragmaticplaylive.net/api/ui/statisticHistory?tableId=yqpz3ichst2xg439&numberOfGames=5&JSESSIONID=GkkIGcyCfQuTjmw2qSqGpHZsarnx670O7XnscZ-P12qWSpjk2PWO!1056368290&ck=1649254961351&game_mode=roulette_desktop"));

        // This assertion shouldn't be executed ever.
        assertThat(pageContents, is("{\"errorCode\":\"1\",\"description\":\"Invalid user session\"}"));
    }

}
