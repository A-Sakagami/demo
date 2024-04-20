package api.httprequest;

public class GetAPIKEY {
    /**
     * @author @A-Sakagami 
     * API key for the application.
     * @param String OPENWEATHER_API：get here https://openweathermap.org/current
     */
    private final static String OPENWEATHER_API = System.getenv("OPEN_WEATHER_API_KEY");

    public static String getOpenweatherApi() {
        return OPENWEATHER_API;
    }
}
