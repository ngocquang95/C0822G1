package ss2_array_loop;

import java.util.Scanner;

public class LoopStudy {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (true) {
            i++;
            if (i == 2) {
                continue;
            }

            if(i % 5 == 0) {
                break;
            }
            System.out.println(i);
        }

        // Kiểm tra điểm

        Scanner scanner = new Scanner(System.in);

        double score;
        do {
            System.out.print("Nhập vào điểm của bạn: ");
            score = Double.parseDouble(scanner.nextLine());

            if (score > 10 || score < 0) {
                System.out.println("Điểm nhập vào không hợp lệ [0:10], xin nhập lại!!!");
            }
        } while (score > 10 || score < 0);

        System.out.println("Điểm của bạn: " + score);
    }
}
