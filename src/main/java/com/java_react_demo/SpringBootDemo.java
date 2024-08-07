package com.java_react_demo;

// import api.weather.OpenWeatherRequestCatch;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author @A-Sakagami 
 * @params args
 */
@RestController
public class SpringBootDemo {

    /** 
     * @A-Sakagami author
     * @param  res: object
     * @return WeatherResponse
     */
    @GetMapping("/com/java_react_demo")
    public WeatherResponse getweathwer(String location) {
        WeatherResponse res = new WeatherResponse();
        res.setLocation(location);
        res.setTemperature("25°C");
        res.setCondition("Sunny");
        return res;
    }
}
