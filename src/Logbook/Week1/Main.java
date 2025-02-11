package Logbook.Week1;

import java.time.LocalDate;
import java.time.Year; // this was done automatically by IntelliJ and is used for question 6 it imports the current year to simplify the calculation
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {

    // hello world method (task 1)
    static void printWorld() {
        System.out.println("Hello world");
    }

    /* the getUserName function uses the scanner in order to record
    the name of the user to read and return it.
     (task 2)
     */
    static String getUserName(Scanner scanner) {
        System.out.println("What is your name?");
        return scanner.next(); // Read and return the user's name
    }

    /* The calculateArea function is used to find use the user input

    (Task 3)
     */
    static double calculateArea(double length, double height) {
        return length * height; // final calculation
    }

    // method to get rectangle dimensions
    static void getRectangleDimensions(Scanner scanner) {
        /*
        The getRectangleDimensions function will take the dimensions from the user
        using scanner in order to calculate the answer using the calculateArea function.

         */
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
        /* The calculateAverage function will take two numbers
        from the user before calculating the average of them both.
        To do this we will create a formula seen below in the code
        */
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
        /*
        The swapAndDisplay function tasks us with taking two integers
         from the user and then displaying them in the order they were entered
         then displaying them in reverse order.
         (task 5)
         */
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Display the original order
        System.out.println(" Normal Order: " + firstNumber + " " + secondNumber);

        // Swap and display the reversed order
        System.out.println("Reversed Order: " + secondNumber + " " + firstNumber);
    }
    static void birthYear(Scanner scanner){
    /* the BirthYear function will use an implementation from the Java in built library
    (import java.time.Year;) this will allow for the current date to be pulled
    and automatically updated to use the current date.
    (task 6)

     */
    int currentYear = Year.now().getValue();
    System.out.print("How old are you");
    int age = scanner.nextInt(); //Next int meaning to record the entry as long as its an int
    int birthYear = currentYear - age; //the formula for calculating the birth year of user
    System.out.println("Your year of birth " + birthYear); //the final result printed
    }
     static void calculateDaysOld (Scanner scanner) {
        System.out.print("Enter the year you were born (YYYY):");
        int birthYear = scanner.nextInt();
    System.out.print("Enter the month you were born (M):");
    int birthMonth = scanner.nextInt();
    System.out.print("Enter the day you were born (DD):");
    int birthDay = scanner.nextInt(); //repeat the process of storing data
         LocalDate birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
         LocalDate today =  LocalDate.now();
         long daysOld = ChronoUnit.DAYS.between(birthDate, today);
         System.out.println("You are " + daysOld + " days old");
}
static void feetToMiles (Scanner scanner){
        System.out.print ("Enter the Measurement in feet you want to be converted to Miles");
        int enteredFeet = scanner.nextInt();
        int Miles = 5280;
        int finalCalc = (enteredFeet * 5280);
        System.out.print (enteredFeet +" converted to miles is " + finalCalc);
}
static void interestCalculator (Scanner scanner){ /*
This method will now calculate the interest at the rate of 0.01 throughout the year
based on the initial deposit given
*/
        double interestRate = 0.01; //this is the rate of interest given in question
        System.out.print( "How much would you like to deposit?" );
        double depositAmount = scanner.nextDouble();
        double interestOverTime = (depositAmount * interestRate);
        double finalAmount = (depositAmount + interestOverTime);
        System.out.println ("Your interest earned is " + interestOverTime);
        System.out.println ("Total interest after 1 year " + finalAmount);
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

        calculateDaysOld(scanner); // Calculate Days old of the user from their DOB

        feetToMiles(scanner); // Convert the user inputted feet to miles

        interestCalculator(scanner); // calculate interest on an initial deposit from the span of a year

        scanner.close(); // close scanner for cleaner code (at the end because a majority of functions use scanner

    }
}



