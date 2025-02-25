package Logbook.Week3;

public class Course {
 // Variable type string for course code and name
    private String code;
    private String name;

    // Constructor with purpose of storing the code and name
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    /*
    Getter and Setter for code (for encapuslation)
     */
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    } /*
    Getter and setter for name*/

    public void setName(String name) {
        this.name = name;
    }

    public void displayCourseinfo() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }
}
