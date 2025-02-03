package Logbook.Week1;

import java.util.Scanner;

public class Main {

    // hello world method
    static void printWorld() {
        System.out.println("Hello world");
    }

    // method to take the users name
    static String getUserName(Scanner scanner) {
        System.out.println("What is your name?");
        return scanner.next(); // Read and return the user's name
    }

    // method to calculate the area of a rectangle
    static double calculateArea(double length, double height) {
        return length * height; // final calculation
    }

    // method to get rectangle dimensions
    static void getRectangleDimensions(Scanner scanner) {
        System.out.println("What is the length of your rectangle?");
        double length = scanner.nextDouble();

        System.out.println("What is the height of your rectangle?");
        double height = scanner.nextDouble();

        // call area function and display result
        double area = calculateArea(length, height);
        System.out.println("Your Area is " + area);
    }

    // method to calculate and display the average of two numbers
    static void calculateAverage(Scanner scanner) {
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // formula to calculate average
        double average = (num1 + num2) / 2;

        // print the result to user
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
    }

    // Main method - calls other functions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printWorld(); // Call method to print "Hello world"

        String personName = getUserName(scanner); // record user name
        System.out.println("Hello " + personName); // print hello *name*

        getRectangleDimensions(scanner); // prompt the user for length and width

        calculateAverage(scanner); // calculate average of any two numbers

        scanner.close(); // close scanner for cleaner code
    }
}



