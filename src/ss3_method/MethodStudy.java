package ss3_method;

import java.util.Scanner;

public class MethodStudy {
    public static void main(String[] args) {
//        -	Bước 1:Khai báo c, c, c
//                - Bước 2:Nhập vào c, c, c > 0
        Scanner scanner = new Scanner(System.in);

        int a = inputPositive("a");
        int b = inputPositive("b");
        int c = inputPositive("c");
//                - Bước 3:Tính giai thừa cho từng loại
//flow => Luồng thực thi của chương trình
        long factorialA = getFactorial(a);
        long factorialB = getFactorial(b);
        long factorialC = getFactorial(c);

//        -Bước 4:Tính tổng
        long sum = factorialA + factorialB + factorialC;
        System.out.printf("%d! + %d! + %d! = %d", a, b, c, sum);
    }

    static long getFactorial(int a) {
        long factorialA = 1;
        for (int i = 2; i <= a; i++) {
            factorialA *= i;
        }
        return factorialA;
    }

    static int inputPositive(String target) {
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
