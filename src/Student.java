public class Student {
    private String studentID;
    private String name; //declared class Student

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name; //constructor for student ID and name attributes
    }

    public String getStudentID() { //getter for StudentID
        return studentID;
    }

    public String getName() { //getter for name
        return name;
    }

    public void setName(String name) { //updates name with entered value
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name;
        /*
        This is an overriden tostring function, this ensures
        the entered details will be more easily
        readbale and formatted correctly
         */
    }
}
