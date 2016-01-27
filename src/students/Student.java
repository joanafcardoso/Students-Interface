package students;

/**
 * Created by Cardoso on 26-Jan-16.
 */
public class Student {
    private String name;
    private double score;


    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }
}
