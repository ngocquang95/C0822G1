package ss1_introduction.exersice;

import java.util.Scanner;

public class ScannerPrint {
    public static void main(String[] args) {
        //System.in: Tiêu chuẩn để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm của bạn: ");
        double score = Double.parseDouble(scanner.nextLine()); //10 enter
//        Integer.parseInt("123");

        System.out.print("Nhập vào tên của bạn: ");
//        scanner.nextLine();//Xóa dấu enter
        String name = scanner.nextLine();

        System.out.println("Tên của bạn: " + name);
        System.out.println("Điểm của bạn: " + score);
    }
}
