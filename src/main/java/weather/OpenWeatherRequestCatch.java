package weather;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OpenWeatherRequestCatch {
    public static void main(String[] args) throws Exception {
        /* 個人取得したAPIを環境変数として保存してください。*/
        String apiKey = System.getenv("OPEN_WEATHER_API_KEY");
        /* API呼び出し。一例として、hokkaidoを入力しています。*/
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=" + apiKey;

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            String jsonResponse = client.execute(request, httpResponse -> 
                EntityUtils.toString(httpResponse.getEntity()));
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            
            // ここで天気情報を抽出し表示します。実際のキーはAPIのレスポンスに依存します。
            System.out.println(jsonObject);
        }
    }
}

