package ss4_oop;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Nhập cho n sinh viên
        Scanner scanner = new Scanner(System.in);
        //KHởi tạo mảng
        Student[] students = new Student[2];//[null null]

        //Nhập giá trị cho từng phần tử
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Nhập vào thông tin sinh viên thứ " + (i + 1));

            System.out.print("Nhập vào tên: ");
            students[i].name = scanner.nextLine();

            System.out.print("Nhập vào tuổi: ");
            students[i].age = Integer.parseInt(scanner.nextLine());
        }

        //Xuất giá trị ra
        for(int i = 0; i < students.length; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1));
            System.out.println("Tên: " + students[i].name);
            System.out.println("Age: " + students[i].age);
        }
    }
}
