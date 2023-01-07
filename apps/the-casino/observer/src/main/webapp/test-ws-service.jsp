<%@page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous" />
        <link rel="icon" type="image/x-icon" href="/favicon.ico">
        
        <title>Mirror</title>

        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col">
                    <h1>Mirror</h1>

                    <label for="server-url">Server URL:</label>
                    <input type="text" id="server-url" name="server-url" value="ws://localhost:7001/observer-service/websockets/pragmatic-mirror-strategy" class="form-control" /><br />

                    <a href="#" id="connect" class="btn btn-primary">Connect to echo server</a>
                    <a href="#" id="send-message" class="btn btn-primary">Send a message</a>
                    <a href="#" id="disconnect" class="btn btn-primary">Disconnect from echo server</a>
                    <br />

                    <textarea id="log" name="log" class="form-control mt-3" rows="10"></textarea>
                </div>
            </div>
        </div>

        <script>
            var ws;

            $("#connect").click(function (event) {
                event.preventDefault();
                $("#log").val("");

                if ("WebSocket" in window) {
                    log("WebSocket is supported by your Browser!");
                } else {
                    log("WebSocket NOT supported by your Browser!");
                    return;
                }

                var serverUrl = $("#server-url").val();
                ws = new WebSocket(serverUrl);

                ws.onopen = function (event) {
                    log("[open] Connection is established.");
                };

                ws.onmessage = function (event) {
                    var receivedMessage = event.data;

                    log("[message] Received message from a server: " + receivedMessage);
                };

                ws.onclose = function (event) {
                    if (event.wasClean) {
                        log(`[close] Connection closed. Code=${event.code}, reason=${event.reason}.`);
                    } else {
                        log("[close] Connection died");
                    }
                };
            });

            $("#send-message").click(function (event) {
                event.preventDefault();

                if (ws.readyState !== 1) {
                    log("Failure: a connection is closed.");
                    return;
                }

                ws.send("Hello World!");
                log("Send message to server: \"Hello World!\"")
            });

            $("#disconnect").click(function (event) {
                event.preventDefault();

                if (ws.readyState !== 1) {
                    log("Failure: a connection is closed.");
                    return;
                }

                ws.close();
            });

            function log(message) {
                $("#log").val(message + "\n" + $("#log").val());
            }
        </script>
    </body>
</html>