package bc.rlt.history.synchronization;

import bc.rlt.essential.CriticalException;
import bc.rlt.history.Number;
import java.util.ArrayList;
import java.util.List;

class NumbersGenerator {
    
    /**
     * Generate constant list of numbers for testing purpose.
     * @return null
     * @throws CriticalException 
     */
    List<Number> generateNull() throws CriticalException {
        List<Number> numbers = null;
        
        return numbers;
    };

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0
     * @throws CriticalException 
     */
    List<Number> generate1number() throws CriticalException {
        List<Number> numbers = new ArrayList();
        numbers.add(new Number(0));
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1
     * @throws CriticalException 
     */
    List<Number> generate2numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        numbers.add(new Number(0));
        numbers.add(new Number(1));
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4
     * @throws CriticalException 
     */
    List<Number> generate5numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        numbers.add(new Number(0));
        numbers.add(new Number(1));
        numbers.add(new Number(2));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
     * @throws CriticalException 
     */
    List<Number> generate10numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        numbers.add(new Number(0));
        numbers.add(new Number(1));
        numbers.add(new Number(2));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        numbers.add(new Number(5));
        numbers.add(new Number(6));
        numbers.add(new Number(7));
        numbers.add(new Number(8));
        numbers.add(new Number(9));
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
     * @throws CriticalException 
     */
    List<Number> generate20numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        numbers.add(new Number(0));
        numbers.add(new Number(1));
        numbers.add(new Number(2));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        numbers.add(new Number(5));
        numbers.add(new Number(6));
        numbers.add(new Number(7));
        numbers.add(new Number(8));
        numbers.add(new Number(9));
        numbers.add(new Number(10));
        numbers.add(new Number(11));
        numbers.add(new Number(12));
        numbers.add(new Number(13));
        numbers.add(new Number(14));
        numbers.add(new Number(15));
        numbers.add(new Number(16));
        numbers.add(new Number(17));
        numbers.add(new Number(18));
        numbers.add(new Number(19));
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 ...
     * @throws CriticalException 
     */
    List<Number> generate50numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        numbers.add(new Number(0));
        numbers.add(new Number(1));
        numbers.add(new Number(2));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        numbers.add(new Number(0));
        numbers.add(new Number(6));
        numbers.add(new Number(7));
        numbers.add(new Number(8));
        numbers.add(new Number(9));
        numbers.add(new Number(0));
        numbers.add(new Number(11));
        numbers.add(new Number(12));
        numbers.add(new Number(13));
        numbers.add(new Number(14));
        numbers.add(new Number(0));
        numbers.add(new Number(16));
        numbers.add(new Number(17));
        numbers.add(new Number(18));
        numbers.add(new Number(19));
        numbers.add(new Number(0));
        numbers.add(new Number(21));
        numbers.add(new Number(22));
        numbers.add(new Number(23));
        numbers.add(new Number(24));
        numbers.add(new Number(0));
        numbers.add(new Number(26));
        numbers.add(new Number(27));
        numbers.add(new Number(28));
        numbers.add(new Number(29));
        numbers.add(new Number(0));
        numbers.add(new Number(31));
        numbers.add(new Number(32));
        numbers.add(new Number(0));
        numbers.add(new Number(1));
        numbers.add(new Number(2));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        numbers.add(new Number(0));
        numbers.add(new Number(6));
        numbers.add(new Number(7));
        numbers.add(new Number(8));
        numbers.add(new Number(9));
        numbers.add(new Number(0));
        numbers.add(new Number(11));
        numbers.add(new Number(12));
        numbers.add(new Number(13));
        numbers.add(new Number(14));
        numbers.add(new Number(0));
        numbers.add(new Number(16));
        
        return numbers;
    }
    
    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 ...
     * @throws CriticalException 
     */
    List<Number> generate100numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        
        numbers.addAll(generate50numbers());
        numbers.addAll(generate50numbers());
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 ...
     * @throws CriticalException 
     */
    List<Number> generate200numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        
        numbers.addAll(generate100numbers());
        numbers.addAll(generate100numbers());
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 ...
     * @throws CriticalException 
     */
    List<Number> generate500numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        
        numbers.addAll(generate100numbers());
        numbers.addAll(generate100numbers());
        numbers.addAll(generate100numbers());
        numbers.addAll(generate100numbers());
        numbers.addAll(generate100numbers());
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 ...
     * @throws CriticalException 
     */
    List<Number> generate1000numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        
        numbers.addAll(generate500numbers());
        numbers.addAll(generate500numbers());
        
        return numbers;
    }

    /**
     * Generate constant list of numbers for testing purpose.
     * @return 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 ...
     * @throws CriticalException 
     */
    List<Number> generate5000numbers() throws CriticalException {
        List<Number> numbers = new ArrayList();
        
        numbers.addAll(generate1000numbers());
        numbers.addAll(generate1000numbers());
        numbers.addAll(generate1000numbers());
        numbers.addAll(generate1000numbers());
        numbers.addAll(generate1000numbers());
        
        return numbers;
    }

}
