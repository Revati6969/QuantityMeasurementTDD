
public class EqualityCheck {
    public double value;
    private final Unit unitValue;

    public EqualityCheck(double value, Unit unitValue) {
        this.value = value * unitValue.getValue();
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
