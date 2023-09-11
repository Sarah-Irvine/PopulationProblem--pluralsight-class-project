package org.example;

import java.util.Iterator;
import java.util.Scanner;

public class MapApp {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Press A to show the country with the largest population");
        System.out.println("Press B to show the country with the smallest population");
        System.out.println("Press C to show a list of countries in order from lowest population to highest population");
        System.out.println("Press D to add a country");
        System.out.println("Press E to remove a country");
        System.out.println("Press F to exit");

        String choice = myScanner.nextLine();

    }
}