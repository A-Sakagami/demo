package com.java_react_demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WeatherApiIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetWeather() throws Exception {
        // リクエストを送信し、レスポンスを取得
        MvcResult result = mockMvc.perform(get("/api/weather")
                .param("location", "Kyoto")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        // レスポンスの内容を検証
        String jsonResponse = result.getResponse().getContentAsString();
        assertThat(jsonResponse).contains("Kyoto");
        assertThat(jsonResponse).contains("25°C");
        assertThat(jsonResponse).contains("Sunny");
    }
}
