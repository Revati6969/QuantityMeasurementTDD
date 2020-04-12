
public class EqualityCheck {
    private final double value;
    private final Unit unitValue;

    public EqualityCheck(double value, Unit unitValue) {
        this.value = value * unitValue.getConvertedValue();
        this.unitValue = unitValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualityCheck that = (EqualityCheck) o;
        return Double.compare(that.value, value) == 0;
    }
}
