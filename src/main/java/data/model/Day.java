package data.model;

public class Day {
    private float temp_avg;

    public float getTemp_avg() {
        return temp_avg;
    }

    @Override
    public String toString() {
        return "Day{" + "temp_avg=" + temp_avg + "}";
    }
}
