package bc.roulette.history;

import bc.roulette.history.spin_enums.Range;
import bc.roulette.history.spin_enums.Parity;
import bc.roulette.history.spin_enums.Color;

class NumberRecognizer {

    Color recognizeColor(Number number) {
        Color color = null;

        final Integer[] RED_NUMBERS = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        final Integer[] BLACK_NUMBERS = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

        if (number.getValue() == 0) {
            color = Color.GREEN;
        }

        if (isInArray(number.getValue(), RED_NUMBERS)) {
            color = Color.RED;
        }

        if (isInArray(number.getValue(), BLACK_NUMBERS)) {
            color = Color.BLACK;
        }

        if (color == null) {
            throw new NullPointerException("Color is null");
        }

        return color;
    }

    Parity recognizeParity(Number number) {
        Parity parity = null;
        
        final Integer[] EVEN_NUMBERS = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        final Integer[] ODD_NUMBERS = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};

        if (number.getValue() == 0) {
            parity = Parity.NONE;
        }

        if (isInArray(number.getValue(), EVEN_NUMBERS)) {
            parity = Parity.EVEN;
        }

        if (isInArray(number.getValue(), ODD_NUMBERS)) {
            parity = Parity.ODD;
        }

        if (parity == null) {
            throw new NullPointerException("Parity is null");
        }

        return parity;
    }

    Range recognizeRange(Number number) {
        Range range = null;
        
        final Integer[] LESS_NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        final Integer[] GREAT_NUMBERS = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

        if (number.getValue() == 0) {
            range = Range.NONE;
        }

        if (isInArray(number.getValue(), LESS_NUMBERS)) {
            range = Range.LESS;
        }

        if (isInArray(number.getValue(), GREAT_NUMBERS)) {
            range = Range.GREAT;
        }

        if (range == null) {
            throw new NullPointerException("Range is null");
        }

        return range;
    }

    private Boolean isInArray(Integer wantedNumber, Integer[] numbers) {
        Boolean isInArray = false;

        for (Integer number : numbers) {
            if (number == wantedNumber) {
                isInArray = true;
                break;
            }
        }

        return isInArray;
    }
}
