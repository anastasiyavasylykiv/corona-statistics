package com.corona.statistics.comparator;

import com.corona.statistics.model.CountryStatistic;
import java.util.Comparator;

public class CountryStatisticComparator implements Comparator<CountryStatistic> {

    @Override
    public int compare(final CountryStatistic o1, final CountryStatistic o2) {
        final int cases1 = getCases(o1);
        final int cases2 = getCases(o2);
        return cases2 - cases1;
    }

    private int getCases(final CountryStatistic countryStatistic) {
        try {
            return Integer.parseInt(countryStatistic.getCases().replaceAll(",", ""));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
