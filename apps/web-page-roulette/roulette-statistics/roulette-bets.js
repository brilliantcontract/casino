class RouletteBets {

    numbers = new Array(0);
    rouletteStatistics = new RouletteStatistics();

    colorXPlus1Repetition = 0;
    colorOPlus1Repetition = 0;
    colorXoPlus1Repetition = 0;
    colorXMinus1Repetition = 0;
    colorOMinus1Repetition = 0;
    colorXoMinus1Repetition = 0;
    colorIiiPlus1Repetition = 0;
    colorIiiMinus1Repetition = 0;
    colorXPlus2Repetition = 0;
    colorOPlus2Repetition = 0;
    colorXoPlus2Repetition = 0;
    colorXMinus2Repetition = 0;
    colorOMinus2Repetition = 0;
    colorXoMinus2Repetition = 0;
    colorIiiPlus2Repetition = 0;
    colorIiiMinus2Repetition = 0;
    colorXPlus3Repetition = 0;
    colorOPlus3Repetition = 0;
    colorXoPlus3Repetition = 0;
    colorXMinus3Repetition = 0;
    colorOMinus3Repetition = 0;
    colorXoMinus3Repetition = 0;
    colorIiiPlus3Repetition = 0;
    colorIiiMinus3Repetition = 0;
    colorXPlus4Repetition = 0;
    colorOPlus4Repetition = 0;
    colorXoPlus4Repetition = 0;
    colorXMinus4Repetition = 0;
    colorOMinus4Repetition = 0;
    colorXoMinus4Repetition = 0;
    colorIiiPlus4Repetition = 0;
    colorIiiMinus4Repetition = 0;
    colorXPlus5Repetition = 0;
    colorOPlus5Repetition = 0;
    colorXoPlus5Repetition = 0;
    colorXMinus5Repetition = 0;
    colorOMinus5Repetition = 0;
    colorXoMinus5Repetition = 0;
    colorXPlus6Repetition = 0;
    colorOPlus6Repetition = 0;
    colorXoPlus6Repetition = 0;
    colorXMinus6Repetition = 0;
    colorOMinus6Repetition = 0;
    colorXoMinus6Repetition = 0;

    parityXPlus1Repetition = 0;
    parityOPlus1Repetition = 0;
    parityXoPlus1Repetition = 0;
    parityXMinus1Repetition = 0;
    parityOMinus1Repetition = 0;
    parityXoMinus1Repetition = 0;
    parityIiiPlus1Repetition = 0;
    parityIiiMinus1Repetition = 0;
    parityXPlus2Repetition = 0;
    parityOPlus2Repetition = 0;
    parityXoPlus2Repetition = 0;
    parityXMinus2Repetition = 0;
    parityOMinus2Repetition = 0;
    parityXoMinus2Repetition = 0;
    parityIiiPlus2Repetition = 0;
    parityIiiMinus2Repetition = 0;
    parityXPlus3Repetition = 0;
    parityOPlus3Repetition = 0;
    parityXoPlus3Repetition = 0;
    parityXMinus3Repetition = 0;
    parityOMinus3Repetition = 0;
    parityXoMinus3Repetition = 0;
    parityIiiPlus3Repetition = 0;
    parityIiiMinus3Repetition = 0;
    parityXPlus4Repetition = 0;
    parityOPlus4Repetition = 0;
    parityXoPlus4Repetition = 0;
    parityXMinus4Repetition = 0;
    parityOMinus4Repetition = 0;
    parityXoMinus4Repetition = 0;
    parityIiiPlus4Repetition = 0;
    parityIiiMinus4Repetition = 0;
    parityXPlus5Repetition = 0;
    parityOPlus5Repetition = 0;
    parityXoPlus5Repetition = 0;
    parityXMinus5Repetition = 0;
    parityOMinus5Repetition = 0;
    parityXoMinus5Repetition = 0;
    parityXPlus6Repetition = 0;
    parityOPlus6Repetition = 0;
    parityXoPlus6Repetition = 0;
    parityXMinus6Repetition = 0;
    parityOMinus6Repetition = 0;
    parityXoMinus6Repetition = 0;

    rangeXPlus1Repetition = 0;
    rangeOPlus1Repetition = 0;
    rangeXoPlus1Repetition = 0;
    rangeXMinus1Repetition = 0;
    rangeOMinus1Repetition = 0;
    rangeXoMinus1Repetition = 0;
    rangeIiiPlus1Repetition = 0;
    rangeIiiMinus1Repetition = 0;
    rangeXPlus2Repetition = 0;
    rangeOPlus2Repetition = 0;
    rangeXoPlus2Repetition = 0;
    rangeXMinus2Repetition = 0;
    rangeOMinus2Repetition = 0;
    rangeXoMinus2Repetition = 0;
    rangeIiiPlus2Repetition = 0;
    rangeIiiMinus2Repetition = 0;
    rangeXPlus3Repetition = 0;
    rangeOPlus3Repetition = 0;
    rangeXoPlus3Repetition = 0;
    rangeXMinus3Repetition = 0;
    rangeOMinus3Repetition = 0;
    rangeXoMinus3Repetition = 0;
    rangeIiiPlus3Repetition = 0;
    rangeIiiMinus3Repetition = 0;
    rangeXPlus4Repetition = 0;
    rangeOPlus4Repetition = 0;
    rangeXoPlus4Repetition = 0;
    rangeXMinus4Repetition = 0;
    rangeOMinus4Repetition = 0;
    rangeXoMinus4Repetition = 0;
    rangeIiiPlus4Repetition = 0;
    rangeIiiMinus4Repetition = 0;
    rangeXPlus5Repetition = 0;
    rangeOPlus5Repetition = 0;
    rangeXoPlus5Repetition = 0;
    rangeXMinus5Repetition = 0;
    rangeOMinus5Repetition = 0;
    rangeXoMinus5Repetition = 0;
    rangeXPlus6Repetition = 0;
    rangeOPlus6Repetition = 0;
    rangeXoPlus6Repetition = 0;
    rangeXMinus6Repetition = 0;
    rangeOMinus6Repetition = 0;
    rangeXoMinus6Repetition = 0;

    setRouletteStatistics(rouletteStatistics) {
        this.rouletteStatistics = rouletteStatistics;
    }

    spin(number) {
        this.numbers.push(number);
        this.spinRefresh();
    }

    spinRefresh() {
        this.cleanUpUserInterface();
        this.doCalculations();
        this.updateUserInterface();
    }

    undoLastSpin() {
        this.numbers.pop();
        this.spinRefresh();
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

    doCalculations() {
        let colorColumnIndex = 0;
        let colorRowIndex = 0;
        let parityColumnIndex = 0;
        let parityRowIndex = 0;
        let rangeColumnIndex = 0;
        let rangeRowIndex = 0;

        let previousColorColumnIndex = null;
        let previousColorRowIndex = null;
        let previousParityColumnIndex = null;
        let previousParityRowIndex = null;
        let previousRangeColumnIndex = null;
        let previousRangeRowIndex = null;
        
        let colorTotalZerosInCurrentColumn = 0;
        let parityTotalZerosInCurrentColumn = 0;
        let rangeTotalZerosInCurrentColumn = 0;

        for (let numbersIndex = 0; numbersIndex < this.numbers.length; numbersIndex++) {
            let currentNumber = this.numbers[numbersIndex];
            let previousNumber = this.numbers[numbersIndex - 1];
            let secondLastNumber = this.fetchSecondLastNumber();

            // Color
            let currentNumberColor = this.rouletteStatistics.convertNumberToColor(currentNumber);
            let previousNumberColor = this.rouletteStatistics.convertNumberToColor(previousNumber);
            let secondLastNumberColor = this.rouletteStatistics.convertNumberToColor(secondLastNumber);
            let valueForColor = this.rouletteStatistics.convertColorToValue(currentNumberColor);
            colorRowIndex = this.rouletteStatistics.updateRowIndex(colorRowIndex, currentNumberColor, previousNumberColor, secondLastNumberColor);
            colorColumnIndex = this.rouletteStatistics.updateColumnIndex("color", colorColumnIndex, colorRowIndex);
            this.updateBets(valueForColor, "color", colorColumnIndex, colorRowIndex, previousColorColumnIndex, previousColorRowIndex, colorTotalZerosInCurrentColumn);
            colorTotalZerosInCurrentColumn = this.countTotalZerosInCurrentColumn(numbersIndex, colorRowIndex);
            previousColorColumnIndex = colorColumnIndex;
            previousColorRowIndex = colorRowIndex;

            // Parity
            let currentNumberEvenOrOdd = this.rouletteStatistics.convertNumberToEvenOrOdd(currentNumber);
            let previousNumberEvenOrOdd = this.rouletteStatistics.convertNumberToEvenOrOdd(previousNumber);
            let secondLastNumberEvenOrOdd = this.rouletteStatistics.convertNumberToEvenOrOdd(secondLastNumber);
            let valueForEvenOrOdd = this.rouletteStatistics.convertEvenOrOddToValue(currentNumberEvenOrOdd);
            parityRowIndex = this.rouletteStatistics.updateRowIndex(parityRowIndex, currentNumberEvenOrOdd, previousNumberEvenOrOdd, secondLastNumberEvenOrOdd);
            parityColumnIndex = this.rouletteStatistics.updateColumnIndex("parity", parityColumnIndex, parityRowIndex);
            this.updateBets(valueForEvenOrOdd, "parity", parityColumnIndex, parityRowIndex, previousParityColumnIndex, previousParityRowIndex, parityTotalZerosInCurrentColumn);
            parityTotalZerosInCurrentColumn = this.countTotalZerosInCurrentColumn(numbersIndex, parityRowIndex);
            previousParityColumnIndex = parityColumnIndex;
            previousParityRowIndex = parityRowIndex;

            // Range
            let currentNumberRange = this.rouletteStatistics.convertNumberToRange(currentNumber);
            let previousNumberRange = this.rouletteStatistics.convertNumberToRange(previousNumber);
            let secondLastNumberRange = this.rouletteStatistics.convertNumberToRange(secondLastNumber);
            let valueForRange = this.rouletteStatistics.convertRangeToValue(currentNumberRange);
            rangeRowIndex = this.rouletteStatistics.updateRowIndex(rangeRowIndex, currentNumberRange, previousNumberRange, secondLastNumberRange);
            rangeColumnIndex = this.rouletteStatistics.updateColumnIndex("range", rangeColumnIndex, rangeRowIndex);
            this.updateBets(valueForRange, "range", rangeColumnIndex, rangeRowIndex, previousRangeColumnIndex, previousRangeRowIndex, rangeTotalZerosInCurrentColumn);
            rangeTotalZerosInCurrentColumn = this.countTotalZerosInCurrentColumn(numbersIndex, rangeRowIndex);
            previousRangeColumnIndex = rangeColumnIndex;
            previousRangeRowIndex = rangeRowIndex;
        }
    }

    fetchSecondLastNumber(currentNumbersIndex) {
        currentNumbersIndex = currentNumbersIndex - 2;
        if (currentNumbersIndex < 0) {
            return null;
        }

        for (let numbersIndex = currentNumbersIndex; numbersIndex > 0; numbersIndex--) {
            let secondLastNumber = this.numbers[numbersIndex];
            if (secondLastNumber !== 0) {
                return secondLastNumber;
            }
        }

        return null;
    }
    
    countTotalZerosInCurrentColumn(currentNumbersIndex, rowIndex) {
        let zerosCounter = 0;
        
        for(let index = 0; index < rowIndex; index++) {
            if(this.numbers[currentNumbersIndex - index] === 0) {
                zerosCounter += 1;
            }
        }
        
        return zerosCounter;
    }

    /**
     * 
     * @param {type} X, O and 0 are available values.
     * @param {type} tableId "color", "parity" and "range" are available values.
     * @param {type} columnNumber
     * @param {type} rowNumber Row number counting from bottom to top.
     * @return {undefined}
     */
    updateBets(value, tableId, columnIndex, rowIndex, previousColumnIndex, 
        previousRowIndex, totalZerosInCurrentColumn) {
        if(rowIndex !== 1) {
            return;
        }
        
        //console.log("Number of zeros in current column (" + tableId + "): " + totalZerosInCurrentColumn);
        previousRowIndex = previousRowIndex - totalZerosInCurrentColumn;
        
        if (tableId === "color") {
            if (value === "&#9633;") {
                // Do nothing when number is zero.
            }
            // Calculate X+
            if (value === "O") {
                if(previousRowIndex === 1) {
                    this.colorXPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.colorXPlus1Repetition = 0;
                    this.colorXPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.colorXPlus1Repetition = 0;
                    this.colorXPlus2Repetition = 0;
                    this.colorXPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.colorXPlus1Repetition = 0;
                    this.colorXPlus2Repetition = 0;
                    this.colorXPlus3Repetition = 0;
                    this.colorXPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.colorXPlus1Repetition = 0;
                    this.colorXPlus2Repetition = 0;
                    this.colorXPlus3Repetition = 0;
                    this.colorXPlus4Repetition = 0;
                    this.colorXPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.colorXPlus1Repetition = 0;
                    this.colorXPlus2Repetition = 0;
                    this.colorXPlus3Repetition = 0;
                    this.colorXPlus4Repetition = 0;
                    this.colorXPlus5Repetition = 0;
                    this.colorXPlus6Repetition += 1;
                }
            }
            // Calculate O+
            if (value === "X") {
                if(previousRowIndex === 1) {
                    this.colorOPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.colorOPlus1Repetition = 0;
                    this.colorOPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.colorOPlus1Repetition = 0;
                    this.colorOPlus2Repetition = 0;
                    this.colorOPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.colorOPlus1Repetition = 0;
                    this.colorOPlus2Repetition = 0;
                    this.colorOPlus3Repetition = 0;
                    this.colorOPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.colorOPlus1Repetition = 0;
                    this.colorOPlus2Repetition = 0;
                    this.colorOPlus3Repetition = 0;
                    this.colorOPlus4Repetition = 0;
                    this.colorOPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.colorOPlus1Repetition = 0;
                    this.colorOPlus2Repetition = 0;
                    this.colorOPlus3Repetition = 0;
                    this.colorOPlus4Repetition = 0;
                    this.colorOPlus5Repetition = 0;
                    this.colorOPlus6Repetition += 1;
                }
            }
            // Calculate XO+
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.colorXoPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.colorXoPlus1Repetition = 0;
                    this.colorXoPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.colorXoPlus1Repetition = 0;
                    this.colorXoPlus2Repetition = 0;
                    this.colorXoPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.colorXoPlus1Repetition = 0;
                    this.colorXoPlus2Repetition = 0;
                    this.colorXoPlus3Repetition = 0;
                    this.colorXoPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.colorXoPlus1Repetition = 0;
                    this.colorXoPlus2Repetition = 0;
                    this.colorXoPlus3Repetition = 0;
                    this.colorXoPlus4Repetition = 0;
                    this.colorXoPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.colorXoPlus1Repetition = 0;
                    this.colorXoPlus2Repetition = 0;
                    this.colorXoPlus3Repetition = 0;
                    this.colorXoPlus4Repetition = 0;
                    this.colorXoPlus5Repetition = 0;
                    this.colorXoPlus6Repetition += 1;
                }
            }
            // Calculate X-
            if (value === "O") {
                if(previousRowIndex === 1) {
                    this.colorXMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.colorXMinus1Repetition += 1;
                    this.colorXMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.colorXMinus1Repetition += 1;
                    this.colorXMinus2Repetition += 1;
                    this.colorXMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.colorXMinus1Repetition += 1;
                    this.colorXMinus2Repetition += 1;
                    this.colorXMinus3Repetition += 1;
                    this.colorXMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.colorXMinus1Repetition += 1;
                    this.colorXMinus2Repetition += 1;
                    this.colorXMinus3Repetition += 1;
                    this.colorXMinus4Repetition += 1;
                    this.colorXMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.colorXMinus1Repetition += 1;
                    this.colorXMinus2Repetition += 1;
                    this.colorXMinus3Repetition += 1;
                    this.colorXMinus4Repetition += 1;
                    this.colorXMinus5Repetition += 1;
                    this.colorXMinus6Repetition = 0;
                }
            }
            // Calculate O-
            if (value === "X") {
                if(previousRowIndex === 1) {
                    this.colorOMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.colorOMinus1Repetition += 1;
                    this.colorOMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.colorOMinus1Repetition += 1;
                    this.colorOMinus2Repetition += 1;
                    this.colorOMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.colorOMinus1Repetition += 1;
                    this.colorOMinus2Repetition += 1;
                    this.colorOMinus3Repetition += 1;
                    this.colorOMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.colorOMinus1Repetition += 1;
                    this.colorOMinus2Repetition += 1;
                    this.colorOMinus3Repetition += 1;
                    this.colorOMinus4Repetition += 1;
                    this.colorOMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.colorOMinus1Repetition += 1;
                    this.colorOMinus2Repetition += 1;
                    this.colorOMinus3Repetition += 1;
                    this.colorOMinus4Repetition += 1;
                    this.colorOMinus5Repetition += 1;
                    this.colorOMinus6Repetition = 0;
                }
            }
            // Calculate XO-
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.colorXoMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.colorXoMinus1Repetition += 1;
                    this.colorXoMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.colorXoMinus1Repetition += 1;
                    this.colorXoMinus2Repetition += 1;
                    this.colorXoMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.colorXoMinus1Repetition += 1;
                    this.colorXoMinus2Repetition += 1;
                    this.colorXoMinus3Repetition += 1;
                    this.colorXoMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.colorXoMinus1Repetition += 1;
                    this.colorXoMinus2Repetition += 1;
                    this.colorXoMinus3Repetition += 1;
                    this.colorXoMinus4Repetition += 1;
                    this.colorXoMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.colorXoMinus1Repetition += 1;
                    this.colorXoMinus2Repetition += 1;
                    this.colorXoMinus3Repetition += 1;
                    this.colorXoMinus4Repetition += 1;
                    this.colorXoMinus5Repetition += 1;
                    this.colorXoMinus6Repetition = 0;
                }
            }
            // Calculate III+
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.colorIiiPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.colorIiiPlus1Repetition = 0;
                    this.colorIiiPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.colorIiiPlus1Repetition = 0;
                    this.colorIiiPlus2Repetition = 0;
                    this.colorIiiPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.colorIiiPlus1Repetition = 0;
                    this.colorIiiPlus2Repetition = 0;
                    this.colorIiiPlus3Repetition = 0;
                    this.colorIiiPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.colorIiiPlus1Repetition = 0;
                    this.colorIiiPlus2Repetition = 0;
                    this.colorIiiPlus3Repetition = 0;
                    this.colorIiiPlus4Repetition = 0;
                    this.colorIiiPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.colorIiiPlus1Repetition = 0;
                    this.colorIiiPlus2Repetition = 0;
                    this.colorIiiPlus3Repetition = 0;
                    this.colorIiiPlus4Repetition = 0;
                    this.colorIiiPlus5Repetition = 0;
                    this.colorIiiPlus6Repetition += 1;
                }
            }
        }
        if (tableId === "parity") {
            if (value === "&#9633;") {
                // Do nothing when number is zero.
            }
            // Calculate X+
            if (value === "O") {
                if(previousRowIndex === 1) {
                    this.parityXPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.parityXPlus1Repetition = 0;
                    this.parityXPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.parityXPlus1Repetition = 0;
                    this.parityXPlus2Repetition = 0;
                    this.parityXPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.parityXPlus1Repetition = 0;
                    this.parityXPlus2Repetition = 0;
                    this.parityXPlus3Repetition = 0;
                    this.parityXPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.parityXPlus1Repetition = 0;
                    this.parityXPlus2Repetition = 0;
                    this.parityXPlus3Repetition = 0;
                    this.parityXPlus4Repetition = 0;
                    this.parityXPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.parityXPlus1Repetition = 0;
                    this.parityXPlus2Repetition = 0;
                    this.parityXPlus3Repetition = 0;
                    this.parityXPlus4Repetition = 0;
                    this.parityXPlus5Repetition = 0;
                    this.parityXPlus6Repetition += 1;
                }
            }
            // Calculate O+
            if (value === "X") {
                if(previousRowIndex === 1) {
                    this.parityOPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.parityOPlus1Repetition = 0;
                    this.parityOPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.parityOPlus1Repetition = 0;
                    this.parityOPlus2Repetition = 0;
                    this.parityOPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.parityOPlus1Repetition = 0;
                    this.parityOPlus2Repetition = 0;
                    this.parityOPlus3Repetition = 0;
                    this.parityOPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.parityOPlus1Repetition = 0;
                    this.parityOPlus2Repetition = 0;
                    this.parityOPlus3Repetition = 0;
                    this.parityOPlus4Repetition = 0;
                    this.parityOPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.parityOPlus1Repetition = 0;
                    this.parityOPlus2Repetition = 0;
                    this.parityOPlus3Repetition = 0;
                    this.parityOPlus4Repetition = 0;
                    this.parityOPlus5Repetition = 0;
                    this.parityOPlus6Repetition += 1;
                }
            }
            // Calculate XO+
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.parityXoPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.parityXoPlus1Repetition = 0;
                    this.parityXoPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.parityXoPlus1Repetition = 0;
                    this.parityXoPlus2Repetition = 0;
                    this.parityXoPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.parityXoPlus1Repetition = 0;
                    this.parityXoPlus2Repetition = 0;
                    this.parityXoPlus3Repetition = 0;
                    this.parityXoPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.parityXoPlus1Repetition = 0;
                    this.parityXoPlus2Repetition = 0;
                    this.parityXoPlus3Repetition = 0;
                    this.parityXoPlus4Repetition = 0;
                    this.parityXoPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.parityXoPlus1Repetition = 0;
                    this.parityXoPlus2Repetition = 0;
                    this.parityXoPlus3Repetition = 0;
                    this.parityXoPlus4Repetition = 0;
                    this.parityXoPlus5Repetition = 0;
                    this.parityXoPlus6Repetition += 1;
                }
            }
            // Calculate X-
            if (value === "O") {
                if(previousRowIndex === 1) {
                    this.parityXMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.parityXMinus1Repetition += 1;
                    this.parityXMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.parityXMinus1Repetition += 1;
                    this.parityXMinus2Repetition += 1;
                    this.parityXMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.parityXMinus1Repetition += 1;
                    this.parityXMinus2Repetition += 1;
                    this.parityXMinus3Repetition += 1;
                    this.parityXMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.parityXMinus1Repetition += 1;
                    this.parityXMinus2Repetition += 1;
                    this.parityXMinus3Repetition += 1;
                    this.parityXMinus4Repetition += 1;
                    this.parityXMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.parityXMinus1Repetition += 1;
                    this.parityXMinus2Repetition += 1;
                    this.parityXMinus3Repetition += 1;
                    this.parityXMinus4Repetition += 1;
                    this.parityXMinus5Repetition += 1;
                    this.parityXMinus6Repetition = 0;
                }
            }
            // Calculate O-
            if (value === "X") {
                if(previousRowIndex === 1) {
                    this.parityOMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.parityOMinus1Repetition += 1;
                    this.parityOMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.parityOMinus1Repetition += 1;
                    this.parityOMinus2Repetition += 1;
                    this.parityOMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.parityOMinus1Repetition += 1;
                    this.parityOMinus2Repetition += 1;
                    this.parityOMinus3Repetition += 1;
                    this.parityOMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.parityOMinus1Repetition += 1;
                    this.parityOMinus2Repetition += 1;
                    this.parityOMinus3Repetition += 1;
                    this.parityOMinus4Repetition += 1;
                    this.parityOMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.parityOMinus1Repetition += 1;
                    this.parityOMinus2Repetition += 1;
                    this.parityOMinus3Repetition += 1;
                    this.parityOMinus4Repetition += 1;
                    this.parityOMinus5Repetition += 1;
                    this.parityOMinus6Repetition = 0;
                }
            }
            // Calculate XO-
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.parityXoMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.parityXoMinus1Repetition += 1;
                    this.parityXoMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.parityXoMinus1Repetition += 1;
                    this.parityXoMinus2Repetition += 1;
                    this.parityXoMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.parityXoMinus1Repetition += 1;
                    this.parityXoMinus2Repetition += 1;
                    this.parityXoMinus3Repetition += 1;
                    this.parityXoMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.parityXoMinus1Repetition += 1;
                    this.parityXoMinus2Repetition += 1;
                    this.parityXoMinus3Repetition += 1;
                    this.parityXoMinus4Repetition += 1;
                    this.parityXoMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.parityXoMinus1Repetition += 1;
                    this.parityXoMinus2Repetition += 1;
                    this.parityXoMinus3Repetition += 1;
                    this.parityXoMinus4Repetition += 1;
                    this.parityXoMinus5Repetition += 1;
                    this.parityXoMinus6Repetition = 0;
                }
            }
        }
        if (tableId === "range") {
            if (value === "&#9633;") {
                // Do nothing when number is zero.
            }
            // Calculate X+
            if (value === "O") {
                if(previousRowIndex === 1) {
                    this.rangeXPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.rangeXPlus1Repetition = 0;
                    this.rangeXPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.rangeXPlus1Repetition = 0;
                    this.rangeXPlus2Repetition = 0;
                    this.rangeXPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.rangeXPlus1Repetition = 0;
                    this.rangeXPlus2Repetition = 0;
                    this.rangeXPlus3Repetition = 0;
                    this.rangeXPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.rangeXPlus1Repetition = 0;
                    this.rangeXPlus2Repetition = 0;
                    this.rangeXPlus3Repetition = 0;
                    this.rangeXPlus4Repetition = 0;
                    this.rangeXPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.rangeXPlus1Repetition = 0;
                    this.rangeXPlus2Repetition = 0;
                    this.rangeXPlus3Repetition = 0;
                    this.rangeXPlus4Repetition = 0;
                    this.rangeXPlus5Repetition = 0;
                    this.rangeXPlus6Repetition += 1;
                }
            }
            // Calculate O+
            if (value === "X") {
                if(previousRowIndex === 1) {
                    this.rangeOPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.rangeOPlus1Repetition = 0;
                    this.rangeOPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.rangeOPlus1Repetition = 0;
                    this.rangeOPlus2Repetition = 0;
                    this.rangeOPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.rangeOPlus1Repetition = 0;
                    this.rangeOPlus2Repetition = 0;
                    this.rangeOPlus3Repetition = 0;
                    this.rangeOPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.rangeOPlus1Repetition = 0;
                    this.rangeOPlus2Repetition = 0;
                    this.rangeOPlus3Repetition = 0;
                    this.rangeOPlus4Repetition = 0;
                    this.rangeOPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.rangeOPlus1Repetition = 0;;
                    this.rangeOPlus2Repetition = 0;
                    this.rangeOPlus3Repetition = 0;
                    this.rangeOPlus4Repetition = 0;
                    this.rangeOPlus5Repetition = 0;
                    this.rangeOPlus6Repetition += 1;
                }
            }
            // Calculate XO+
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.rangeXoPlus1Repetition += 1;
                }
                if(previousRowIndex === 2) {
                    this.rangeXoPlus1Repetition = 0;
                    this.rangeXoPlus2Repetition += 1;
                }
                if(previousRowIndex === 3) {
                    this.rangeXoPlus1Repetition = 0;
                    this.rangeXoPlus2Repetition = 0;
                    this.rangeXoPlus3Repetition += 1;
                }
                if(previousRowIndex === 4) {
                    this.rangeXoPlus1Repetition = 0;
                    this.rangeXoPlus2Repetition = 0;
                    this.rangeXoPlus3Repetition = 0;
                    this.rangeXoPlus4Repetition += 1;
                }
                if(previousRowIndex === 5) {
                    this.rangeXoPlus1Repetition = 0;
                    this.rangeXoPlus2Repetition = 0;
                    this.rangeXoPlus3Repetition = 0;
                    this.rangeXoPlus4Repetition = 0;
                    this.rangeXoPlus5Repetition += 1;
                }
                if(previousRowIndex === 6) {
                    this.rangeXoPlus1Repetition = 0;
                    this.rangeXoPlus2Repetition = 0;
                    this.rangeXoPlus3Repetition = 0;
                    this.rangeXoPlus4Repetition = 0;
                    this.rangeXoPlus5Repetition = 0;
                    this.rangeXoPlus6Repetition += 1;
                }
            }
            // Calculate X-
            if (value === "O") {
                if(previousRowIndex === 1) {
                    this.rangeXMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.rangeXMinus1Repetition += 1;
                    this.rangeXMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.rangeXMinus1Repetition += 1;
                    this.rangeXMinus2Repetition += 1;
                    this.rangeXMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.rangeXMinus1Repetition += 1;
                    this.rangeXMinus2Repetition += 1;
                    this.rangeXMinus3Repetition += 1;
                    this.rangeXMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.rangeXMinus1Repetition += 1;
                    this.rangeXMinus2Repetition += 1;
                    this.rangeXMinus3Repetition += 1;
                    this.rangeXMinus4Repetition += 1;
                    this.rangeXMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.rangeXMinus1Repetition += 1;
                    this.rangeXMinus2Repetition += 1;
                    this.rangeXMinus3Repetition += 1;
                    this.rangeXMinus4Repetition += 1;
                    this.rangeXMinus5Repetition += 1;
                    this.rangeXMinus6Repetition = 0;
                }
            }
            // Calculate O-
            if (value === "X") {
                if(previousRowIndex === 1) {
                    this.rangeOMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.rangeOMinus1Repetition += 1;
                    this.rangeOMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.rangeOMinus1Repetition += 1;
                    this.rangeOMinus2Repetition += 1;
                    this.rangeOMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.rangeOMinus1Repetition += 1;
                    this.rangeOMinus2Repetition += 1;
                    this.rangeOMinus3Repetition += 1;
                    this.rangeOMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.rangeOMinus1Repetition += 1;
                    this.rangeOMinus2Repetition += 1;
                    this.rangeOMinus3Repetition += 1;
                    this.rangeOMinus4Repetition += 1;
                    this.rangeOMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.rangeOMinus1Repetition += 1;
                    this.rangeOMinus2Repetition += 1;
                    this.rangeOMinus3Repetition += 1;
                    this.rangeOMinus4Repetition += 1;
                    this.rangeOMinus5Repetition += 1;
                    this.rangeOMinus6Repetition = 0;
                }
            }
            // Calculate XO-
            if (value === "X" || value === "O") {
                if(previousRowIndex === 1) {
                    this.rangeXoMinus1Repetition = 0;
                }
                if(previousRowIndex === 2) {
                    this.rangeXoMinus1Repetition += 1;
                    this.rangeXoMinus2Repetition = 0;
                }
                if(previousRowIndex === 3) {
                    this.rangeXoMinus1Repetition += 1;
                    this.rangeXoMinus2Repetition += 1;
                    this.rangeXoMinus3Repetition = 0;
                }
                if(previousRowIndex === 4) {
                    this.rangeXoMinus1Repetition += 1;
                    this.rangeXoMinus2Repetition += 1;
                    this.rangeXoMinus3Repetition += 1;
                    this.rangeXoMinus4Repetition = 0;
                }
                if(previousRowIndex === 5) {
                    this.rangeXoMinus1Repetition += 1;
                    this.rangeXoMinus2Repetition += 1;
                    this.rangeXoMinus3Repetition += 1;
                    this.rangeXoMinus4Repetition += 1;
                    this.rangeXoMinus5Repetition = 0;
                }
                if(previousRowIndex === 6) {
                    this.rangeXoMinus1Repetition += 1;
                    this.rangeXoMinus2Repetition += 1;
                    this.rangeXoMinus3Repetition += 1;
                    this.rangeXoMinus4Repetition += 1;
                    this.rangeXoMinus5Repetition += 1;
                    this.rangeXoMinus6Repetition = 0;
                }
            }
        }
    }

    updateUserInterface() {
        $("#color-x-plus-1-repetition").text(this.colorXPlus1Repetition);
        $("#color-o-plus-1-repetition").text(this.colorOPlus1Repetition);
        $("#color-xo-plus-1-repetition").text(this.colorXoPlus1Repetition);
        $("#color-x-minus-1-repetition").text(this.colorXMinus1Repetition);
        $("#color-o-minus-1-repetition").text(this.colorOMinus1Repetition);
        $("#color-xo-minus-1-repetition").text(this.colorXoMinus1Repetition);
        $("#color-iii-plus-1-repetition").text(this.colorIiiPlus1Repetition);
        $("#color-iii-minus-1-repetition").text(this.colorIiiMinus1Repetition);
        $("#color-x-plus-2-repetition").text(this.colorXPlus2Repetition);
        $("#color-o-plus-2-repetition").text(this.colorOPlus2Repetition);
        $("#color-xo-plus-2-repetition").text(this.colorXoPlus2Repetition);
        $("#color-x-minus-2-repetition").text(this.colorXMinus2Repetition);
        $("#color-o-minus-2-repetition").text(this.colorOMinus2Repetition);
        $("#color-xo-minus-2-repetition").text(this.colorXoMinus2Repetition);
        $("#color-iii-plus-2-repetition").text(this.colorIiiPlus2Repetition);
        $("#color-iii-minus-2-repetition").text(this.colorIiiMinus2Repetition);
        $("#color-x-plus-3-repetition").text(this.colorXPlus3Repetition);
        $("#color-o-plus-3-repetition").text(this.colorOPlus3Repetition);
        $("#color-xo-plus-3-repetition").text(this.colorXoPlus3Repetition);
        $("#color-x-minus-3-repetition").text(this.colorXMinus3Repetition);
        $("#color-o-minus-3-repetition").text(this.colorOMinus3Repetition);
        $("#color-xo-minus-3-repetition").text(this.colorXoMinus3Repetition);
        $("#color-iii-plus-3-repetition").text(this.colorIiiPlus3Repetition);
        $("#color-iii-minus-3-repetition").text(this.colorIiiMinus3Repetition);
        $("#color-x-plus-4-repetition").text(this.colorXPlus4Repetition);
        $("#color-o-plus-4-repetition").text(this.colorOPlus4Repetition);
        $("#color-xo-plus-4-repetition").text(this.colorXoPlus4Repetition);
        $("#color-x-minus-4-repetition").text(this.colorXMinus4Repetition);
        $("#color-o-minus-4-repetition").text(this.colorOMinus4Repetition);
        $("#color-xo-minus-4-repetition").text(this.colorXoMinus4Repetition);
        $("#color-iii-plus-4-repetition").text(this.colorIiiPlus4Repetition);
        $("#color-iii-minus-4-repetition").text(this.colorIiiMinus4Repetition);
        $("#color-x-plus-5-repetition").text(this.colorXPlus5Repetition);
        $("#color-o-plus-5-repetition").text(this.colorOPlus5Repetition);
        $("#color-xo-plus-5-repetition").text(this.colorXoPlus5Repetition);
        $("#color-x-minus-5-repetition").text(this.colorXMinus5Repetition);
        $("#color-o-minus-5-repetition").text(this.colorOMinus5Repetition);
        $("#color-xo-minus-5-repetition").text(this.colorXoMinus5Repetition);
        $("#color-x-plus-6-repetition").text(this.colorXPlus6Repetition);
        $("#color-o-plus-6-repetition").text(this.colorOPlus6Repetition);
        $("#color-xo-plus-6-repetition").text(this.colorXoPlus6Repetition);
        $("#color-x-minus-6-repetition").text(this.colorXMinus6Repetition);
        $("#color-o-minus-6-repetition").text(this.colorOMinus6Repetition);
        $("#color-xo-minus-6-repetition").text(this.colorXoMinus6Repetition);

        $("#parity-x-plus-1-repetition").text(this.parityXPlus1Repetition);
        $("#parity-o-plus-1-repetition").text(this.parityOPlus1Repetition);
        $("#parity-xo-plus-1-repetition").text(this.parityXoPlus1Repetition);
        $("#parity-x-minus-1-repetition").text(this.parityXMinus1Repetition);
        $("#parity-o-minus-1-repetition").text(this.parityOMinus1Repetition);
        $("#parity-xo-minus-1-repetition").text(this.parityXoMinus1Repetition);
        $("#parity-iii-plus-1-repetition").text(this.parityIiiPlus1Repetition);
        $("#parity-iii-minus-1-repetition").text(this.parityIiiMinus1Repetition);
        $("#parity-x-plus-2-repetition").text(this.parityXPlus2Repetition);
        $("#parity-o-plus-2-repetition").text(this.parityOPlus2Repetition);
        $("#parity-xo-plus-2-repetition").text(this.parityXoPlus2Repetition);
        $("#parity-x-minus-2-repetition").text(this.parityXMinus2Repetition);
        $("#parity-o-minus-2-repetition").text(this.parityOMinus2Repetition);
        $("#parity-xo-minus-2-repetition").text(this.parityXoMinus2Repetition);
        $("#parity-iii-plus-2-repetition").text(this.parityIiiPlus2Repetition);
        $("#parity-iii-minus-2-repetition").text(this.parityIiiMinus2Repetition);
        $("#parity-x-plus-3-repetition").text(this.parityXPlus3Repetition);
        $("#parity-o-plus-3-repetition").text(this.parityOPlus3Repetition);
        $("#parity-xo-plus-3-repetition").text(this.parityXoPlus3Repetition);
        $("#parity-x-minus-3-repetition").text(this.parityXMinus3Repetition);
        $("#parity-o-minus-3-repetition").text(this.parityOMinus3Repetition);
        $("#parity-xo-minus-3-repetition").text(this.parityXoMinus3Repetition);
        $("#parity-iii-plus-3-repetition").text(this.parityIiiPlus3Repetition);
        $("#parity-iii-minus-3-repetition").text(this.parityIiiMinus3Repetition);
        $("#parity-x-plus-4-repetition").text(this.parityXPlus4Repetition);
        $("#parity-o-plus-4-repetition").text(this.parityOPlus4Repetition);
        $("#parity-xo-plus-4-repetition").text(this.parityXoPlus4Repetition);
        $("#parity-x-minus-4-repetition").text(this.parityXMinus4Repetition);
        $("#parity-o-minus-4-repetition").text(this.parityOMinus4Repetition);
        $("#parity-xo-minus-4-repetition").text(this.parityXoMinus4Repetition);
        $("#parity-iii-plus-4-repetition").text(this.parityIiiPlus4Repetition);
        $("#parity-iii-minus-4-repetition").text(this.parityIiiMinus4Repetition);
        $("#parity-x-plus-5-repetition").text(this.parityXPlus5Repetition);
        $("#parity-o-plus-5-repetition").text(this.parityOPlus5Repetition);
        $("#parity-xo-plus-5-repetition").text(this.parityXoPlus5Repetition);
        $("#parity-x-minus-5-repetition").text(this.parityXMinus5Repetition);
        $("#parity-o-minus-5-repetition").text(this.parityOMinus5Repetition);
        $("#parity-xo-minus-5-repetition").text(this.parityXoMinus5Repetition);
        $("#parity-x-plus-6-repetition").text(this.parityXPlus6Repetition);
        $("#parity-o-plus-6-repetition").text(this.parityOPlus6Repetition);
        $("#parity-xo-plus-6-repetition").text(this.parityXoPlus6Repetition);
        $("#parity-x-minus-6-repetition").text(this.parityXMinus6Repetition);
        $("#parity-o-minus-6-repetition").text(this.parityOMinus6Repetition);
        $("#parity-xo-minus-6-repetition").text(this.parityXoMinus6Repetition);

        $("#range-x-plus-1-repetition").text(this.rangeXPlus1Repetition);
        $("#range-o-plus-1-repetition").text(this.rangeOPlus1Repetition);
        $("#range-xo-plus-1-repetition").text(this.rangeXoPlus1Repetition);
        $("#range-x-minus-1-repetition").text(this.rangeXMinus1Repetition);
        $("#range-o-minus-1-repetition").text(this.rangeOMinus1Repetition);
        $("#range-xo-minus-1-repetition").text(this.rangeXoMinus1Repetition);
        $("#range-iii-plus-1-repetition").text(this.rangeIiiPlus1Repetition);
        $("#range-iii-minus-1-repetition").text(this.rangeIiiMinus1Repetition);
        $("#range-x-plus-2-repetition").text(this.rangeXPlus2Repetition);
        $("#range-o-plus-2-repetition").text(this.rangeOPlus2Repetition);
        $("#range-xo-plus-2-repetition").text(this.rangeXoPlus2Repetition);
        $("#range-x-minus-2-repetition").text(this.rangeXMinus2Repetition);
        $("#range-o-minus-2-repetition").text(this.rangeOMinus2Repetition);
        $("#range-xo-minus-2-repetition").text(this.rangeXoMinus2Repetition);
        $("#range-iii-plus-2-repetition").text(this.rangeIiiPlus2Repetition);
        $("#range-iii-minus-2-repetition").text(this.rangeIiiMinus2Repetition);
        $("#range-x-plus-3-repetition").text(this.rangeXPlus3Repetition);
        $("#range-o-plus-3-repetition").text(this.rangeOPlus3Repetition);
        $("#range-xo-plus-3-repetition").text(this.rangeXoPlus3Repetition);
        $("#range-x-minus-3-repetition").text(this.rangeXMinus3Repetition);
        $("#range-o-minus-3-repetition").text(this.rangeOMinus3Repetition);
        $("#range-xo-minus-3-repetition").text(this.rangeXoMinus3Repetition);
        $("#range-iii-plus-3-repetition").text(this.rangeIiiPlus3Repetition);
        $("#range-iii-minus-3-repetition").text(this.rangeIiiMinus3Repetition);
        $("#range-x-plus-4-repetition").text(this.rangeXPlus4Repetition);
        $("#range-o-plus-4-repetition").text(this.rangeOPlus4Repetition);
        $("#range-xo-plus-4-repetition").text(this.rangeXoPlus4Repetition);
        $("#range-x-minus-4-repetition").text(this.rangeXMinus4Repetition);
        $("#range-o-minus-4-repetition").text(this.rangeOMinus4Repetition);
        $("#range-xo-minus-4-repetition").text(this.rangeXoMinus4Repetition);
        $("#range-iii-plus-4-repetition").text(this.rangeIiiPlus4Repetition);
        $("#range-iii-minus-4-repetition").text(this.rangeIiiMinus4Repetition);
        $("#range-x-plus-5-repetition").text(this.rangeXPlus5Repetition);
        $("#range-o-plus-5-repetition").text(this.rangeOPlus5Repetition);
        $("#range-xo-plus-5-repetition").text(this.rangeXoPlus5Repetition);
        $("#range-x-minus-5-repetition").text(this.rangeXMinus5Repetition);
        $("#range-o-minus-5-repetition").text(this.rangeOMinus5Repetition);
        $("#range-xo-minus-5-repetition").text(this.rangeXoMinus5Repetition);
        $("#range-x-plus-6-repetition").text(this.rangeXPlus6Repetition);
        $("#range-o-plus-6-repetition").text(this.rangeOPlus6Repetition);
        $("#range-xo-plus-6-repetition").text(this.rangeXoPlus6Repetition);
        $("#range-x-minus-6-repetition").text(this.rangeXMinus6Repetition);
        $("#range-o-minus-6-repetition").text(this.rangeOMinus6Repetition);
        $("#range-xo-minus-6-repetition").text(this.rangeXoMinus6Repetition);
    }

    cleanUpUserInterface() {
        this.colorXPlus1Repetition = 0;
        this.colorOPlus1Repetition = 0;
        this.colorXoPlus1Repetition = 0;
        this.colorXMinus1Repetition = 0;
        this.colorOMinus1Repetition = 0;
        this.colorXoMinus1Repetition = 0;
        this.colorIiiPlus1Repetition = 0;
        this.colorIiiMinus1Repetition = 0;
        this.colorXPlus2Repetition = 0;
        this.colorOPlus2Repetition = 0;
        this.colorXoPlus2Repetition = 0;
        this.colorXMinus2Repetition = 0;
        this.colorOMinus2Repetition = 0;
        this.colorXoMinus2Repetition = 0;
        this.colorIiiPlus2Repetition = 0;
        this.colorIiiMinus2Repetition = 0;
        this.colorXPlus3Repetition = 0;
        this.colorOPlus3Repetition = 0;
        this.colorXoPlus3Repetition = 0;
        this.colorXMinus3Repetition = 0;
        this.colorOMinus3Repetition = 0;
        this.colorXoMinus3Repetition = 0;
        this.colorIiiPlus3Repetition = 0;
        this.colorIiiMinus3Repetition = 0;
        this.colorXPlus4Repetition = 0;
        this.colorOPlus4Repetition = 0;
        this.colorXoPlus4Repetition = 0;
        this.colorXMinus4Repetition = 0;
        this.colorOMinus4Repetition = 0;
        this.colorXoMinus4Repetition = 0;
        this.colorIiiPlus4Repetition = 0;
        this.colorIiiMinus4Repetition = 0;
        this.colorXPlus5Repetition = 0;
        this.colorOPlus5Repetition = 0;
        this.colorXoPlus5Repetition = 0;
        this.colorXMinus5Repetition = 0;
        this.colorOMinus5Repetition = 0;
        this.colorXoMinus5Repetition = 0;
        this.colorXPlus6Repetition = 0;
        this.colorOPlus6Repetition = 0;
        this.colorXoPlus6Repetition = 0;
        this.colorXMinus6Repetition = 0;
        this.colorOMinus6Repetition = 0;
        this.colorXoMinus6Repetition = 0;

        this.parityXPlus1Repetition = 0;
        this.parityOPlus1Repetition = 0;
        this.parityXoPlus1Repetition = 0;
        this.parityXMinus1Repetition = 0;
        this.parityOMinus1Repetition = 0;
        this.parityXoMinus1Repetition = 0;
        this.parityIiiPlus1Repetition = 0;
        this.parityIiiMinus1Repetition = 0;
        this.parityXPlus2Repetition = 0;
        this.parityOPlus2Repetition = 0;
        this.parityXoPlus2Repetition = 0;
        this.parityXMinus2Repetition = 0;
        this.parityOMinus2Repetition = 0;
        this.parityXoMinus2Repetition = 0;
        this.parityIiiPlus2Repetition = 0;
        this.parityIiiMinus2Repetition = 0;
        this.parityXPlus3Repetition = 0;
        this.parityOPlus3Repetition = 0;
        this.parityXoPlus3Repetition = 0;
        this.parityXMinus3Repetition = 0;
        this.parityOMinus3Repetition = 0;
        this.parityXoMinus3Repetition = 0;
        this.parityIiiPlus3Repetition = 0;
        this.parityIiiMinus3Repetition = 0;
        this.parityXPlus4Repetition = 0;
        this.parityOPlus4Repetition = 0;
        this.parityXoPlus4Repetition = 0;
        this.parityXMinus4Repetition = 0;
        this.parityOMinus4Repetition = 0;
        this.parityXoMinus4Repetition = 0;
        this.parityIiiPlus4Repetition = 0;
        this.parityIiiMinus4Repetition = 0;
        this.parityXPlus5Repetition = 0;
        this.parityOPlus5Repetition = 0;
        this.parityXoPlus5Repetition = 0;
        this.parityXMinus5Repetition = 0;
        this.parityOMinus5Repetition = 0;
        this.parityXoMinus5Repetition = 0;
        this.parityXPlus6Repetition = 0;
        this.parityOPlus6Repetition = 0;
        this.parityXoPlus6Repetition = 0;
        this.parityXMinus6Repetition = 0;
        this.parityOMinus6Repetition = 0;
        this.parityXoMinus6Repetition = 0;

        this.rangeXPlus1Repetition = 0;
        this.rangeOPlus1Repetition = 0;
        this.rangeXoPlus1Repetition = 0;
        this.rangeXMinus1Repetition = 0;
        this.rangeOMinus1Repetition = 0;
        this.rangeXoMinus1Repetition = 0;
        this.rangeIiiPlus1Repetition = 0;
        this.rangeIiiMinus1Repetition = 0;
        this.rangeXPlus2Repetition = 0;
        this.rangeOPlus2Repetition = 0;
        this.rangeXoPlus2Repetition = 0;
        this.rangeXMinus2Repetition = 0;
        this.rangeOMinus2Repetition = 0;
        this.rangeXoMinus2Repetition = 0;
        this.rangeIiiPlus2Repetition = 0;
        this.rangeIiiMinus2Repetition = 0;
        this.rangeXPlus3Repetition = 0;
        this.rangeOPlus3Repetition = 0;
        this.rangeXoPlus3Repetition = 0;
        this.rangeXMinus3Repetition = 0;
        this.rangeOMinus3Repetition = 0;
        this.rangeXoMinus3Repetition = 0;
        this.rangeIiiPlus3Repetition = 0;
        this.rangeIiiMinus3Repetition = 0;
        this.rangeXPlus4Repetition = 0;
        this.rangeOPlus4Repetition = 0;
        this.rangeXoPlus4Repetition = 0;
        this.rangeXMinus4Repetition = 0;
        this.rangeOMinus4Repetition = 0;
        this.rangeXoMinus4Repetition = 0;
        this.rangeIiiPlus4Repetition = 0;
        this.rangeIiiMinus4Repetition = 0;
        this.rangeXPlus5Repetition = 0;
        this.rangeOPlus5Repetition = 0;
        this.rangeXoPlus5Repetition = 0;
        this.rangeXMinus5Repetition = 0;
        this.rangeOMinus5Repetition = 0;
        this.rangeXoMinus5Repetition = 0;
        this.rangeXPlus6Repetition = 0;
        this.rangeOPlus6Repetition = 0;
        this.rangeXoPlus6Repetition = 0;
        this.rangeXMinus6Repetition = 0;
        this.rangeOMinus6Repetition = 0;
        this.rangeXoMinus6Repetition = 0;
    
        $("#color-x-plus-1-repetition").text("0");
        $("#color-o-plus-1-repetition").text("0");
        $("#color-xo-plus-1-repetition").text("0");
        $("#color-x-minus-1-repetition").text("0");
        $("#color-o-minus-1-repetition").text("0");
        $("#color-xo-minus-1-repetition").text("0");
        $("#color-iii-plus-1-repetition").text("0");
        $("#color-iii-minus-1-repetition").text("0");
        $("#color-x-plus-2-repetition").text("0");
        $("#color-o-plus-2-repetition").text("0");
        $("#color-xo-plus-2-repetition").text("0");
        $("#color-x-minus-2-repetition").text("0");
        $("#color-o-minus-2-repetition").text("0");
        $("#color-xo-minus-2-repetition").text("0");
        $("#color-iii-plus-2-repetition").text("0");
        $("#color-iii-minus-2-repetition").text("0");
        $("#color-x-plus-3-repetition").text("0");
        $("#color-o-plus-3-repetition").text("0");
        $("#color-xo-plus-3-repetition").text("0");
        $("#color-x-minus-3-repetition").text("0");
        $("#color-o-minus-3-repetition").text("0");
        $("#color-xo-minus-3-repetition").text("0");
        $("#color-iii-plus-3-repetition").text("0");
        $("#color-iii-minus-3-repetition").text("0");
        $("#color-x-plus-4-repetition").text("0");
        $("#color-o-plus-4-repetition").text("0");
        $("#color-xo-plus-4-repetition").text("0");
        $("#color-x-minus-4-repetition").text("0");
        $("#color-o-minus-4-repetition").text("0");
        $("#color-xo-minus-4-repetition").text("0");
        $("#color-iii-plus-4-repetition").text("0");
        $("#color-iii-minus-4-repetition").text("0");
        $("#color-x-plus-5-repetition").text("0");
        $("#color-o-plus-5-repetition").text("0");
        $("#color-xo-plus-5-repetition").text("0");
        $("#color-x-minus-5-repetition").text("0");
        $("#color-o-minus-5-repetition").text("0");
        $("#color-xo-minus-5-repetition").text("0");
        $("#color-x-plus-6-repetition").text("0");
        $("#color-o-plus-6-repetition").text("0");
        $("#color-xo-plus-6-repetition").text("0");
        $("#color-x-minus-6-repetition").text("0");
        $("#color-o-minus-6-repetition").text("0");
        $("#color-xo-minus-6-repetition").text("0");

        $("#parity-x-plus-1-repetition").text("0");
        $("#parity-o-plus-1-repetition").text("0");
        $("#parity-xo-plus-1-repetition").text("0");
        $("#parity-x-minus-1-repetition").text("0");
        $("#parity-o-minus-1-repetition").text("0");
        $("#parity-xo-minus-1-repetition").text("0");
        $("#parity-iii-plus-1-repetition").text("0");
        $("#parity-iii-minus-1-repetition").text("0");
        $("#parity-x-plus-2-repetition").text("0");
        $("#parity-o-plus-2-repetition").text("0");
        $("#parity-xo-plus-2-repetition").text("0");
        $("#parity-x-minus-2-repetition").text("0");
        $("#parity-o-minus-2-repetition").text("0");
        $("#parity-xo-minus-2-repetition").text("0");
        $("#parity-iii-plus-2-repetition").text("0");
        $("#parity-iii-minus-2-repetition").text("0");
        $("#parity-x-plus-3-repetition").text("0");
        $("#parity-o-plus-3-repetition").text("0");
        $("#parity-xo-plus-3-repetition").text("0");
        $("#parity-x-minus-3-repetition").text("0");
        $("#parity-o-minus-3-repetition").text("0");
        $("#parity-xo-minus-3-repetition").text("0");
        $("#parity-iii-plus-3-repetition").text("0");
        $("#parity-iii-minus-3-repetition").text("0");
        $("#parity-x-plus-4-repetition").text("0");
        $("#parity-o-plus-4-repetition").text("0");
        $("#parity-xo-plus-4-repetition").text("0");
        $("#parity-x-minus-4-repetition").text("0");
        $("#parity-o-minus-4-repetition").text("0");
        $("#parity-xo-minus-4-repetition").text("0");
        $("#parity-iii-plus-4-repetition").text("0");
        $("#parity-iii-minus-4-repetition").text("0");
        $("#parity-x-plus-5-repetition").text("0");
        $("#parity-o-plus-5-repetition").text("0");
        $("#parity-xo-plus-5-repetition").text("0");
        $("#parity-x-minus-5-repetition").text("0");
        $("#parity-o-minus-5-repetition").text("0");
        $("#parity-xo-minus-5-repetition").text("0");
        $("#parity-x-plus-6-repetition").text("0");
        $("#parity-o-plus-6-repetition").text("0");
        $("#parity-xo-plus-6-repetition").text("0");
        $("#parity-x-minus-6-repetition").text("0");
        $("#parity-o-minus-6-repetition").text("0");
        $("#parity-xo-minus-6-repetition").text("0");

        $("#range-x-plus-1-repetition").text("0");
        $("#range-o-plus-1-repetition").text("0");
        $("#range-xo-plus-1-repetition").text("0");
        $("#range-x-minus-1-repetition").text("0");
        $("#range-o-minus-1-repetition").text("0");
        $("#range-xo-minus-1-repetition").text("0");
        $("#range-iii-plus-1-repetition").text("0");
        $("#range-iii-minus-1-repetition").text("0");
        $("#range-x-plus-2-repetition").text("0");
        $("#range-o-plus-2-repetition").text("0");
        $("#range-xo-plus-2-repetition").text("0");
        $("#range-x-minus-2-repetition").text("0");
        $("#range-o-minus-2-repetition").text("0");
        $("#range-xo-minus-2-repetition").text("0");
        $("#range-iii-plus-2-repetition").text("0");
        $("#range-iii-minus-2-repetition").text("0");
        $("#range-x-plus-3-repetition").text("0");
        $("#range-o-plus-3-repetition").text("0");
        $("#range-xo-plus-3-repetition").text("0");
        $("#range-x-minus-3-repetition").text("0");
        $("#range-o-minus-3-repetition").text("0");
        $("#range-xo-minus-3-repetition").text("0");
        $("#range-iii-plus-3-repetition").text("0");
        $("#range-iii-minus-3-repetition").text("0");
        $("#range-x-plus-4-repetition").text("0");
        $("#range-o-plus-4-repetition").text("0");
        $("#range-xo-plus-4-repetition").text("0");
        $("#range-x-minus-4-repetition").text("0");
        $("#range-o-minus-4-repetition").text("0");
        $("#range-xo-minus-4-repetition").text("0");
        $("#range-iii-plus-4-repetition").text("0");
        $("#range-iii-minus-4-repetition").text("0");
        $("#range-x-plus-5-repetition").text("0");
        $("#range-o-plus-5-repetition").text("0");
        $("#range-xo-plus-5-repetition").text("0");
        $("#range-x-minus-5-repetition").text("0");
        $("#range-o-minus-5-repetition").text("0");
        $("#range-xo-minus-5-repetition").text("0");
        $("#range-x-plus-6-repetition").text("0");
        $("#range-o-plus-6-repetition").text("0");
        $("#range-xo-plus-6-repetition").text("0");
        $("#range-x-minus-6-repetition").text("0");
        $("#range-o-minus-6-repetition").text("0");
        $("#range-xo-minus-6-repetition").text("0");
    }
}