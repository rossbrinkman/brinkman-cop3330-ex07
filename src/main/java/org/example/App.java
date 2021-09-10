package org.example;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the length of the room in feet? " );

        Scanner scanner = new Scanner(System.in);
        int length, width, squareFeet;
        float squareMeters;
        final float conversionFactor = .092903f;

        length = scanner.nextInt();

        System.out.println( "What is the width of the room in feet? " );
        width = scanner.nextInt();

        squareFeet = length * width;

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        squareMeters = squareFeet * conversionFactor;

        System.out.println( "You entered dimensions of " + length + " feet by " + width + " feet.\n" +
                "The area is\n" +
                squareFeet + " square feet\n" +
                df.format(squareMeters) + " square meters" );

    }
}
