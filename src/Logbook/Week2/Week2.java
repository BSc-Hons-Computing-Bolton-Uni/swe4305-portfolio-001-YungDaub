package Logbook.Week2;

import java.time.Year;
import java.util.Scanner;

class Main
{
//task 2
    static void birthYear(Scanner scanner)
    {

        int currentYear = Year.now().getValue();
        System.out.print("How old are you");
        int age = scanner.nextInt();
        int birthYear = currentYear - age;
        System.out.println("Your year of birth " + birthYear);
        if (age > 18) { // Additional message if the user is over 18
            System.out.println(" You are over 18 years old");


        }
    }
    static void uniGrades(Scanner scanner)
    {
        System.out.print ("What is your original grade (Between A-F)");

        String ogGrade = scanner.next();
        String newGrade = "";
        switch(ogGrade) {
            case "A":
                newGrade = "First";
                break;
            case "B":
                newGrade = "2:1";
                break;
            case "C":
                newGrade = "2:2";
                break;
            case "D":
                newGrade = "3rd";
                break;
            case "E":
                newGrade = "Ordinary";
                break;
            case "F":
                newGrade = "Fail";
                break;

            default:
                System.out.print("Please enter a character within the specified range");
                break;

        }

        System.out.print("Your converted grade is " + newGrade);











    }
    /* the first statement defines variable,
       the 2 state conditions that need to be met?*/
    static void loopTask()
    {
    for (int i = 1; i < 10 ; i += 1)
    {
        System.out.println (i);
    }
    }
    static void multiSeven()
    { /* This function will use a for loop to display every number up to 12 and then multiply that by 7
    and then print the output to the user.
    Task 4
    */
    for (int i = 1; i <= 12; i++) {
        int number = 7;
        System.out.println(i + " x " + number + " = " + (i * number));
    }
    }
    static void multiTable(Scanner scanner){
        System.out.print("What number would you like to see the times table of?");
        int num = scanner.nextInt();
        System.out.println("Multiplication Table for " + num + ":");
        /* The code above this will be the output to the user and take
        the input from the user allowing them to enter their number, underneath this i will write
        a for loop to continue the loop which will be mostly the same as task 4 just with the user
        input instead of int being defined as 7
         */
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }


    }

static void tableMessage(Scanner scanner) {
    char choice;
    do { //Add in do while loop to the same code as seen in the prior task
        System.out.print("Enter a number to display its multiplication table");
        int number = scanner.nextInt();
        System.out.println("The multiplication table for" + number);
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));


                /* Here I will add in the functionality which asks
                if the user would like to continue or exit
                 */
        }
            System.out.print("Would you like to enter another number?");
        // Ask the user if they want to another number
        choice = scanner.next().toUpperCase().charAt(0); // Read whether the user wants to run it again

    } while (choice == 'Y') ;

    System.out.print(" Goodbye, thank you for using this system");
    scanner.close();
}

    static void examGrader(Scanner scanner) { /*
    The purpose of this code is to ask the user what mark they
    received on their test and then calculate their grade from
    the entered mark, it is pretty simple and can be done with just
    a few if else statements which i will do below
    */
        System.out.println("Enter your mark from 1-100");
        int mark = scanner.nextInt();
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid entry! Please enter a number between 0 and 100."); // to catch any invalid input
        } else if (mark >= 70) {
            System.out.println("Your grade: First (1st)");
        } else if (mark >= 60) {
            System.out.println("Your grade: Upper Second  (2:1)");
        } else if (mark >= 50) {
            System.out.println("Your grade: Lower Second (2:2)");
        } else if (mark >= 40) {
            System.out.println("Your grade: Third (3rd)");
        } else if (mark >= 35) {
            System.out.println("Your grade: Ordinary"); // if else statements for each instance
        } else {
            System.out.println("Your grade: Fail");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        birthYear(scanner);
        uniGrades(scanner);
        loopTask();
        multiSeven();
        multiTable(scanner);
        tableMessage(scanner);
        examGrader(scanner);
    }
}
