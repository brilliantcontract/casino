package bc.csn.history.spin_enums;

public enum Parity {
    UNDEFINED(-1) {
        @Override
        public String toString() {
            return "UNDEFINED";
        }
    },
    EVEN(1) {
        @Override
        public String toString() {
            return "EVEN";
        }
    },
    ODD(2) {
        @Override
        public String toString() {
            return "ODD";
        }
    },
    /*
        Usable for 0.
     */
    NONE(3) {
        @Override
        public String toString() {
            return "NONE";
        }
    };

    private final int number;

    private Parity(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private static Parity[] values = null;

    /**
     * Return enum type by ordinal number.
     *
     * @param ordinalNumber
     * @return
     */
    public static Parity fromOrdinalNumber(int ordinalNumber) {
        if (Parity.values == null) {
            Parity.values = Parity.values();
        }
        return Parity.values[ordinalNumber];
    }

    /**
     * Return enum type by text name.
     *
     * @param name
     * @return
     */
    public static Parity fromTextName(String name) {
        return Parity.valueOf(name);
    }

    /**
     * Return enum type by ID.
     *
     * @param id
     * @return
     */
    public static Parity fromId(int id) {
        for (Parity type : values()) {
            if (type.getNumber() == id) {
                return type;
            }
        }

        return Parity.UNDEFINED;
    }
}
