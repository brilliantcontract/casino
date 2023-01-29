package bc.csn.history.spin_enums;

public enum Range {
    UNDEFINED(-1) {
        @Override
        public String toString() {
            return "UNDEFINED";
        }
    },
    /*
    Numbers 1-18.
     */
    LESS(1) {
        @Override
        public String toString() {
            return "LESS";
        }
    },
    /*
    Numbers 19-36.
     */
    GREAT(2) {
        @Override
        public String toString() {
            return "GREAT";
        }
    },
    /*
    Useful for zero.
     */
    NONE(3) {
        @Override
        public String toString() {
            return "NONE";
        }
    };

    private final int number;

    private Range(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private static Range[] values = null;

    /**
     * Return enum type by ordinal number.
     *
     * @param ordinalNumber
     * @return
     */
    public static Range fromOrdinalNumber(int ordinalNumber) {
        if (Range.values == null) {
            Range.values = Range.values();
        }
        return Range.values[ordinalNumber];
    }

    /**
     * Return enum type by text name.
     *
     * @param name
     * @return
     */
    public static Range fromTextName(String name) {
        return Range.valueOf(name);
    }

    /**
     * Return enum type by ID.
     *
     * @param id
     * @return
     */
    public static Range fromId(int id) {
        for (Range type : values()) {
            if (type.getNumber() == id) {
                return type;
            }
        }

        return Range.UNDEFINED;
    }
}
