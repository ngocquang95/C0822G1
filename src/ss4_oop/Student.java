package ss4_oop;

public class Student {
    String name; // Khai báo thuộc tính
    int age;
    boolean isMale; //false
    final double HANG_NE;

    public void Student() { // Đây là phương thức => Không phải Student

    }

    static final int HANG_NE_1 = 1;
    static final int HANG_NE_2 = 2;
    static final int HANG_NE_3 = 3;

    public Student() {
        HANG_NE = 100.0;
    }

    public Student(String name, final double hang) {
        HANG_NE = hang;
        this.name = name;
    }

    public Student(String name, int age, final double hang) {
        HANG_NE = hang;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, boolean isMale) {
        HANG_NE = 100.0;
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    void eat() {
        System.out.println(name + " có thể ăn");
    }
}
