package bc.rlt.websocket.listeners.pragmatic;

import bc.rlt.essential.Config;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.websocket.*;

@ClientEndpoint
public class PragmaticWebsocketListener {

    private ClientEndpointConfig clientEndpointConfig;
    private Session session;
    private final WebSocketContainer container;
    private String lastServerMessage = "";
    private final Config config = Config.create();
    private String tableId = "";

    public PragmaticWebsocketListener() {
        this.container = ContainerProvider.getWebSocketContainer();
    }

    @OnOpen
    public void onOpen(Session session, EndpointConfig endpointConfig) {
        this.clientEndpointConfig = (ClientEndpointConfig) endpointConfig;
        System.out.println("[onOpen] Connection to Pragmatic websocket server established.");
    }

    @OnMessage
    public void onMessage(String message) {
        this.lastServerMessage = message;
        System.out.println("[onMessage] Message from roulette server: " + message);
    }

    @OnMessage
    public void onMessage(ByteBuffer bytes) {
        System.out.println("Handle byte buffer");
        System.out.println("[onMessage] Bytes converted to string: " + convertByteBufferToString(bytes, Charset.defaultCharset()));
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) throws DeploymentException, IOException, URISyntaxException {
        System.out.println("[onClose] Session is closed");
        reconnect();
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("[onError] Error communicating with server: " + error.getMessage());
    }

    public void send(String message) {
        System.out.println("[] Send message: " + message);
        this.session.getAsyncRemote().sendText(message);
    }

    public void send(ByteBuffer bytes) {
        this.session.getAsyncRemote().sendBinary(bytes);
    }

    public void close() throws IOException {
        this.session.close();
    }

    public void connect(String tableId) throws DeploymentException, IOException, URISyntaxException {
        // @todo Web socket access point is selected not by table id.
        this.tableId = tableId;
        URI wsAccessPoint = Config.ROULETTE_TABLES_CONFIGS.get(0).composeWsAccessPoint(config);
        
        // @todo find way to use web socket access point of multiple tables at once.
        wsAccessPoint = new URI("wss://gs7.pragmaticplaylive.net/game?JSESSIONID=" + config.getPragmaticJsessionid());
        
        System.out.println("Pragmatic websocket server URI: " + wsAccessPoint);
        this.session = container.connectToServer(this, wsAccessPoint);
    }
    
    public void reconnect() throws DeploymentException, IOException, URISyntaxException {
        connect(this.tableId);
    }

    public Boolean isConnected() {
        return session.isOpen();
    }

    public String getLastServerMessage() {
        return this.lastServerMessage;
    }

    private String convertByteBufferToString(ByteBuffer buffer, Charset charset) {
        byte[] bytes;
        if (buffer.hasArray()) {
            bytes = buffer.array();
        } else {
            bytes = new byte[buffer.remaining()];
            buffer.get(bytes);
        }

        return new String(bytes, charset);
    }
}
