public class QuantityMeasurement {

    public boolean compare(QuantityMeasurementEqualityCheck value1, QuantityMeasurementEqualityCheck value2) throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, "Null Object");
        return value1.equals(value2);
    }

    public double addition(QuantityMeasurementEqualityCheck value1, QuantityMeasurementEqualityCheck value2) {
        return value1.value + value2.value;
    }
}
