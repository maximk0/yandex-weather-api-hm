import data.WeatherRepository;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        WeatherRepository repository = new WeatherRepository();
        System.out.println("response: " + repository.getWeatherResponse());
        System.out.println("current temp: " + repository.getTemp());
        System.out.println("average temp: " + repository.getTempAverage());
    }

}
