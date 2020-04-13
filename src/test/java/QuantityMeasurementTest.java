import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndGram_WhenNotEqual_ReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.GRAMS);
        boolean isEqual = false;
        try {
            isEqual = value1.compare(value2);
        } catch (QuantityMeasurementExceptionCheck e) {
            Assert.assertEquals(QuantityMeasurementExceptionCheck.ExceptionType.UNIT_MISMATCH, e.type);
        }
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenSameReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        boolean isEqual = value1.compare(value1);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameType_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        double feet1 = 1.0;
        double feet2 = 1.0;
        QuantityMeasurement value1 = new QuantityMeasurement(feet1, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(feet2, Unit.FEET);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameFeetValue_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.FEET);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameInchReferance_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.INCH);
        boolean isEqual = value1.compare(value1);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameInchType_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        double inch1 = 1.0;
        double inch2 = 1.0;
        QuantityMeasurement value1 = new QuantityMeasurement(inch1, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(inch2, Unit.INCH);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenSameInchValue_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.INCH);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndKG_WhenNotEqual_ReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.KILOGRAMS);
        boolean isEqual = false;
        try {
            isEqual = value1.compare(value2);
        } catch (QuantityMeasurementExceptionCheck e) {
            Assert.assertEquals(QuantityMeasurementExceptionCheck.ExceptionType.UNIT_MISMATCH, e.type);
        }
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(0.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(0.0, Unit.INCH);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenNotEqual_ReturnFalse() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.INCH);
        boolean isEqual = value1.compare(value2);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenResultEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(12.0, Unit.INCH);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_When3FeetEqualsToYard_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_When1FeetNotEqualsTo1Yard_ReturnFalse() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean isEqual = value1.compare(value2);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndYard_When1InchNotEqualsTo1Yard_ReturnFalse() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean isEqual = value1.compare(value2);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndYard_When1YardEqualsTo36Inch_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(36.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndYard_When36InchEqualsTo1Yard_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.YARD);
        QuantityMeasurement value1 = new QuantityMeasurement(36.0, Unit.INCH);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_When1YardEqualsTo3Feet_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.YARD);
        QuantityMeasurement value2 = new QuantityMeasurement(3.0, Unit.FEET);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndCM_When2InchEqualsTo5cm_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(5.0, Unit.CENTIMETER);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenGetAdded_ReturnResult() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(2.0, Unit.INCH);
        double result = value1.addition(value2);
        Assert.assertEquals(4.0, result, 0);
    }

    @Test
    public void givenFeetAndInch_WhenGetAdded_ReturnResult() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(2.0, Unit.INCH);
        double result = value1.addition(value2);
        Assert.assertEquals(14.0, result, 0);
    }

    @Test
    public void givenFeetAndFeet_WhenGetAdded_ReturnResult() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(1.0, Unit.FEET);
        double result = value1.addition(value2);
        Assert.assertEquals(24.0, result, 0);
    }

    @Test
    public void givenFeetAndGallone_WhenNotEqual_ReturnFalse() {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement value2 = new QuantityMeasurement(3.78, Unit.GALLON);
        boolean isEqual = false;
        try {
            isEqual = value1.compare(value2);
        } catch (QuantityMeasurementExceptionCheck e) {
            Assert.assertEquals(QuantityMeasurementExceptionCheck.ExceptionType.UNIT_MISMATCH, e.type);
        }
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndCentimeter_WhenGetAdded_ReturnResult() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement value2 = new QuantityMeasurement(2.5, Unit.CENTIMETER);
        double result = value1.addition(value2);
        Assert.assertEquals(3, result, 0);
    }

    @Test
    public void givenGallonAndLitres_WhenGetAdded_ReturnResult() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.GALLON);
        QuantityMeasurement value2 = new QuantityMeasurement(3.78, Unit.LITRE);
        double result = value1.addition(value2);
        Assert.assertEquals(7.56, result, 0);
    }

    @Test
    public void givenLitreAndML_WhenGetAdded_ReturnResult() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.LITRE);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.ML);
        double result = value1.addition(value2);
        Assert.assertEquals(2.0, result, 0);
    }

    @Test
    public void givenKgAndGm_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.KILOGRAMS);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.GRAMS);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonneAndkm_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.TONNE);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.KILOGRAMS);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonneAndGm_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(1.0, Unit.TONNE);
        QuantityMeasurement value2 = new QuantityMeasurement(1000.0, Unit.GRAMS);
        double result = value1.addition(value2);
        Assert.assertEquals(1001, result, 0);
    }

    @Test
    public void givenTemperature_WhenEqual_ReturnTrue() throws QuantityMeasurementExceptionCheck {
        QuantityMeasurement value1 = new QuantityMeasurement(212.0, Unit.FAHRENHEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(100.0, Unit.CELSIUS);
        boolean isEqual = value1.compare(value2);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTemperature_WhenAdded_ReturnTrue() {
        QuantityMeasurement value1 = new QuantityMeasurement(212.0, Unit.FAHRENHEIT);
        QuantityMeasurement value2 = new QuantityMeasurement(100.0, Unit.CELSIUS);
        double result = 0;
        try {
            result = value1.addition(value2);
        } catch (QuantityMeasurementExceptionCheck e) {
            Assert.assertEquals(QuantityMeasurementExceptionCheck.ExceptionType.TEMPERATURE_CANNOT_ADD, e.type);
        }
        Assert.assertEquals(0.0, result, 0);
    }
}
