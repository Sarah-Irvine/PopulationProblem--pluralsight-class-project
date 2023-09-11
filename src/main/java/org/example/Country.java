package org.example;

public class Country implements Comparable{
    private String name;
    private int population;

    public Country(String name, int population){
        this.name = name;
        this.population = population;
    }

    public int getPopulation(){
        return this.population;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Country)){
            return 0;
        } else {
            Country other = (Country) o;
            if (this.population > other.getPopulation()){
                return 1;
            } else if (this.population < other.getPopulation()){
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + " with population of " + this.population;
    }
}
