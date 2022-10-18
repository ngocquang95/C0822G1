package ss2_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        do {
            System.out.print("Nhập vào hàng: ");
            m = Integer.parseInt(scanner.nextLine());

            if ( m <= 0) {
                System.out.println("Số lượng hàng > 0, xin nhập lại!!!");
            }
        } while ( m <= 0);

        int n;
        do {
            System.out.print("Nhập vào cột: ");
            n = Integer.parseInt(scanner.nextLine());

            if ( n <= 0) {
                System.out.println("Số lượng cột > 0, xin nhập lại!!!");
            }
        } while ( n <= 0);

        int[][] arr6 = new int[m][n];

        for (int i = 0; i < arr6.length; i++) { // Duyệt hàng
            for (int j = 0; j < arr6[i].length; j++) { // Kiểm tra mảng con có bao nhiêu phần tử
                System.out.print("Nhập vào a[" + i + "][" + j + "]: ");
                arr6[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        /*
        1 2 3
        4 5
        6 7 8
         */
        for (int i = 0; i < arr6.length; i++) { // Duyệt hàng
            for (int j = 0; j < arr6[i].length; j++) { // Kiểm tra mảng con có bao nhiêu phần tử
                System.out.print(arr6[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
