<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous" />
        <link rel="icon" type="image/x-icon" href="/favicon.ico">
        
        <title>Observer</title>

        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col">
                    <h1>Observer</h1>
                </div>
            </div>

            <div class="row">
                <div class="col">
                    User modules:
                    <ul>
                        <li><a href="mirrors.jsp">Mirrors</a></li>
                    </ul>
                </div>
            </div>

            <div class="row">
                <div class="col">
                    Testing:
                    <ul>
                        <li><a href="test-ws-service.jsp">Test Websocket service</a></li>
                        <li><a href="/observer-service/resources/test-observer-service/my test message">Test REST service</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>