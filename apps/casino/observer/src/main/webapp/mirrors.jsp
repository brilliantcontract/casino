<%@page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous" />
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <link rel="stylesheet" href="mirror.css" />
        <link rel="icon" type="image/x-icon" href="/favicon.ico">

        <title>Mirrors</title>

        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                <a class="navbar-brand" href="#">Mirrors</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#"></a>
                        </li>
                    </ul>
                    <form class="form-inline mt-2 mt-md-0">
                        <div class="btn-group" role="group" aria-label="Third group">
                            <a href="javascript: return 0;" data-toggle="modal" data-target="#settings-modal" class="btn btn-outline-success my-2 my-sm-0" title="Settings"><i class="bi bi-gear"></i></a>
                            <a href="javascript: toggleFullScreen()" class="btn btn-outline-success my-2 my-sm-0" title="Fullscreen"><i class="bi bi-arrows-fullscreen"></i></a>
                        </div>
                    </form>
                </div>
            </nav>
        </header>

        <main role="main">
            <div class="container-fluid">
                <div class="row">
                    <h3 class="col-12">Mega Roulette</h3>
                </div>
                <div class="row">
                    <div class="col-4 mt-1" data-setting="color-columns-setting">
                        <h4 class="p-1 bg-white text-black">Color</h4>
                        <div class="field d-flex" data-setting="field-height-setting">
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">8</div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">12</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red"></div>
                                <div id="cell-1-1" class="cell red">4</div>
                            </div>
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell green"></div>
                                <div id="cell-1-1" class="cell black"></div>
                                <div id="cell-1-1" class="cell black">5</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-4 mt-1" data-setting="parity-columns-setting">
                        <h4 class="p-1 bg-success text-white">Parity</h4>
                        <div class="field" data-setting="field-height-setting">
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell"></div>
                                <div id="cell-1-1" class="cell"></div>
                                <div id="cell-1-1" class="cell"></div>
                                <div id="cell-1-1" class="cell">4</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-4 mt-1" data-setting="range-columns-setting">
                        <h4 class="p-1 bg-warning text-white">Range</h4>
                        <div class="field" data-setting="field-height-setting">
                            <div class="line d-flex flex-column-reverse align-items-start">
                                <div id="cell-1-1" class="cell"></div>
                                <div id="cell-1-1" class="cell"></div>
                                <div id="cell-1-1" class="cell"></div>
                                <div id="cell-1-1" class="cell">4</div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col-12">
                        <div class="field single-line">
                            <div class="line d-flex flex-row-reverse justify-content-end">
                                <div id="cell-1-1" class="cell red">6</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                                <div id="cell-1-1" class="cell red">7</div>
                                <div id="cell-1-1" class="cell black">21</div>
                                <div id="cell-1-1" class="cell black">32</div>
                                <div id="cell-1-1" class="cell green">0</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>

        <div class="modal fade" id="settings-modal" data-backdrop="static" tabindex="-1" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-xl modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">Settings</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="settings-form">
                            <div class="form-group row">
                                <label for="processed-spins-setting" class="col-sm-2 col-form-label">Processed spins</label>
                                <input type="number" id="processed-spins-setting" name="processed-spins-setting" class="col-sm-3 form-control form-control-sm" min="1" max="10000" />
                                <small class="form-text text-muted ml-3">Range 1 - 10000.</small>
                            </div>
                            <div class="form-group row">
                                <label for="color-columns-setting" class="col-sm-2 col-form-label">Color columns</label>
                                <input type="number" id="color-columns-setting" name="color-columns-setting" class="col-sm-3 form-control form-control-sm" min="1" max="12" />
                                <small class="form-text text-muted ml-3">Define width of COLOR field. Range 1 - 12.</small>
                            </div>
                            <div class="form-group row">
                                <label for="parity-columns-setting" class="col-sm-2 col-form-label">Parity columns</label>
                                <input type="number" id="parity-columns-setting" name="parity-columns-setting" class="col-sm-3 form-control form-control-sm" min="1" max="12" />
                                <small class="form-text text-muted ml-3">Define width of PARITY field. Range 1 - 12.</small>
                            </div>
                            <div class="form-group row">
                                <label for="range-columns-setting" class="col-sm-2 col-form-label">Range columns</label>
                                <input type="number" id="range-columns-setting" name="range-columns-setting" class="col-sm-3 form-control form-control-sm" min="1" max="12" />
                                <small class="form-text text-muted ml-3">Define width of RANGE field. Range 1 - 12.</small>
                            </div>
                            <div class="form-group row">
                                <label for="field-height-setting" class="col-sm-2 col-form-label">Field height</label>
                                <input type="number" id="field-height-setting" name="field-height-setting" class="col-sm-3 form-control form-control-sm" min="100" max="1000" />
                                <small class="form-text text-muted ml-3">In pixels. Range 100 - 1000.</small>
                            </div>
                            <div class="form-group row">
                                <label for="hide-0-setting" class="col-sm-2 col-form-label">Hide 0</label>
                                <div class="form-check mr-4">
                                    <input type="radio" value="yes" id="hide-0-yes-setting" name="hide-0-setting" class="form-check-input" />
                                    <label for="hide-0-yes-setting">Yes</label>
                                </div>
                                <div class="form-check">
                                    <input type="radio" value="no" id="hide-0-no-setting" name="hide-0-setting" class="form-check-input" />
                                    <label for="hide-0-no-setting">No</label>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="warning-fire-setting" class="col-sm-2 col-form-label">Warning fire</label>
                                <input type="number" id="warning-fire-setting" name="warning-fire-setting" class="col-sm-3 form-control form-control-sm" min="1" max="100" />
                                <small class="form-text text-muted ml-3">How many matches needs to receive yellow color highlight.</small>
                            </div>
                            <div class="form-group row">
                                <label for="success-fire-setting" class="col-sm-2 col-form-label">Success fire</label>
                                <input type="number" id="success-fire-setting" name="success-fire-setting" class="col-sm-3 form-control form-control-sm" min="1" max="100" />
                                <small class="form-text text-muted ml-3">How many matches needs to receive green color highlight.</small>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" id="set-default-settings">Set default</button>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" data-dismiss="modal" id="save-settings">Save changes</button>
                    </div>
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

        <script src="mirror.js"></script>





        <script>
            let currentSettings;
            $.get("/observer/resources/settings/current-settings", function (data) {
                currentSettings = data;
                applyUnmarshal(currentSettings);
                applySettings(currentSettings);
            });

            let defaultSettings;
            $.get("/observer/resources/settings/default-settings", function (data) {
                defaultSettings = data;
            });

            $("#save-settings").click(function (event) {
                currentSettings = applyMarshal();
                applySettings(currentSettings);

                $.post({
                    url: "/observer/resources/settings/current-settings",
                    data: currentSettings,
                    contentType: "application/json; charset=utf-8"
                })
                .done(function () {
                    console.log("Saving done successfully.");
                })
                .fail(function () {
                    console.log("Saving failed.");
                    alert("Saving failed.");
                });
            });

            $("#set-default-settings").click(function (event) {
                applyUnmarshal(defaultSettings);
            });

            function applySettings(settings) {
                $("div[data-setting='color-columns-setting']")
                        .removeClass(function () {
                            return $(this).prev().attr("class");
                        })
                        .removeClass("col-4")
                        .addClass("col-" + getCurrentSettingValue("color-columns-setting"))
                        .addClass("mt-1");
                
                $("div[data-setting='parity-columns-setting']")
                        .removeClass(function () {
                            return $(this).prev().attr("class");
                        })
                        .removeClass("col-4")
                        .addClass("col-" + getCurrentSettingValue("parity-columns-setting"))
                        .addClass("mt-1");
                
                $("div[data-setting='range-columns-setting']")
                        .removeClass(function () {
                            return $(this).prev().attr("class");
                        })
                        .removeClass("col-4")
                        .addClass("col-" + getCurrentSettingValue("range-columns-setting"))
                        .addClass("mt-1");
                
                $("div[data-setting='field-height-setting']")
                        .removeAttr("style")
                        .attr("style", "height: " + getCurrentSettingValue("field-height-setting") + "px");
            }

            function applyMarshal() {
                currentSettings = marshal("settings-form");
                console.log(currentSettings);
                return currentSettings;
            }

            function applyUnmarshal(json) {
                unmarshal(json);
            }

            function getCurrentSettingValue(name) {
                let found;

                for (var index = 0; index < currentSettings.length; index++) {
                    if(currentSettings[index].name === name) {
                        found = currentSettings[index].value;
                        break;
                    }
                }

                return found;
            }
        </script>

        <script src="form-serialization.js"></script>
    </body>
</html>