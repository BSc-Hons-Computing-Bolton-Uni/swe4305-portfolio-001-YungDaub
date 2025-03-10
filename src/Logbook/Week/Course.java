package Logbook.Week;

import Logbook.Week4.Module;
import Logbook.Week3.Student;
import java.util.ArrayList;

public class Course {
    // Private attributes for encapsulation
    private String code;
    private String name;
    private final ArrayList<Logbook.Week4.Module> modules; // Ensure this is initialized

    // Constructor
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.modules = new ArrayList<>(); // Ensure initialization


        // add four modules inside the constructor
        modules.add(new Logbook.Week4.Module("Object-Oriented Programming", "SWE3401"));
        modules.add(new Logbook.Week4.Module("Algorithms", "SWE204"));
        modules.add(new Logbook.Week4.Module("Databases", "SWE303"));
        modules.add(new Logbook.Week4.Module("UML", "SWE104"));
        int[] marks = {15, 24, 32, 56};
    }

    // Getter methods
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }



    public void displayCourseinfo() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
        System.out.println("Modules:");

        for (Module module : modules) {
            System.out.println("- " + module.getModuleName() + " (" + module.getModuleCode() + ")");
        }
    }
    }



