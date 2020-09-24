package com.corona.statistics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.StringUtils;

@Data
@AllArgsConstructor
public class CountryStatistic {

    private String countryName;

    private String cases;

    private String death;

    private String recovered;

    private String resource;

    @Override
    public String toString() {
        String country = countryName.substring(0, 1).toUpperCase() + countryName.substring(1)
                + ": " + "total cases: " + cases + "; total deaths: " + death + "; total recovered: " + recovered + ".";
        return country + (StringUtils.isEmpty(resource) ? "" : " Resource: " + resource);
    }
}
