package Logbook.Week3;

import Logbook.Week.Course;
import Logbook.Week4.Module;

import java.util.ArrayList;
import java.util.Random;

public class Student {

    private int id;         // student ID (int)
    private String name;     // student name (String)
    private Course course;
    private int[] marks; // marks corresponding to modules

    // Constructor to initialize the Student object
    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;

        if (this.course == null) {
            throw new IllegalArgumentException("Students have to be enrolled to get a mark");
        }

        // Get the modules from the course
        ArrayList<Module> modules = course.getModules();
        int numModules = modules.size();

        // Generate random marks for each module
        this.marks = new int[numModules];
        Random rand = new Random();
        for (int i = 0; i < numModules; i++) {
            marks[i] = rand.nextInt(101);  // 101 so it can only go up to 100
        }
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.print("This is not a valid input, please input your name");
        }
    }

    // Getter for course class
    public Course getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(Course course) {
        this.course = course;
    }

    // Enrol method for course
    public void enrol(Course course) {
        if (course != null) {
            this.course = course;
            System.out.println(name + " Has enrolled in the following course: " + course.getCode());
            System.out.println("Name of enrolled course " + course.getName());
        } else {
            System.out.println("The input is not a valid course, please try again");
        }
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("\nStudent ID: " + id);
        System.out.println("Student Name: " + name);

        if (course != null) { // if the student is enrolled in a course
            System.out.println("This student is enrolled in the course: " + course.getName());

            ArrayList<Module> modules = course.getModules();
            System.out.println("\nModule Marks:");

            // Loop through each module and display its name and the student's mark
            for (int i = 0; i < modules.size(); i++) {
                int mark = marks[i];
                String grade = modules.get(i).getGrade(mark);
                System.out.println("- " + modules.get(i).getModuleName() + ": " + marks[i] + "/100 - Grade " + grade);
            }
        }
    }
}












