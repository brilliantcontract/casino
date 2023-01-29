package bc.csn.essential;

public class CriticalException extends Exception {

    /**
     * Creates a new instance of <code>CriticalException</code> without detail
     * message.
     */
    public CriticalException() {
    }

    /**
     * Constructs an instance of <code>CriticalException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CriticalException(String msg) {
        super(msg);
    }
}
