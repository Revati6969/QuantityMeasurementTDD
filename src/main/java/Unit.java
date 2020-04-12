
public enum Unit {
    FEET(12),
    INCH(1);

    public final double value;

    Unit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double getConvertedValue() {
        return value;
    }
}
