package api.weather;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

/* TestInstanceアノテーション：@BeforeAllメソッドが非静的（staticでない）メソッドとして記述できるようになり、インスタンス変数を直接初期化できるようになる */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OpenWeatherRequestCatchTest {

    private String apiKey;

    @BeforeEach
    void setUp() {
        apiKey = System.getenv("OPEN_WEATHER_API_KEY");
    }


}
