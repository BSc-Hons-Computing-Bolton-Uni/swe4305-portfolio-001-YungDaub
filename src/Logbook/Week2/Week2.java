package Logbook.Week2;

import java.time.Year;
import java.util.Scanner;

class Main {

    static void birthYear(Scanner scanner) {

        int currentYear = Year.now().getValue();
        System.out.print("How old are you");
        int age = scanner.nextInt();
        int birthYear = currentYear - age;
        System.out.println("Your year of birth " + birthYear);
        if (age > 18){ // Additional message if the user is over 18
            System.out.println(" You are over 18 years old");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        birthYear(scanner);

    }
}
