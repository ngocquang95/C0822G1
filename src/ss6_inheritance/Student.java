package ss6_inheritance;

// Student is a Person
// Student has a Address
public class Student extends Person {
    private double score;
    private Address address;

    public void getInfo() {

    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public Student() {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", super.getId(), super.getName(), this.score);
    }
}
