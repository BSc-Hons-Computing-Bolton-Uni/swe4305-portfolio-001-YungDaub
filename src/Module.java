import java.util.HashMap;
import java.util.Map;

public class Module {
    private String moduleCode;
    private String moduleName;
    private Map<String, Integer> studentMarks = new HashMap<>(); //declare module codes

    public Module(String moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }

    public void addOrUpdateMark(String studentID, int mark) {
        studentMarks.put(studentID, mark);
    }

    public Integer getMark(String studentID) {
        return studentMarks.get(studentID); //returns the mark for student based on ID
    }

    public Map<String, Integer> getAllMarks() {
        return studentMarks; //will pull all student marks
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    @Override
    public String toString() {
        return moduleCode + " - " + moduleName; //tostring for usability
    }
}
