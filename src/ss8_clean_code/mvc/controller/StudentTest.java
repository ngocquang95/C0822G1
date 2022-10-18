package ss8_clean_code.mvc.controller;

import ss8_clean_code.mvc.model.Student;

public class StudentTest {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Nguyễn Văn A", 5);
        students[1] = new Student(2, "Nguyễn Văn B", 4);
        students[2] = new Student(3, "Nguyễn Văn C", 8);
        students[3] = new Student(4, "Nguyễn Văn D", 10);
    }

    public static void main(String[] args) {
        //CRUD
        /**
         * C: Create => Tạo mới
         * R: Read => đọc => lấy danh sách và hiển thị
         * U: Update => chỉnh sửa
         * D: Delete
         */
        int chose = 2;
        System.out.println("============= Menu =============");
        System.out.println("1. Thêm mới");
        System.out.println("2. Hiển thị danh sách");

        switch (chose) {
            case 1:
                break;
            case 2:
                display();
                break;
            //.........
        }
    }

    public static void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Thông tin sinh viên thứ: " + (i + 1));
                System.out.println(students[i].toString());
            }
        }
    }
}
