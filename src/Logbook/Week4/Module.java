package Logbook.Week4;

/*
Task 1- Begin by making a class for Module
including attributes Name and Code. Following
this will be a constructor to pass data
through
 */
public class Module {
    private String name;
    private String code;

    public Module(String moduleName, String moduleCode) {
        this.code = moduleCode;
        this.name = moduleName;
    }

    public String getModuleName() {
        return name;
    }

    public String getModuleCode() {
        return code;
        // Method to convert marks to letter grade
    }

        public String getGrade(int mark) {
            if (mark >= 90) {
                return "A";
            } else if (mark >= 80) {
                return "B";
            } else if (mark >= 70) {
                return "C";
            } else if (mark >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }



