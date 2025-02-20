//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        class Student {
            private int id;         // Student ID (int)
            private String name;     // Student name (String)

            // Constructor to initialize the Student object
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

            // Setter for Name
            public void setName(String name) {
                this.name = name;
            }

            // Method to display student details
            public void displayStudentInfo() {
                System.out.println("Student ID: " + id);
                System.out.println("Student Name: " + name);
            }
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

        }
    }
}