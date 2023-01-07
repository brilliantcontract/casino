Ping is meant to be sent only from server to client, and browser should answer as soon as possible with Pong OpCode, automatically. So you have not to worry about that on JavaScript level.

The RFC says "An endpoint MAY send a Ping frame any time after the connection is established and before the connection is closed."

In RFC 6455, The WebSocket Protocol, it explicitly states: "NOTE: A Ping frame may serve either as a keepalive or as a means to verify that the remote endpoint is still responsive."

There is no Javascript API to send ping frames or receive pong frames. This is either supported by your browser, or not. There is also no API to enable, configure or detect whether the browser supports and is using ping/pong frames.

WebLogic by default close session if it 60 seconds inactive.

JavaScript WebSocket client sends ping messages only after sending regular text/binary message. WebLogic server never send PING messages to the JavaScript WebSocket client. As well, Java WebSocket client sends ping messages only after sending regular text/binary message.

![JavaScript client and WebLogic server ping/pong messages](https://brilliantcontract.net/drive/notes/javascript-client-and-weblogic-server-ping-pong-messages.png)



### Java WebSocket server PING/PONG methods

Java client method to accept a pong message:

    @OnMessage
    public void onMessage(PongMessage message) {
        System.out.println("Received PONG message.");
    }

Java server method to accept a pong message:

    @OnMessage
    public void onMessage(PongMessage message, Session session) throws IOException {
        LOGGER.log(Level.INFO, "Received PONG message: " + new String(message.getApplicationData().array()));
    }

There is no similar methods for PONG messages.



### Send arbitrary PING/PONG messages by WebSocket client

Java WebSocket client has methods to send PING/PONG messages:

    public void sendPing(String message) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        this.session.getAsyncRemote().sendPing(buffer);
    }

    public void sendPong(String message) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        this.session.getAsyncRemote().sendPong(buffer);
    }

__!!!__ The PING/PONG messages able to transfer a payload.

JavaScript WebSocket client doesn't have similar methods.
