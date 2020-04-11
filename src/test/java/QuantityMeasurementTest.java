import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    Measurement measurement = new Measurement();

    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() {
        Unit value1 = new Unit(0);
        Unit value2 = new Unit(0);
        boolean isEqual = this.measurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenNullValue_WhenNotEqual_ReturnFalse() {
        Unit value1 = new Unit(0);
        boolean isEqual = this.measurement.compare(value1, null);
        Assert.assertEquals(false, isEqual);
    }
}
