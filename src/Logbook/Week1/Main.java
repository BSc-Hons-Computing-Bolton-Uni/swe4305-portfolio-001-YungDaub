package Logbook.Week1;
//I have changed the arrangement of the code therefore now it will call each method as a step
import java.util.Scanner;

public class Main {

    //method printing "Hello world"
    static void World() {
        System.out.println("Hello world");
    }

   // removed the input handling and methods from the main class and reorganised.
    static void calculateArea() {
        Scanner scanner = new Scanner(System.in); //reading the user input by using scanner.

        System.out.println("What is the length of your rectangle?");
        double length = scanner.nextDouble();

        System.out.println("What is the height of your rectangle?");
        double height = scanner.nextDouble();

        double area = length * height;
        System.out.println("Your Area is " + area); //the formula the code will use to calculate the area.

        scanner.close(); // Close the scanner for cleaner code
    }

    // call on the main method
    public static void main(String[] args) {

        Main.World();

        // ask for user name
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String personName = scanner.next();
        System.out.println("Hello " + personName); // Print greeting

        // here i just called on the method for area to run after the name has been taken.
        calculateArea();

        scanner.close(); // Close scanner
    }
}
