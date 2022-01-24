package com.example.WeatherAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ReportService {

    @Value("${api.key}")
    private String API_KEY;


    public Mono<String> generateReport(String cityName) {
        WebClient client = WebClient.create();


        Mono<String> mainReport = client
                .get()
                .uri(uriBuilder -> uriBuilder.path("api.openweathermap.org/data/2.5/weather")
                        .queryParam("q", cityName)
                        .queryParam("appid", API_KEY)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
        return mainReport;

    }
}
