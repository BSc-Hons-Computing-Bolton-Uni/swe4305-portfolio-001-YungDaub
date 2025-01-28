package Logbook.Week1;
import java.util.Scanner;
public class Main {
static void World(){ // World function will call the system to print "Hello World"

    System.out.println("Hello world");

}
        public static void main(String[] args) {
            Main.World();
            System.out.println("What is your name?");
            Scanner name = new Scanner(System.in);
            String personname = name.next();
            System.out.println("Hello "+  personname); //This is the code for the second task, System will say Hello (userinput)
        }
    }