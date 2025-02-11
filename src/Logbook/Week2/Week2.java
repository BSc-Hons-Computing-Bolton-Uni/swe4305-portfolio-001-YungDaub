package Logbook.Week2;

import java.time.Year;
import java.util.Scanner;

class Main
{
//task 2
    static void birthYear(Scanner scanner) {

        int currentYear = Year.now().getValue();
        System.out.print("How old are you");
        int age = scanner.nextInt();
        int birthYear = currentYear - age;
        System.out.println("Your year of birth " + birthYear);
        if (age > 18) { // Additional message if the user is over 18
            System.out.println(" You are over 18 years old");


        }
    }
    static void uniGrades(Scanner scanner) {
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        birthYear(scanner);
        uniGrades(scanner);


    }
}
