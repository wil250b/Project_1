import java.util.ArrayList;

public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private Course[] registeredCourses;
    private double[] finalScores;
    public static int nextId;

    public Student(String studentId, String studentName, Gender gender, Address address,
                   Department department, Course[] registeredCourses, double[] finalScores) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.registeredCourses = registeredCourses;
        this.finalScores = finalScores;
    }

    public Course[]<> registerCourse(String courseId) {
        ArrayList<Course[]> course = new ArrayList<>();
        //insert logic

        return course;
    }

    public Course[] dropCourse(String courseId) {
        ArrayList<Course[]> course = new ArrayList<>();

        //insert logic

        return course;
    }
}

