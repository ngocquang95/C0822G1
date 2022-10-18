package ss6_inheritance;

public class Main2 {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Student();
        people[1] = new Teacher();
        /*
        compile: Dựa vào tên class
        runtime: Dựa vào đối tượng tham chiếu tới
         */
        Person person = new Person(); // Ngầm định

        if (person instanceof Student) {
            Student student = (Student) person; // Tường minh
            System.out.println(student.MAX_STUDENT);
        }

        //ClassCastException => lúc runtime => Cha => Con
    }
}
