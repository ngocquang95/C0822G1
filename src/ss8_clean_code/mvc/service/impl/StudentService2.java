package ss8_clean_code.mvc.service.impl;

import ss8_clean_code.mvc.model.Student;
import ss8_clean_code.mvc.service.IStudentService;

public class StudentService2 implements IStudentService {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Nguyễn Văn A", 5);
        students[1] = new Student(2, "Nguyễn Văn B", 4);
        students[2] = new Student(3, "Nguyễn Văn C", 8);
        students[3] = new Student(4, "Nguyễn Văn D", 10);
    }

    @Override
    public void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Thông tin sinh viên thứ: " + (i + 1));
                System.out.println(students[i].toString());
            }
        }
    }

    //add

    // edit

    //delete
}
