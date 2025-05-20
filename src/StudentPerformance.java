import java.util.ArrayList;
import java.util.List;

public class StudentPerformance { //class declaration
    private List<Student> students = new ArrayList<>(); //array for student
    private List<Module> modules = new ArrayList<>(); //array for modules

    public void addStudent(Student student) { //add student method to add student
        students.add(student);
    }

    public void addModule(Module module) { //add module method to add module
        modules.add(module);
    }

    public Student findStudent(String studentID) { //find student based on entered info
        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(studentID)) return s;
        }
        return null;
    }

    public Module findModule(String moduleCode) {
        for (Module m : modules) {
            if (m.getModuleCode().equalsIgnoreCase(moduleCode)) return m;
        } //
        return null;
    }

    public List<Student> getStudents() { 
        return students; //returns student list
    }

    public List<Module> getModules() {
        return modules; //returns module list
    }
}
