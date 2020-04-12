import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    Measurement measurement = new Measurement();

    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
       EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
       EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
       boolean isEqual = measurement.compare(value1, value2);
       Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenNullValue_WhenNotEqual_ReturnFalse() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        try {
           boolean isEqual = measurement.compare(value1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenSameReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        boolean isEqual = measurement.compare(value1, value1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenSameType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        double feet1 = 1.0;
        double feet2 = 1.0;
        EqualityCheck value1 = new EqualityCheck(feet1, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(feet2, Unit.FEET);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenSameFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(12.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(12.0, Unit.FEET);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenInchNull_WhenNotEqual_ReturnFalse() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        try {
            boolean isEqual = measurement.compare(value1, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION, e.type);
        }
    }

}
