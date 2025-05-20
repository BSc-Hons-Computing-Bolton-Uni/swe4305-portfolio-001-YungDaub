public class GradeCalculator {

    public static String calculateGrade(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }

        if (mark >= 70) return "A (First Class)";
        else if (mark >= 60) return "B (Upper Second Class)";
        else if (mark >= 50) return "C (Lower Second Class)";
        else if (mark >= 40) return "D (Third Class)";
        else return "F (Fail)"; //If else statement to validate which grade the student got based on marks
    }
}
