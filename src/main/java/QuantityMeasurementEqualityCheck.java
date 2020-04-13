public class QuantityMeasurementEqualityCheck {

    public double value;

    public QuantityMeasurementEqualityCheck(double value, Unit unitValue) {
        this.value = value * unitValue.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurementEqualityCheck that = (QuantityMeasurementEqualityCheck) o;
        return Double.compare(that.value, value) == 0;
    }
}
