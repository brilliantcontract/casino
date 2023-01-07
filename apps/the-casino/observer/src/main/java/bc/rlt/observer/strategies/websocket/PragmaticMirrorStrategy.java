package bc.rlt.observer.strategies.websocket;

import bc.rlt.essential.CriticalException;
import bc.rlt.strategies.RouletteMirrorStrategy;
import bc.rlt.strategies.RouletteMirrorStrategyDemo;

import javax.ejb.EJB;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/websockets/pragmatic-mirror-strategy")
public class PragmaticMirrorStrategy {

    @EJB(beanName = "roulette-mirror-strategy")
    RouletteMirrorStrategy rouletteMirrorStrategy;

    private static final Logger logger = Logger.getLogger(PragmaticMirrorStrategy.class.getName());

    @OnMessage
    public String onMessage(String message, Session session) throws CriticalException {
        logger.log(Level.INFO, "Received message: {0}", message);
        return new RouletteMirrorStrategyDemo().calculate("color", "Mega Roulette");
    }

    @OnOpen
    public void onOpen(Session session) throws IOException {
        session.getBasicRemote().sendText("* The session is open.");
        logger.info("The session is open.");
    }

    @OnClose
    public void onClose(Session session) throws IOException {
        logger.info("The session is close.");
    }

    @OnError
    public void onError(Session session, Throwable error) throws Exception {
        session.getBasicRemote().sendText("* Error happen. " + error.getMessage());
        logger.info("Error happen. " + error.getMessage());
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
