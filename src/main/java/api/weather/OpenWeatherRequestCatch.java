package api.weather;

import api.httprequest.*;
import java.util.Scanner;
import org.apache.http.impl.client.HttpClients;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OpenWeatherRequestCatch {
    /**
     * @author @A-Sakagami 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /* 天気情報を見たい都市(コマンドラインに入力)*/
        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        scanner.close();
        /* API呼び出し。*/
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + getAPIKEY.getOpenweatherApi();

        HttpClientService httpClientService = new HttpClientService(HttpClients.createDefault());

        try {
            String jsonResponse = httpClientService.sendRequest(url);
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();

            /*ここで天気情報を抽出し表示します。実際のキーはAPIのレスポンスに依存します。*/
            System.out.println(jsonObject);
        } catch (Exception e) {
            System.out.println("Error retrieving weather data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

