package ss5_static_access_modifier._static;

public class Student {
    int id; // Duy nhất
    String name; // => Biến instance
    static String className = "C0822G1";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
