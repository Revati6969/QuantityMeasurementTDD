
public enum Unit {
    FEET(12),
    INCH(1),
    YARD(36);

    private final double value;

    Unit(double value) { this.value = value; }

    public double getValue() { return value; }
}
