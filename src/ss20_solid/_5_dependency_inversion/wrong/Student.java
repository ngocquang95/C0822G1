package ss20_solid._5_dependency_inversion.wrong;

public class Student {
    private int id;
    private String name;
    private Double score;
    private LaptopDell laptopDell;

    public Student() {
    }

    public Student(int id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(int id, String name, Double score, LaptopDell laptopDell) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.laptopDell = laptopDell;
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
