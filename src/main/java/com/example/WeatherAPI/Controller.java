package com.example.WeatherAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    private final ReportService reportService;

    public Controller(ReportService reportService) {
        this.reportService = reportService;
    }


    @GetMapping(path = "/{city_name}")
    public void generateReport(@PathVariable("city_name") String cityName){
        reportService.generatereport(cityName);
    }
}
