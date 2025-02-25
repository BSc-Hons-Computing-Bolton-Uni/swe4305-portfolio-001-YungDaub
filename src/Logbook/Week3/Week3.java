package Logbook.Week3;



class Main {
    public static void main(String[] args) {
        /* When making classes in java it is good to
        create separate instance tabs for better organisation and an
        overall easier time when debugging the code
         */
        Student student = new Student(100184278, "Charlie Daubney"); //Student details (interchangeable)

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

        Course course = new Course ("SWE4305" , "Object Oriented Programming");
        course.displayCourseinfo(); // Will display the passed through data in the course class
    }
}




