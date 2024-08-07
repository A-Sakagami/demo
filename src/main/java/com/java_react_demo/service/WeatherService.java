package com.java_react_demo.service;

import api.httprequest.HttpClientService;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private static final String API_KEY = "YOUR_API_KEY"; // GetAPIKEY.getOpenweatherApi()を適宜置き換え

    public String getWeather(String city) throws Exception {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpClientService httpClientService = new HttpClientService(httpClient);
            String jsonResponse = httpClientService.sendRequest(url);
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();

            // 必要な情報をJSONから抽出し、フォーマットして返す
            return jsonObject.toString();
        } catch (Exception e) {
            throw new Exception("Error retrieving weather data", e);
        }
    }
}