package Logbook.Week3;

public class Student {

        private int id;         // Student ID (int)
        private String name;     // Student name (String)
        private Course course; //Added for task 8, to associate students to course
        /*Constructor to initialize the Student object
        I went about this by using the getter and setter method
        which allows us to easily update or adjust
        data for private classes in Java
         */
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
            this.course = course;
        }

        /* Getter for ID
        Now the getters and setters which i have listed below may
        look useless however i have included them for
        the purpose of encapsulation and for easy debugging
        in the instance i need to use getter and setters.
        if tweaks need to be made i may have to use setters so i added
        them as a precaution to save time.
         */
        public int getId() {
            return id;
        }

        // Setter for ID
        public int setId(int id) {
            return id;
        }

        // Getter for Name
        public String getName() {
            return name;
        }


        // setter for student name
        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            } else {
                System.out.print("This is not a valid input, please input your name");
            }
        }
        // add getter for course class
           public Course getCourse() {
            return course;
           }
           public void setCourse(Course course){
            this.course = course;
           }


        // Method to display student details
        public void displayStudentInfo() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            /* for task 8 ill add an if else statement to find out
            which course the student is associated with or if they
            even are enlisted onto a course as they may not be
             */
            if (course != null) { //if the student is on a course
                System.out.print("This student is enrolled on ");


        }
        }
    }


