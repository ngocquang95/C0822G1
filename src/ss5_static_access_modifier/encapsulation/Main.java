package ss5_static_access_modifier.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(1);
        student.setName("Nguyễn Văn A");
//        student.score = 50; //[0;10]
        student.setScore(5);
    }
}
