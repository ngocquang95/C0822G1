package ss4_oop;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Nguyễn Văn A", 2, true);
        Student s1 = new Student();
        s1.name = "Nguyễn Văn a";
        s1.age = 2;
//
//        System.out.println("Tên: " + s1.name);
//        System.out.println("Tuổi: " + s1.age);

//        Student s2 = new Student();
        Student student = new Student("Nguyễn Văn B", Student.HANG_NE_1);
    }
}
