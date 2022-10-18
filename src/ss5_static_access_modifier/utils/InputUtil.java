package ss5_static_access_modifier.utils;

import java.util.Scanner;

public class InputUtil {
    public static int inputPositive(String target) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.printf("Nhập vào %s: ", target);
            number = Integer.parseInt(scanner.nextLine());

            if (number < 0) {
                System.out.println("Phải nhập vào số nguyên dương, xin nhập lại!!!");
            }
        } while (number < 0);

        return number;
    }
}
