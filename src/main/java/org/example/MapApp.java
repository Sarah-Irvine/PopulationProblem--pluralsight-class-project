package org.example;

import java.util.Scanner
public class MapApp {
    public static void main(String[] args) {
        CountryMap country = new CountryMap();

        boolean continueMaps=true;
        do{
            if(myScanner.equalsIgnoreCase("a")){
                System.out.println("You have chosen to view the country with the largest population!");
                System.out.println("The country with the largest population is " + country.largestCountry());
            }
            else if(myScanner.equalsIgnoreCase("b")){
                System.out.println("You have chosen to view the country with the smallest population!");
                System.out.println("The country with the smallest population is " + country.smallestCountry());
            }
            else if(myScanner.equalsIgnoreCase("c")){
                System.out.println("You have chosen to view the countries and their populations in increasing order of size!");
                country.printAllCountries();
            }
            else if(myScanner.equalsIgnoreCase("d")){
                System.out.println("You have chosen to add a new country");
                Scanner newCountry = new Scanner(System.in);
                System.out.println("Please enter the name of the country you would like to add:");
                String addCountryName = newCountry.nextLine();
                System.out.println("Please enter the population of this country:");
                int addCountryPopulation = newCountry.nextInt();
                newCountry.nextLine();
                country.addCountry(addCountryName,addCountryPopulation);
            }
            else if(myScanner.equalsIgnoreCase("e")){
                System.out.println("You have chosen to remove a country");
                Scanner deleteCountry = new Scanner(System.in);
                System.out.println("Please enter the name of the country you would like to remove:");
                String removeCountryName = deleteCountry.nextLine();
                country.removeCountry(removeCountryName);

            }
            else if(myScanner.equalsIgnoreCase("f")){
                System.out.println("Thank you for using MapApp - see you again soon!");
                continueMaps = false;
            }
            else{
                System.out.println("Invalid expression entered, application will now close");
                continueMaps = false;
            }

        }
        while(continueMaps);
    }


}