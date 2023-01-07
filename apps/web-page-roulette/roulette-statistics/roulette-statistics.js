class RouletteStatistics {

    NUMBER_OF_ROWS = 6;

    colorNumberOfColumns = 15;
    parityNumberOfColumns = 15;
    rangeNumberOfColumns = 15;

    numbers = new Array(0);

    spin(number) {
        this.numbers.push(number);
        this.spinRefresh();
    }

    spinRefresh() {
        let currentNumber = this.numbers[this.numbers.length - 1];
        this.updateLastNumberUi(currentNumber);
        this.updateNumbers();

        this.cleanUpUserInterface();
        this.doCalculations();
        this.scrollVesselToLeft();
    }

    playNumbers(numbers) {
        numbers = numbers.replace(/[^0-9]+/g, ",").split(",");

        this.numbers = [];
        for (let number of numbers) {
            let parsedNumber = parseInt(number, 10);
            if (number !== undefined && number !== null && !isNaN(parsedNumber)) {
                this.numbers.push(parsedNumber);
            }
        }

        this.spinRefresh();
    }

    updateNumbers() {
        $("#numbers").val(this.numbers);
    }

    scrollVesselToLeft() {
        $("#statistics-vessel-for-colors").scrollLeft(99999);
        $("#statistics-vessel-for-parity").scrollLeft(99999);
        $("#statistics-vessel-for-ranges").scrollLeft(99999);
    }

    undoLastSpin() {
        this.numbers.pop();
        this.spinRefresh();
    }

    doCalculations() {
        let colorColumnIndex = 0;
        let colorRowIndex = 0;
        let parityColumnIndex = 0;
        let parityRowIndex = 0;
        let rangeColumnIndex = 0;
        let rangeRowIndex = 0;

        for (let numbersIndex = 0; numbersIndex < this.numbers.length; numbersIndex++) {
            let currentNumber = this.numbers[numbersIndex];
            let previousNumber = this.numbers[numbersIndex - 1];
            let secondLastNumber = this.fetchSecondLastNumber(numbersIndex);

            // Color
            let currentNumberColor = this.convertNumberToColor(currentNumber);
            let previousNumberColor = this.convertNumberToColor(previousNumber);
            let secondLastNumberColor = this.convertNumberToColor(secondLastNumber);
            let valueForColor = this.convertColorToValue(currentNumberColor);
            colorRowIndex = this.updateRowIndex(colorRowIndex, currentNumberColor, previousNumberColor, secondLastNumberColor);
            colorColumnIndex = this.updateColumnIndex("color", colorColumnIndex, colorRowIndex);
            this.updateStatisticsCell(valueForColor, "color", colorColumnIndex, colorRowIndex);

            // Parity
            let currentNumberEvenOrOdd = this.convertNumberToEvenOrOdd(currentNumber);
            let previousNumberEvenOrOdd = this.convertNumberToEvenOrOdd(previousNumber);
            let secondLastNumberEvenOrOdd = this.convertNumberToEvenOrOdd(secondLastNumber);
            let valueForEvenOrOdd = this.convertEvenOrOddToValue(currentNumberEvenOrOdd);
            parityRowIndex = this.updateRowIndex(parityRowIndex, currentNumberEvenOrOdd, previousNumberEvenOrOdd, secondLastNumberEvenOrOdd);
            parityColumnIndex = this.updateColumnIndex("parity", parityColumnIndex, parityRowIndex);
            this.updateStatisticsCell(valueForEvenOrOdd, "parity", parityColumnIndex, parityRowIndex);

            // Range
            let currentNumberRange = this.convertNumberToRange(currentNumber);
            let previousNumberRange = this.convertNumberToRange(previousNumber);
            let secondLastNumberRange = this.convertNumberToRange(secondLastNumber);
            let valueForRange = this.convertRangeToValue(currentNumberRange);
            rangeRowIndex = this.updateRowIndex(rangeRowIndex, currentNumberRange, previousNumberRange, secondLastNumberRange);
            rangeColumnIndex = this.updateColumnIndex("range", rangeColumnIndex, rangeRowIndex);
            this.updateStatisticsCell(valueForRange, "range", rangeColumnIndex, rangeRowIndex);
        }
    }

    fetchSecondLastNumber(currentNumbersIndex) {
        currentNumbersIndex = currentNumbersIndex - 2;
        if(currentNumbersIndex < 0) {
            return null;
        }
        
        for (let numbersIndex = currentNumbersIndex; numbersIndex >= 0; numbersIndex--) {
            let secondLastNumber = this.numbers[numbersIndex];
            if(secondLastNumber !== 0) {
                return secondLastNumber;
            }
        }
        
        return null;
    }

    /**
     * 
     * @param {type} X, O and 0 are available values.
     * @param {type} tableId "color", "parity" and "range" are available values.
     * @param {type} columnNumber
     * @param {type} rowNumber Row number counting from bottom to top.
     * @return {undefined}
     */
    updateStatisticsCell(value, tableId, columnIndex, rowIndex) {
        let id = "#" + tableId + "-statistics-table-cell-" + columnIndex + "-" + rowIndex;
        $(id).html(value);

        // Set background color.
        if (value === "&#9633;") {
            $(id).css("background", "rgba(0, 128, 0, 1)");
        }
        if (value === "X") {
            $(id).css("background", "rgba(255, 0, 0, 1)");
        }
        if (value === "O") {
            $(id).css("background", "rgba(0, 0, 0, 1)");
        }
    }

    updateColumnIndex(id, columnIndex, rowIndex) {
        if (rowIndex === 1) {
            columnIndex += 1;
        }

        // Add new column.
        if (id === 'color' && columnIndex > this.colorNumberOfColumns) {
            this.colorNumberOfColumns += 1;
            let tableId = "statistics-" + id + "-table";
            $("#" + tableId + " tr:nth-child(1)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-6\"></td>");
            $("#" + tableId + " tr:nth-child(2)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-5\"></td>");
            $("#" + tableId + " tr:nth-child(3)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-4\"></td>");
            $("#" + tableId + " tr:nth-child(4)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-3\"></td>");
            $("#" + tableId + " tr:nth-child(5)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-2\"></td>");
            $("#" + tableId + " tr:nth-child(6)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-1\"></td>");
        }
        if (id === 'parity' && columnIndex > this.parityNumberOfColumns) {
            this.parityNumberOfColumns += 1;
            let tableId = "statistics-" + id + "-table";
            $("#" + tableId + " tr:nth-child(1)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-6\"></td>");
            $("#" + tableId + " tr:nth-child(2)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-5\"></td>");
            $("#" + tableId + " tr:nth-child(3)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-4\"></td>");
            $("#" + tableId + " tr:nth-child(4)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-3\"></td>");
            $("#" + tableId + " tr:nth-child(5)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-2\"></td>");
            $("#" + tableId + " tr:nth-child(6)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-1\"></td>");
        }
        if (id === 'range' && columnIndex > this.rangeNumberOfColumns) {
            this.rangeNumberOfColumns += 1;
            let tableId = "statistics-" + id + "-table";
            $("#" + tableId + " tr:nth-child(1)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-6\"></td>");
            $("#" + tableId + " tr:nth-child(2)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-5\"></td>");
            $("#" + tableId + " tr:nth-child(3)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-4\"></td>");
            $("#" + tableId + " tr:nth-child(4)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-3\"></td>");
            $("#" + tableId + " tr:nth-child(5)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-2\"></td>");
            $("#" + tableId + " tr:nth-child(6)").append("<td id=\"" + id + "-statistics-table-cell-" + columnIndex + "-1\"></td>");
        }

        return columnIndex;
    }

    updateRowIndex(rowIndex, currentNumber, previousNumber, secondLastNumber) {
        if (currentNumber === previousNumber
                || currentNumber === "0"
                || (
                        previousNumber === "0"
                        && (currentNumber === secondLastNumber || secondLastNumber === undefined || secondLastNumber === "")
                        )
                ) {
            rowIndex += 1;
        } else {
            rowIndex = 1;
        }

        if (rowIndex > this.NUMBER_OF_ROWS) {
            rowIndex = 1;
        }

        return rowIndex;
    }

    cleanUpUserInterface() {
        for (let rowIndex = 1; rowIndex <= this.NUMBER_OF_ROWS; rowIndex++) {
            for (let columnIndex = 1; columnIndex <= this.colorNumberOfColumns; columnIndex++) {
                let id = "#color-statistics-table-cell-" + columnIndex + "-" + rowIndex;
                $(id).html("&nbsp;");
                $(id).css("background", "grey");
            }
        }

        for (let rowIndex = 1; rowIndex <= this.NUMBER_OF_ROWS; rowIndex++) {
            for (let columnIndex = 1; columnIndex <= this.parityNumberOfColumns; columnIndex++) {
                let id = "#parity-statistics-table-cell-" + columnIndex + "-" + rowIndex;
                $(id).html("&nbsp;");
                $(id).css("background", "grey");
            }
        }

        for (let rowIndex = 1; rowIndex <= this.NUMBER_OF_ROWS; rowIndex++) {
            for (let columnIndex = 1; columnIndex <= this.rangeNumberOfColumns; columnIndex++) {
                let id = "#range-statistics-table-cell-" + columnIndex + "-" + rowIndex;
                $(id).html("&nbsp;");
                $(id).css("background", "grey");
            }
        }

    }

    updateLastNumberUi(number) {
        if (number === null || number === undefined) {
            $("#last-number").html("&nbsp;");
            $("#last-color").html("&nbsp;");
            $("#last-parity").html("&nbsp;");
            $("#last-range").html("&nbsp;");
            $("#last-number").css("background", "grey");

            return;
        }

        $("#last-number").text(number);
        $("#last-color").text(this.convertNumberToColor(number));
        $("#last-parity").text(this.convertNumberToEvenOrOdd(number));
        $("#last-range").text(this.convertNumberToRange(number));

        // Coloring "Last number" cell.
        switch (this.convertNumberToColor(number)) {
            case 'green':
                $("#last-number").css("background", "green");
                break;
            case 'black':
                $("#last-number").css("background", "black");
                break;
            case 'red':
                $("#last-number").css("background", "red");
                break;
            default:
                $("#last-number").css("background", "grey");
                break;
        }
    }

    convertNumberToColor(number) {
        if (number === 0) {
            return "0";
        }

        if (number === 2 || number === 4 || number === 6 || number === 8
                || number === 10 || number === 11 || number === 13 || number === 15
                || number === 17 || number === 20 || number === 22 || number === 24
                || number === 26 || number === 28 || number === 29 || number === 31
                || number === 33 || number === 35) {
            return "black";
        }

        if (number === 1 || number === 3 || number === 5 || number === 7
                || number === 9 || number === 12 || number === 14 || number === 16
                || number === 18 || number === 19 || number === 21 || number === 23
                || number === 25 || number === 27 || number === 30 || number === 32
                || number === 34 || number === 36) {
            return "red";
        }

        return "";
    }

    convertColorToValue(color) {
        if (color === null || color === undefined) {
            return;
        }
        if (color === "0") {
            return "&#9633;";
        }
        if (color === "black") {
            return "O";
        }
        if (color === "red") {
            return "X";
        }
    }

    convertNumberToEvenOrOdd(parity) {
        if (parity === null || parity === undefined) {
            return;
        }
        if (parity === 0) {
            return "0";
        }
        if (parity % 2 === 0) {
            return "even";
        }
        if (parity % 2 === 1) {
            return "odd";
        }
    }

    convertEvenOrOddToValue(parity) {
        if (parity === null || parity === undefined) {
            return;
        }
        if (parity === "0") {
            return "&#9633;";
        }
        if (parity === "odd") {
            return "O";
        }
        if (parity === "even") {
            return "X";
        }
    }

    convertNumberToRange(number) {
        if (number === null || number === undefined) {
            return;
        }
        if (number === 0) {
            return "0";
        }
        if (number >= 1 && number <= 18) {
            return "1-18";
        }
        if (number >= 19 && number <= 36) {
            return "19-36";
        }

        return "";
    }

    convertRangeToValue(range) {
        if (range === null || range === undefined) {
            return;
        }
        if (range === "0") {
            return "&#9633;";
        }
        if (range === "19-36") {
            return "O";
        }
        if (range === "1-18") {
            return "X";
        }
    }
}