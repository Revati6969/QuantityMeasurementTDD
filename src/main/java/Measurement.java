import java.util.Objects;

public class Measurement {

    public double unitValue;

    public boolean compare(Unit value1, Unit value2) {
        if(value1.equals(value2))
            return true;
        return false;
    }
}
