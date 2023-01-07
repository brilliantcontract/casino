<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous" />
        <link rel="icon" type="image/x-icon" href="/favicon.ico">

        <title>Monitor control</title>

        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col">
                    <h1>Monitor control</h1>

                    <s:form method="post" action="start-monitor">
                        <input type="hidden" name="action" value="start" />

                        <div class="form-group form-inline">
                            <s:select name="roulette-name" list="roulettes" label="Roulette" required="" class="form-control mx-sm-3" />
                        </div>

                        <div class="form-group form-inline">
                            <s:textfield name="jsessionid" value="" class="form-control mx-sm-3" required="" label="JSession ID" />
                        </div>
                        
                        <div class="form-group">
                            <s:submit value="Start" class="btn btn-success" />
                        </div>
                    </s:form>

                    <hr />

                    <s:form method="post" action="stop-monitor">
                        <input type="hidden" name="action" value="stop" />

                        <div class="form-group form-inline">
                            <label for="roulette-name">Roulette name: </label>
                            <select name="roulette-name" required="" class="form-control mx-sm-3">
                                <option></option>
                                <option value="PRAGMATIC">Pragmatic</option>
                                <option value="EVOLUTION">Evolution</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <s:submit value="Stop" class="btn btn-danger" />
                        </div>
                    </s:form>

                    <hr />

                    <a href="#" onclick="event.preventDefault(); updateStatus();" class="btn btn-primary">Update status</a>
                    <div class="mt-2">
                        <ul id="status" class="list-group list-group-flush mt-2 mb-2"></ul>
                        <p><snap id="timestamp"></snap></p>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function updateStatus() {
                $(function () {
                    $("#status").html("");
                    $.getJSON("/monitor-control-rest/api/status", function (json) {
                        $.each(json, function (index, item) {
                            $("#status").append("<li class=\"list-group-item d-flex justify-content-between align-items-center\"><strong>" + item["roulette-name"] + "</strong> " + item.status + " <span class=\"text-muted badge\">" + item.message + "</span></li>");
                        });
                    });
                    $("#timestamp").text(new Date());
                });
            }
        </script>
    </body>
</html>