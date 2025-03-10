package Logbook.Week3;

import Logbook.Week3.Student;
import Logbook.Week.Course;

class Main {
    public static void main(String[] args) {
        /* When making classes in java it is good to
        create separate instance tabs for better organisation and an
        overall easier time when debugging the code
         */
        Course course = new Course("SWE4305", "Object Oriented Programming");
        Student student = new Student(100184278, "Charlie Daubney", course); //Student details (interchangeable)

        // Display the student's information
        student.displayStudentInfo(); /*
        This will display the details stored within the Student
        Class as asked in task 3
        */
        student.setName("Charlie Daubney");

        // Display updated information
        System.out.println("\nUpdated Student Information:");
        student.displayStudentInfo(); /*
         Displays the student information entered into student.setname
         */

        course.displayCourseinfo(); // Will display the passed through data in the course class

    }
}


