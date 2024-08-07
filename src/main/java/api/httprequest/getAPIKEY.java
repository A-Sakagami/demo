package api.httprequest;

public class GetAPIKEY {
    /**
     * @author @ASakagami 
     * API key for the application.
     * @param String OPENWEATHER_API：get here https://openweathermap.org/current
     * @param String API: etc
     */
    private final static String OPENWEATHER_API = System.getenv("OPEN_WEATHER_API_KEY");
    // private final static String API = System.getenv();

    public static String getOpenweatherApi() {
        return OPENWEATHER_API;
    }
}
