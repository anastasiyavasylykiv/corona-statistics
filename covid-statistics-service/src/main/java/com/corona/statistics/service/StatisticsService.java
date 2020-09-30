package com.corona.statistics.service;

import com.corona.statistics.model.CountryStatistic;
import java.util.List;
import java.util.Map;

public interface StatisticsService {

    CountryStatistic getCountryStatistic(String country);

    List<CountryStatistic> getAllStatistic();

    List<CountryStatistic> getTopStatistic(int count);

    Map<String, CountryStatistic> updateStatistic();

}
