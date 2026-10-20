package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        //Multiply the two numbers and display the results and equation
        //Enter the first number: 5
        //Enter the second number: 12
        //Possible calculations:
        //(A)dd
        //(S)ubtract
        //(M)ultiply
        //(D)ivide
        //Please select an option: Multiply
        //5 * 12 = 60

        // Setting up Scanner class
        Scanner myScanner = new Scanner(System.in);

        // Prompt user to input numbers
        System.out.println("Enter your first number: ");
        int num1 = myScanner.nextInt();


        System.out.println("Enter your second number: ");
        int num2 = myScanner.nextInt();
        myScanner.nextLine();

        // Display possible mathematical operations
        System.out.println("Possible calculations:");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");

        // Display options to choose which math arithmetic (only Multiply)
        System.out.print("Please select an option: ");
        myScanner.nextLine();

        // Ignore above options and only multiply
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

    }
}