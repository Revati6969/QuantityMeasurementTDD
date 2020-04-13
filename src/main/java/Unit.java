public enum Unit {

    FEET(TypeOfUnit.LENGTH) {
        public double converter(double value) {
            return value * 12;
        }
    },
    INCH(TypeOfUnit.LENGTH) {
        public double converter(double value) {
            return value;
        }
    },
    YARD(TypeOfUnit.LENGTH) {
        public double converter(double value) {
            return value * 36;
        }
    },
    CENTIMETER(TypeOfUnit.LENGTH) {
        public double converter(double value) {
            return value * 0.4;
        }
    },
    GALLON(TypeOfUnit.VOLUME) {
        public double converter(double value) {
            return value * 3.78;
        }
    },
    LITRE(TypeOfUnit.VOLUME) {
        public double converter(double value) {
            return value;
        }
    },
    ML(TypeOfUnit.VOLUME) {
        public double converter(double value) {
            return value * 0.001;
        }
    },
    KILOGRAMS(TypeOfUnit.WEIGHT) {
        public double converter(double value) {
            return value;
        }
    },
    GRAMS(TypeOfUnit.WEIGHT) {
        public double converter(double value) {
            return value * 0.001;
        }
    },
    TONNE(TypeOfUnit.WEIGHT) {
        public double converter(double value) {
            return value * 1000;
        }
    },
    FAHRENHEIT(TypeOfUnit.TEMPERATURE) {
        public double converter(double value) {
            return Math.round((value - 32) * 5 / 9);
        }
    },
    CELSIUS(TypeOfUnit.TEMPERATURE) {
        public double converter(double value) {
            return value;
        }
    };

    public final TypeOfUnit typeOfUnit;

    Unit(TypeOfUnit typeOfUnit) {
        this.typeOfUnit = typeOfUnit;
    }

    public double converter(double value) {
        return 0.0;
    }
}
