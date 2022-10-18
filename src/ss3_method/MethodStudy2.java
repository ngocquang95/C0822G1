package ss3_method;

import java.util.Scanner;

public class MethodStudy2 {
    public static void main(String[] args) {
        // Kiểm tra số nguyên tố

        // Đếm xem trong mảng có bao nhiêu số nguyên tố
        int count = 0;
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
//            if (isPrime(arr[i])) {
//                count++;
//            }
        }

//        if (isPrime(5)) {
//            System.out.println("Số nguyên tố");
//        } else {
//            System.out.println("Không phải là số nguyên tố");
//        }
    }

    //Kiểm tra số nguyên tố
    void isPrime(int n) {
        if (n < 2) {
            System.out.println("Không phải số nguyên tốt");
        } else {
            int count = 0;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Số nguyên tố");
            } else {
                System.out.println("Không phải Số nguyên tố");
            }
        }
    }
}
