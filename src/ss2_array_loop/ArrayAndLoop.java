package ss2_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử mảng: ");
            n = Integer.parseInt(scanner.nextLine());

            if ( n <= 0) {
                System.out.println("Số lượng phần tử của mảng phải > 0, xin nhập lại!!!");
            }
        } while ( n <= 0);

        //Bước 2: tạo mảng dựa vào số lượng phần tử đã nhập
        int[] arr = new int[n];

        //Bước 3: Nhập từng phần tử
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào a[" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
//            arr[i] = scanner.nextInt();
        }

//        Bước 4: XUất phần tử ra
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(Arrays.toString(arr));

        //Cách duyệt mảng 2 chiều
        int[][] arr6 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
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
