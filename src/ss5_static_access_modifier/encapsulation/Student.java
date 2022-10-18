package ss5_static_access_modifier.encapsulation;

public class Student {
    private int id;
    private String name;
    private double score;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Giá trị không hợp lệ [0; 10] => sẽ không được cập nhật");
        } else {
            this.score = score;
        }
    }
}
