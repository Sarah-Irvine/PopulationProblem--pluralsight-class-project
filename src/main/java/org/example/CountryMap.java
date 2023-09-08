package org.example;

import java.util.HashMap;

public class CountryMap {
    private HashMap<String, Integer> countryPopulations = new HashMap<>();

    public void CountryMap (){
        populate();
    }

    private void populate(){
        countryPopulations.put("UK",500);
        countryPopulations.put("US",5000);

    }
}