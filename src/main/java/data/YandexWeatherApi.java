package data;

import com.google.gson.Gson;
import data.model.WeatherResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static data.Const.*;

public class YandexWeatherApi {

    WeatherResponse getForecast(int limit) throws URISyntaxException, IOException, InterruptedException {
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(getRequest(limit), HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(), WeatherResponse.class);
    }

    private HttpRequest getRequest(int limit) throws URISyntaxException {
        String uri = String.format("%s&limit=%d", URL, limit);

        return HttpRequest
                .newBuilder()
                .uri(new URI(uri))
                .header(HEADER, API_KEY)
                .GET()
                .build();
    }
}
