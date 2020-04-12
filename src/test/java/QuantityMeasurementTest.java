import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    Measurement measurement = new Measurement();

    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
       EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
       EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
       boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenNullValue_WhenNotEqual_ThrowException() {
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
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        double feet1 = 1.0;
        double feet2 = 1.0;
        EqualityCheck value1 = new EqualityCheck(feet1, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(feet2, Unit.FEET);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(12.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(12.0, Unit.FEET);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
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

    @Test
    public void givenSameInchReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value1);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameInchType_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        double inch1 = 1.0;
        double inch2 = 1.0;
        EqualityCheck value1 = new EqualityCheck(inch1, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(inch2, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameInchValue_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(12.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(12.0, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(0.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(0.0, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenNotEqual_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenResultEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(12.0, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_When3FeetEqualsToYard_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(3.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_When1FeetNotEqualsTo1Yard_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndYard_When1InchNotEqualsTo1Yard_ReturnFalse() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndYard_When1YardEqualsTo36Inch_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(36.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndYard_When36InchEqualsTo1Yard_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.YARD);
        EqualityCheck value1 = new EqualityCheck(36.0, Unit.INCH);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_When1YardEqualsTo3Feet_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.YARD);
        EqualityCheck value2 = new EqualityCheck(3.0, Unit.FEET);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndCM_When2InchEqualsTo5cm_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(2.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(5.0, Unit.CENTIMETER);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(2.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(2.0, Unit.INCH);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(4.0, result, 0);
    }

    @Test
    public void givenFeetAndInch_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(2.0, Unit.INCH);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(14.0, result, 0);
    }

    @Test
    public void givenFeetAndFeet_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.FEET);
        EqualityCheck value2 = new EqualityCheck(1.0, Unit.FEET);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(24.0, result, 0);
    }

    @Test
    public void givenInchAndCentimeter_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(2.0, Unit.INCH);
        EqualityCheck value2 = new EqualityCheck(2.5, Unit.CENTIMETER);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(3, result, 0);
    }

    @Test
    public void givenGallonAndLitres_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.GALLON);
        EqualityCheck value2 = new EqualityCheck(3.78, Unit.LITRE);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(7.56, result, 0);
    }

    @Test
    public void givenLitreAndML_WhenGetAdded_ReturnResult() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.LITRE);
        EqualityCheck value2 = new EqualityCheck(1000, Unit.ML);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(2.0, result, 0);
    }

    @Test
    public void givenKgAndGm_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.KILOGRAMS);
        EqualityCheck value2 = new EqualityCheck(1000.0, Unit.GRAMS);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonneAndkm_WhenEqual_ReturnTrue() throws QuantityMeasurementException {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.TONNE);
        EqualityCheck value2 = new EqualityCheck(1000.0, Unit.KILOGRAMS);
        boolean isEqual = measurement.compare(value1, value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonneAndGm_WhenEqual_ReturnTrue() {
        EqualityCheck value1 = new EqualityCheck(1.0, Unit.TONNE);
        EqualityCheck value2 = new EqualityCheck(1000.0, Unit.GRAMS);
        double result = measurement.addition(value1, value2);
        Assert.assertEquals(1001, result, 0);
    }
}
