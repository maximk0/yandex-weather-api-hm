package data.model;

public class Forecast {
    private Parts parts;

    public Forecast() {
    }

    public Parts getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "Forecast{" + "parts=" + parts + "}";
    }
}