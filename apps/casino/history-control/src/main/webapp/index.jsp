<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous" />
        <link rel="icon" type="image/x-icon" href="/favicon.ico">

        <title>History control</title>

        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col">
                    <h1>History control</h1>
                    
                    <!-- @todo Table names have to be extracted from Config class. Not be hard coded. -->
                    <select name="table-name" id="table-name">
                        <option value="Mega Roulette">Mega Roulette</option>
                        <option value="Roulette 1 - Azure">Roulette 1 - Azure</option>
                        <option value="Speed Roulette 1">Speed Roulette 1</option>
                        <option value="Roulette 2">Roulette 2</option>
                        <option value="Auto-Roulette 1">Auto-Roulette 1</option>
                        <option value="Roulette 3 - Macao">Roulette 3 - Macao</option>
                        <option value="Roulette 8 - Indian">Roulette 8 - Indian</option>
                        <option value="Roulette 9 - The Club">Roulette 9 - The Club</option>
                        <option value="Roulette 10 - Ruby">Roulette 10 - Ruby</option>
                    </select>

                    <a href="#" id="get-full-history" class="btn btn-primary">Get full history</a>

                    <table class="mt-5 table table-hover table-sm">
                        <thead class="thead-dark">
                            <tr>
                                <th>Number</th>
                                <th>Sequence</th>
                                <th>Color</th>
                                <th>Timestamp</th>
                                <th>Parity</th>
                                <th>Range</th>
                            </tr>
                        </thead>
                        <tbody id="full-history"></tbody>
                    </table>
                </div>
            </div>
        </div>

        <script>
            $("#get-full-history").click(function () {
                // Clean up data in table. In order server side issue table should be left empty without old data.
                $("#full-history").html("");
                
                let tableName = $("#table-name").val();
                $.getJSON("/history-control-rest/resources/get-full-history/" + tableName, function (data) {
                    var rows = [];
                    $.each(data, function (key, value) {
                        rows.push("<tr><td>" + value['number'].value + "</td><td>" + value['sequence'] + "</td><td>" + value['color'] + "</td><td>" + value['timestamp'] + "</td><td>" + value['parity'] + "</td><td>" + value['range'] + "</td></tr>");
                    });

                    $("#full-history").html(rows.join(""));
                });
            });
        </script>
    </body>
</html>