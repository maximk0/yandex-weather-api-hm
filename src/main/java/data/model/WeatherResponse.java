package data.model;

import java.util.List;

public class WeatherResponse {
    private Fact fact;
    private List<Forecast> forecasts;

    private WeatherResponse() {
    }


    public Fact getFact() {
        return fact;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "\nfact=" + fact +
                "\nforecasts=" + forecasts +
                '}';
    }
}