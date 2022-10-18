package week_1;

public class PrintStudy {
    public static void main(String[] args) {
        double a = 10;
        double b = 4;

        double c = a + b;
        //3 + 3 = 6
        System.out.println(a + " + " + b + " = " + c);
        System.out.printf("%-10.2f + %.1f = %f", a, b, c);
        /*
        Đặc tả
        số nguyên: %d
        Số thực: %f
        ký tự: %c
        String: %s
         */
    }
}
