package com.corona.statistics.controller;


import com.corona.statistics.model.CountryStatistic;
import com.corona.statistics.service.StatisticsService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/statistic")
public class StatisticsController {

    private final StatisticsService statisticsService;

    @Autowired
    public StatisticsController(final StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping(value = "/country/{country}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<CountryStatistic> getCountryStatistic(
            @PathVariable(name = "country") final String country) {
        return ResponseEntity.ok(this.statisticsService.getCountryStatistic(country));
    }

    @GetMapping(value = "/all")
    ResponseEntity<List<CountryStatistic>> getAllCountryStatistic() {
        return ResponseEntity.ok(this.statisticsService.getAllStatistic());
    }

    @GetMapping(value = "/top/{count}")
    ResponseEntity<List<CountryStatistic>> getTopCountryStatistic(
            @PathVariable(name = "count") final Integer count) {
        return ResponseEntity.ok(this.statisticsService.getTopStatistic(count));
    }

    @GetMapping(value = "/updateStatistic")
    ResponseEntity<Map<String, CountryStatistic>> updateCountryStatistic() {
        return ResponseEntity.ok(this.statisticsService.updateStatistic());
    }

}
