package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main (String[] args) {
        //Multiply the two numbers and display the results and equation
        //Enter the first number: 5
        //Enter the second number: 12
        //Possible calculations:
        //(A)dd
        //(S)ubtract
        //(M)ultiply
        //(D)ivide
        //Please select an option: M
        //5 * 12 = 60

        // Setting up Scanner class
        Scanner myScanner = new Scanner(System.in);

        // Prompt user to input numbers
        System.out.println("Enter your first number: ");
        int num1 = myScanner.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = myScanner.nextInt();
        myScanner.nextLine();

        // Display possible mathematic operations
        System.out.println("Possible calculations:");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");

        // Display options to choose which math arithmetic (?)
        System.out.print("Please select an option: ");
        myScanner.nextLine();

        // Ignore above options and only multiply
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

        // Exercise 5
        // Have user input their name
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        // Have user enter their hours worked
        System.out.println("How many hours we've worked this week?: ");
        double hours = Double.parseDouble(myScanner.nextLine());

        // Have user input their pay rate
        System.out.println("What's your current Pay Rate?: ");
        double pay = Double.parseDouble(myScanner.nextLine());

        // Calculate gross pay
        double grossPay = hours * pay;
        // Format grossPay to 2 decimal places
        String formattedPay = String.format("%.2f", grossPay);

        // Display their name & gross pay
        System.out.println(name + "'s gross pay for the week is:");
        System.out.println(formattedPay);
        myScanner.close();
    }
}
