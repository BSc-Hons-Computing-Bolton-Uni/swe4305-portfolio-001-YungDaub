package Logbook.Week3;


   class Main {
    public static void main(String[] args) {
        /* When making classes in java it is good to
        create separate instance tabs for better organisation and an
        overall easier time when debugging the code
         */
        Student student = new Student(101, "Alice Smith"); //Student details

        // Display the student's information
        student.displayStudentInfo();

        // Update the student's name using setter
        student.setName("Alice Johnson");

        // Display updated information
        System.out.println("\nUpdated Student Information:");
        student.displayStudentInfo();
    }
}

