package Logbook.Week4;
import Logbook.Week3.Student;
import Logbook.Week.Course;
import java.util.Random;

public class Week4 {
    public static void main(String[] args) {
        // Create a Module object
        Module module = new Module("Object-Oriented Programming", "OOP101");
        Course course = new Course("CS101", "Computer Science");
        int[] marks = {15, 24, 32, 56};
        Student student = new Student(100184278, "Charlie Daubney", course);
        // Display module information
        /*
        I notice i created the function getStudentInfo however when
        calling it i ran into some problems therefore i used the getters to individually
        grab them, if i was to do this again i would use a function for cleaner code.
         */
        System.out.println("Student Name "+student.getName());
        System.out.println("Student ID " + student.getId());
        System.out.println("Module Name: " + module.getModuleName());
        System.out.println("Module Code: " + module.getModuleCode());
        course.displayCourseinfo();
        for (int mark : marks) {
            System.out.print(mark + " ");


            student.displayStudentInfo();


        }
    }
}