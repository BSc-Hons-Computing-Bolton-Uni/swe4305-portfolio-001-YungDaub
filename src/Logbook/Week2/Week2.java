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



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        birthYear(scanner);
        uniGrades(scanner);
        loopTask();
        multiSeven();
        multiTable(scanner);

    }
}
