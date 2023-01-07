package bc.roulette.history;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Number {

    private final Integer number;

    public Number(Integer number) {
        if(number == null) {
            throw new NullPointerException("Number cannot be initialized with NULL.");
        }
        
        if (number < 0 || number > 36) {
            throw new NumberFormatException("Roulette accepts only numbers between 0 - 36. Entered number is " + number);
        }

        this.number = number;
    }

    public Number(String number) {
        Integer intNumber = null;
        try {
            intNumber = Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            Logger.getLogger(Number.class.getName()).log(Level.SEVERE, "Cannot parse number. Number is " + number);
            throw ex;
        }

        if (intNumber < 0 || intNumber > 36) {
            throw new NumberFormatException("Roulette accepts only numbers between 0 - 36. Entered number is " + intNumber);
        }

        this.number = intNumber;
    }

    public Integer getValue() {
        return number;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Number other = (Number) obj;
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        return true;
    }
    
    

}
