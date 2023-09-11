package org.example;

import java.util.HashMap;
import java.util.TreeSet;

public class CountryMap {
    private HashMap<String, Country> countries = new HashMap<>();
    private TreeSet<Country> countryPopulations = new TreeSet<>();

    public CountryMap() {
        populate();
    }

    private void populate() {

        countries.put("India", new Country("India", 1428627663) );
        countries.put("China", new Country("China", 1425671352));
        countries.put("USA", new Country("USA", 339996563));
        countries.put("Italy", new Country("Italy", 58870762));
        countries.put("Spain", new Country("Russia", 47519628));
        countries.put("Portugal", new Country("Portugal", 10247605));
        countries.put("Brazil", new Country("Brazil", 216422446));
        countries.put("Russia", new Country("Russia", 144444359));
        countries.put("Mexico", new Country("Mexico", 128455567));
        countries.put("UK", new Country("Uk", 67736802));
        countries.put("Finland", new Country("Finland", 5545475));

        sortCountries();
    }

    public String largestCountry(){
        return countryPopulations.last().toString();
    }

    public String smallestCountry(){
        return countryPopulations.first().toString();
    }

    public void printAllCountries(){

        for (Country c : countryPopulations){
            System.out.println(c.getName());
        }
    }

    public void sortCountries(){
        countryPopulations.addAll(countries.values());
    }

    /**
     * just for testing
     * @param args
     */
    public static void main(String[] args){
        CountryMap n = new CountryMap();
        n.sortCountries();
        n.printAllCountries();
    }

    public void removeCountry(String removeCountryName) {
        if (countries.containsKey(removeCountryName)) {
            countryPopulations.remove(countries.get(removeCountryName));
            countries.remove(removeCountryName);
            sortCountries();
            System.out.println(removeCountryName + " successfully removed from the HashMap");
        } else {
            System.out.println("No country found");
        }
    }
    public void addCountry(String name, int population){
        Integer intObj = Integer.valueOf(population);
        countries.put(name, new Country(name,intObj));
        this.sortCountries();
    }

}





