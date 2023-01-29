package bc.csn.essential;

public enum StrategyTarget {
    UNDEFINED(-1) {
        @Override
        public String toString() {
            return "UNDEFINED";
        }
    },
    PARITY(1) {
        @Override
        public String toString() {
            return "PARITY";
        }
    },
    COLOR(2) {
        @Override
        public String toString() {
            return "COLOR";
        }
    },
    RANGE(3) {
        @Override
        public String toString() {
            return "RANGE";
        }
    },
    NUMBER(4) {
        @Override
        public String toString() {
            return "NUMBER";
        }
    };

    private final int number;

    private StrategyTarget(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private static StrategyTarget[] values = null;

    /**
     * Return enum type by ordinal number.
     *
     * @param ordinalNumber
     * @return
     */
    public static StrategyTarget fromOrdinalNumber(int ordinalNumber) {
        if (StrategyTarget.values == null) {
            StrategyTarget.values = StrategyTarget.values();
        }
        return StrategyTarget.values[ordinalNumber];
    }

    /**
     * Return enum type by text name.
     *
     * @param name
     * @return
     */
    public static StrategyTarget fromTextName(String name) {
        return StrategyTarget.valueOf(name);
    }

    /**
     * Return enum type by ID.
     *
     * @param id
     * @return
     */
    public static StrategyTarget fromId(int id) {
        for (StrategyTarget type : values()) {
            if (type.getNumber() == id) {
                return type;
            }
        }

        return StrategyTarget.UNDEFINED;
    }
}
