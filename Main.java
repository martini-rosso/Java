package com.martinirosso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculateTemperature();
    }

    public static String chooseConversionType()
    {
        String type;
        Scanner scan1 = new Scanner(System.in);

        System.out.println("For conversion from Celsius to Fahrenheit type C. \n"
                + "For conversion from Fahrenheit to celsius type F.");
        type = scan1.next();
        if (type.equalsIgnoreCase("C") || (type.equalsIgnoreCase("F")))
        {}
        else {
            System.out.print("Incorrect choice. Try again.\n");
            chooseConversionType();
        }
        return type;

    }

    public static void celsiusToFahrenheit (int temp)
    {
        int tempF = (int) (temp * 1.8 + 32);
        System.out.println(tempF);
    }

    public static void fahrenheitToCelsius (int temp)
    {
        int tempC = (int)((temp - 32) / 1.8);
        System.out.println(tempC);
    }
    public static void calculateTemperature()
    {
        int value;
        String type1;
        Scanner scan = new Scanner(System.in);

        type1 = chooseConversionType();
        System.out.println("Type in the value to be calculated.");
        value = scan.nextInt();
        if (type1.equalsIgnoreCase("C"))
            celsiusToFahrenheit(value);
        if (type1.equalsIgnoreCase("F"))
            fahrenheitToCelsius(value);
        else
            System.out.println("The value you have entered is incorrect. Please try once again.");
            calculateTemperature();
    }
}

