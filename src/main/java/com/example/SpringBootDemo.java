package com.java_react_demo;

import api.weather.OpenWeatherRequestCatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author @A-Sakagami 
 * @params args
 */
@SpringBootApplication
public class SpringBootDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
    SpringApplication.run(OpenWeatherRequestCatch.class, args);
    }
}
