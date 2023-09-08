package org.example;

public class CountryMap {

    private String country;

    private int population;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public String toString(){
        return country + " has a population " + job + " and works at " + placeOfWork + " in " + city;
    }


}
