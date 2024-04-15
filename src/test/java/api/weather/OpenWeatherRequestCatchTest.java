package api.weather;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/* TestInstanceアノテーション：@BeforeAllメソッドが非静的（staticでない）メソッドとして記述できるようになり、インスタンス変数を直接初期化できるようになる */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OpenWeatherRequestCatchTest {

    private String apiKey;

    @BeforeEach
    void setUp() {
        apiKey = System.getenv("OPEN_WEATHER_API_KEY");
    }


}
