package data;

import data.model.Forecast;
import data.model.WeatherResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class WeatherRepository {

    private WeatherResponse weatherResponse;

    public WeatherResponse getWeatherResponse() throws URISyntaxException, IOException, InterruptedException {
        int limit = 3;
        weatherResponse = new YandexWeatherApi().getForecast(limit);
        return weatherResponse;
    }

    public float getTemp() {
        return weatherResponse.getFact().getTemp();
    }

    public float getTempAverage() {
        List<Forecast> forecasts = weatherResponse.getForecasts();
        if ( forecasts == null || forecasts.isEmpty())  return  Float.NaN;

        float sum = 0;
        int countOfDays = 0;

        for (Forecast forecast : forecasts) {
            if (forecast.getParts() != null && forecast.getParts().getDay() != null) {
                sum += forecast.getParts().getDay().getTemp_avg();
                countOfDays++;
            }
        }
        return sum / countOfDays;
    }
}
