package data.model;

public class Fact {
    private float temp;

    public Fact() {
    }

    public float getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "Fact{" + "temp=" + temp + "}";
    }

}