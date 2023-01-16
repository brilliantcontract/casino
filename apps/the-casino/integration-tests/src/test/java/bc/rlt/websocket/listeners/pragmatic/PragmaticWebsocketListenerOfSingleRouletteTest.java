package bc.rlt.websocket.listeners.pragmatic;

import bc.rlt.TestConfig;
import bc.rlt.essential.Config;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Ignore;
import org.mockito.Mockito;
import static bc.rlt.essential.Config.ROULETTE_TABLES_CONFIGS;

public class PragmaticWebsocketListenerOfSingleRouletteTest {

    //@Ignore
    @Test
    public void test() throws Exception {
        Config config = Config.create();
        config.setPragmaticJsessionid(TestConfig.JSESSIONID);

        Histories histories = Histories.create();
        histories.initializeAllPragmaticTables();
        History history = histories.getHistory(TestConfig.TABLE_NAME);

        PragmaticWebsocketListener pragmaticListener = new PragmaticWebsocketListener();
        pragmaticListener.connect(TestConfig.TABLE_HTTP_ID);

        while (true) {
            sleep(10_000);
            pragmaticListener.send("<ping time='" + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) + "'></ping>");
        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(PragmaticWebsocketListenerOfSingleRouletteTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
