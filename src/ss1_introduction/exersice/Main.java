package ss1_introduction.exersice;

public class Main {
    public static void main(String[] args) {
        //Khai báo biến: dataType
//        int a;//khai báo biến a
//        a = 2; // khởi tạo giá trị cho a
//        int b  = 2; // Khai báo và khởi tạo
//        System.out.println("Giá trị của b: " + b);

        byte b = 127; //[-128:127]
        short s = Short.MAX_VALUE;
        long l = 30000000000L;
        /*
        Trong java:
        Số nguyên: int
        Số thực: double
         */

        float f = 2.0F;
        double d = 10.0;
        //A - 65
        //a - 97
        char c = 'A';
        System.out.println((int) c);
        String name = "Hello";
    }
}
