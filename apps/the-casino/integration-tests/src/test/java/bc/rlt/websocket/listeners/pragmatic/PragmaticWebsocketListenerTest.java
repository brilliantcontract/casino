package bc.rlt.websocket.listeners.pragmatic;

import bc.rlt.TestConfig;
import bc.rlt.essential.Config;
import static bc.rlt.essential.Config.PRAGMATIC_TABLE_IDS;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Ignore;
import org.mockito.Mockito;

public class PragmaticWebsocketListenerTest {

    //@Ignore
    @Test
    public void test() throws Exception {
        Config config = Config.create();
        config.setPragmaticWebsocketServerAddress(TestConfig.PRAGMATIC_WEBSOCKET_SEVRE_ADDRESS);
        config.setPragmaticJsessionid(TestConfig.JSESSIONID);
        
        Histories histories = Histories.create();
        histories.initializeAllPragmaticTables();
        History history = histories.getHistory("Mega Roulette");
        
        PragmaticWebsocketListener pragmaticListener = new PragmaticWebsocketListener();
        pragmaticListener.connect(TestConfig.TABLE_ID);
        
        while (true) {
            sleep(10_000);
        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(PragmaticWebsocketListenerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
