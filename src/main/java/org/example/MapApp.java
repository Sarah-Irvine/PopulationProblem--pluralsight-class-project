package org.example;


import java.util.Scanner;

import java.util.Iterator;
public class MapApp {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        CountryMap country = new CountryMap();
        boolean continueMaps=true;

        do{
            System.out.println("Press A to show the country with the largest population");
            System.out.println("Press B to show the country with the smallest population");
            System.out.println("Press C to show a list of countries in order from lowest population to highest population");
            System.out.println("Press D to add a country");
            System.out.println("Press E to remove a country");
            System.out.println("Press F to exit");

            String choice = myScanner.nextLine();
            if(choice.equalsIgnoreCase("a")){
                System.out.println("You have chosen to view the country with the largest population!");
                System.out.println("The country with the largest population is " + country.largestCountry());
            }
            else if(choice.equalsIgnoreCase("b")){
                System.out.println("You have chosen to view the country with the smallest population!");
                System.out.println("The country with the smallest population is " + country.smallestCountry());
            }
            else if(choice.equalsIgnoreCase("c")){
                System.out.println("You have chosen to view the countries and their populations in increasing order of size!");

                country.printAllCountries();
            }
            else if(choice.equalsIgnoreCase("d")){
                System.out.println("You have chosen to add a new country");
                Scanner newCountry = new Scanner(System.in);
                System.out.println("Please enter the name of the country you would like to add:");
                String addCountryName = newCountry.nextLine();
                System.out.println("Please enter the population of this country:");
                int addCountryPopulation = newCountry.nextInt();
                newCountry.nextLine();
                country.addCountry(addCountryName,addCountryPopulation);
            }
            else if(choice.equalsIgnoreCase("e")){
                System.out.println("You have chosen to remove a country");
                Scanner deleteCountry = new Scanner(System.in);
                System.out.println("Please enter the name of the country you would like to remove:");
                String removeCountryName = deleteCountry.nextLine();
                country.removeCountry(removeCountryName);

            }
            else if(choice.equalsIgnoreCase("f")){
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

