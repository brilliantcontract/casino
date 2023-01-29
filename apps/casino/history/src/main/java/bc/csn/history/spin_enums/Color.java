package bc.csn.history.spin_enums;

public enum Color {
    UNDEFINED(-1) {
        @Override
        public String toString() {
            return "UNDEFINED";
        }
    },
    BLACK(1) {
        @Override
        public String toString() {
            return "BLACK";
        }
    },
    RED(2) {
        @Override
        public String toString() {
            return "RED";
        }
    },
    GREEN(3) {
        @Override
        public String toString() {
            return "GREEN";
        }
    };

    private final int number;

    private Color(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private static Color[] values = null;

    /**
     * Return enum type by ordinal number.
     *
     * @param ordinalNumber
     * @return
     */
    public static Color fromOrdinalNumber(int ordinalNumber) {
        if (Color.values == null) {
            Color.values = Color.values();
        }
        return Color.values[ordinalNumber];
    }

    /**
     * Return enum type by text name.
     *
     * @param name
     * @return
     */
    public static Color fromTextName(String name) {
        return Color.valueOf(name);
    }

    /**
     * Return enum type by ID.
     *
     * @param id
     * @return
     */
    public static Color fromId(int id) {
        for (Color type : values()) {
            if (type.getNumber() == id) {
                return type;
            }
        }

        return Color.UNDEFINED;
    }
}
