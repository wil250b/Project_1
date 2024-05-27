import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    ArrayList<Assignment> assignments;
    ArrayList<Student> registeredStudents;
    ArrayList<Double> finalScores;
    public static int nextId = Assignment.nextId;

    public boolean isAssignmentWeightValid() {
        //???
    }
    public boolean registerStudent (Student student) {

        registeredStudents.add(student);

        return true;
    }
    public int[] calcStudentsAverage(){
        //???
    }
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        int nextId;

        Assignment assignment1 = new Assignment(assignmentName, weight, maxScore);
        return true;
    }
    public void generateScores() {
        Random random = new Random();
        int[] rands = new int[5];
        for(int i =  1; i < 5; i++) {
            int randomNum = random.nextInt(0,101);
            rands[i] = randomNum;
        }
    }
    public void displayScores() {
        //???
    }
    public String toSimplifiedString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                '}';
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                ", assignments=" + assignments +
                ", registeredStudents=" + registeredStudents +
                '}';
    }
}
