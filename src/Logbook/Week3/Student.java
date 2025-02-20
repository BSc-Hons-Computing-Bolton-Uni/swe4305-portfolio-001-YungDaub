package Logbook.Week3;

public class Student {

        private int id;         // Student ID (int)
        private String name;     // Student name (String)

        /*Constructor to initialize the Student object
        I went about this by using the getter and setter method
        which allows us to easily update or adjust
        data for private classes in Java
         */
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Getter for ID
        public int getId() {
            return id;
        }

        // Setter for ID
        public void setId(int id) {
            this.id = id;
        }

        // Getter for Name
        public String getName() {
            return name;
        }

        // setter for student name
        public void setName(String name) {
            this.name = name;
        }

        // Method to display student details
        public void displayStudentInfo() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
        }
    }


