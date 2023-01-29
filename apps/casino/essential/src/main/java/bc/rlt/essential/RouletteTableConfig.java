package bc.csn.essential;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RouletteTableConfig {

    private final ROULETTE_NAME roulette;
    private final String name;
    private final String httpId;
    private final String wsId;
    private final String wsServer;

    RouletteTableConfig(ROULETTE_NAME roulette, String table, String httpId, String wsId, String server) {
        this.roulette = roulette;
        this.name = table;
        this.httpId = httpId;
        this.wsId = wsId;
        this.wsServer = server;
    }

    public ROULETTE_NAME getRoulette() {
        return roulette;
    }

    public String getName() {
        return name;
    }

    public String getHttpId() {
        return httpId;
    }

    public String getWsId() {
        return wsId;
    }

    public String getWsServer() {
        return wsServer;
    }
    
    public URI composeWsAccessPoint(Config config) {
        URI wsAccessPointUri = null;
        
        try {
            wsAccessPointUri = new URI("wss://" + wsServer + "/game?JSESSIONID=" + config.getPragmaticJsessionid() + "&tableId=" + httpId);
        } catch (URISyntaxException ex) {
            Logger.getLogger(RouletteTableConfig.class.getName()).log(Level.SEVERE, "Fail to generate Web Sockets access point URI.", ex);
        }
        
        return wsAccessPointUri;
    }
    
}
