package ss20_solid._5_dependency_inversion.right;

public class Student {
    private int id;
    private String name;
    private Double score;
    private double score2; // thay thành double
    private Laptop laptop;

    public Student(int id, String name, Double score, double score2, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.score2 = score2;
        this.laptop = laptop;
    }

    public Double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Student() {
    }

    public Student(int id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(int id, String name, Double score, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
