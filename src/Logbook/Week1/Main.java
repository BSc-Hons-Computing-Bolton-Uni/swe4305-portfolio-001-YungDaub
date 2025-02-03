package Logbook.Week1;

import java.time.Year; // this was done automatically by IntelliJ and is used for question 6 it imports the current year to simplify the calculation
import java.util.Scanner;

public class Main {

    // hello world method (task 1)
    static void printWorld() {
        System.out.println("Hello world");
    }

    // method to take the users name (task 2)
    static String getUserName(Scanner scanner) {
        System.out.println("What is your name?");
        return scanner.next(); // Read and return the user's name
    }

    // method to calculate the area of a rectangle (Task 3)
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

    // method to calculate and display the average of two numbers (task 4)
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
    static void swapAndDisplay(Scanner scanner) {
        // Ask the user for two integers (task 5)
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Display the original order
        System.out.println(" Normal Order: " + firstNumber + " " + secondNumber);

        // Swap and display the reversed order
        System.out.println("Reversed Order: " + secondNumber + " " + firstNumber);
    }
    static void birthYear(Scanner scanner) {
    int currentYear = Year.now().getValue();
    System.out.print("How old are you");
    int age = scanner.nextInt(); //Next int meaning to record the entry as long as its an int
    int birthYear = currentYear - age; //the formula for calculating the birth year of user
    System.out.println("Your year of birth " + birthYear); //the final result printed
    }


    // main calls other functions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printWorld(); // call method to print "Hello world"

        String personName = getUserName(scanner); // record user name
        System.out.println("Hello " + personName); // print hello *name*

        getRectangleDimensions(scanner); // prompt the user for length and width

        calculateAverage(scanner); // calculate average of any two numbers

        swapAndDisplay(scanner); //call on swap and display numbers in original and reverse order.

        birthYear(scanner); // find the birth year of the user

        scanner.close(); // close scanner for cleaner code (at the end because a majority of functions use scanner

    }
}



