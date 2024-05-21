import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    double weight;
    int maxScore;
    double assignmentAverage;
    ArrayList<Integer> scores = new ArrayList<Integer>();
    private static int nextId;

    public Assignment(String assignmentId, String assignmentName, double weight, int maxScore, double assignmentAverage, ArrayList<Integer> scores) {
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
        this.weight = weight;
        this.maxScore = maxScore;
        this.assignmentAverage = assignmentAverage;
        this.scores = scores;
    }

    public void calcAssigmentAvg(ArrayList<Integer> scores) {

        int length = scores.size();
        double total = 0;

        for (Integer score : scores) {
            total = total + score;
        }
        assignmentAverage = total / length;
    }

    public void generateRandomScore() {
        Random random = new Random();
        int rand = random.nextInt(0, 11);
        int score;

        switch (rand) {
            case 0 -> score = random.nextInt(0, 60);
            case 1, 2 -> score = random.nextInt(60, 70);
            case 3, 4 -> score = random.nextInt(70, 80);
            case 5, 6, 7, 8 -> score = random.nextInt(80, 90);
            case 9, 10 -> score = random.nextInt(90, 101);
        }
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }
}


