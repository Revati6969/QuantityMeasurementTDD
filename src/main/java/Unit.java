import java.util.Objects;

public class Unit {
    public double unitValue;

    public Unit(double feetValue) {
        this.unitValue = feetValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit that = (Unit) o;
        return Double.compare(that.unitValue, unitValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitValue);
    }

}
