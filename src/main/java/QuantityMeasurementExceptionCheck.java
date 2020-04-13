public class QuantityMeasurementExceptionCheck extends Exception {

    public ExceptionType type;

    public QuantityMeasurementExceptionCheck(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        NULL_POINTER_EXCEPTION,
        UNIT_MISMATCH,
        TEMPERATURE_CANNOT_ADD;
    }
}
