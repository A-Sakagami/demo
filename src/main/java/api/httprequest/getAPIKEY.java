package api.httprequest;

public class getAPIKEY {
    private final static String OPENWEATHER_API = System.getenv("OPEN_WEATHER_API_KEY");

    public static String getOpenweatherApi() {
        return OPENWEATHER_API;
    }
}
