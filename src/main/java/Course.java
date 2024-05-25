import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    ArrayList<Assignment> assignments;
    ArrayList<Student> registeredStudents;
    ArrayList<Double> finalScores;
    private static int nextId;

    public boolean isAssignmentWeightValid() {

    }
    public boolean registerStudent (Student student) {

        registeredStudents.add(student);

        return true;
    }
    public int[] calcStudentsAverage(){

    }
}
