public class QuantityMeasurement {

    public double value;
    public Unit unit;

    public QuantityMeasurement(Double value, Unit unitValue) {
        this.value = value;
        this.unit = unitValue;
    }
    public boolean compare(QuantityMeasurement that) throws QuantityMeasurementExceptionCheck {
        if (this.unit.typeOfUnit.equals(that.unit.typeOfUnit)) {
            Double firstValue = this.unit.converter(this.value);
            Double secondValue = that.unit.converter(that.value);
            return firstValue.equals(secondValue);
        }
        throw new QuantityMeasurementExceptionCheck(QuantityMeasurementExceptionCheck.ExceptionType.UNIT_MISMATCH, "Unit is not equal");
    }

    public double addition(QuantityMeasurement that) throws QuantityMeasurementExceptionCheck {
        if(that.unit.typeOfUnit == TypeOfUnit.TEMPERATURE && this.unit.typeOfUnit == TypeOfUnit.TEMPERATURE)
            throw new QuantityMeasurementExceptionCheck(QuantityMeasurementExceptionCheck.ExceptionType.TEMPERATURE_CANNOT_ADD, "Temperature addition is not possible");
        if (this.unit.typeOfUnit.equals(that.unit.typeOfUnit)) {
            double firstValue = this.unit.converter(this.value);
            double secondValue = that.unit.converter(that.value);
            return firstValue + secondValue;
        }
        throw new QuantityMeasurementExceptionCheck(QuantityMeasurementExceptionCheck.ExceptionType.UNIT_MISMATCH, "Unit is not equal");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }
}
