import java.util.ArrayList;

public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private Course[] registeredCourses;
    private double[] finalScores;
    private static int nextId = 1;

    public Student(String studentId, String studentName, Gender gender, Address address,
                   Department department, Course[] registeredCourses, double[] finalScores) {
        this.studentId = "S"+ nextId; //
        nextId++;
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.registeredCourses = registeredCourses;
        this.finalScores = finalScores;
    }

    /**
     *
     * @param course
     * @return
     */
    public ArrayList<Course[]> registerCourse(Course course) {
        ArrayList<Course[]> course1 = new ArrayList<>();

        for (int i = 0; i < course.size(); i++) {
            if (course.get(i).equals(course)) {
                return ArrayList<course> = null;
                continue;
            } else {
                course.add(course1);
            }

        }
        return course1;
    }

    public Course[] dropCourse(Course course) {
        ArrayList<Course[]> course = new ArrayList<>();

        //TODO

        return course;
    }
}

