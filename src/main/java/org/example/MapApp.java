package org.example;

import java.util.Iterator;

public class MapApp {
    public static void main(String[] args) {
        CountryMap country = new CountryMap();

        for (Country c : country.countryPopulations) {
            System.out.println(c.getName());
        }

        System.out.println(country.countryPopulations.first());
        System.out.println(country.countryPopulations.last());


    }
}


