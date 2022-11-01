package ss15_exception;

public class ExceptionStudy1 {
    public static void main(String[] args) {
        //1/0

//        int a = 1 / 0; // ArithmeticException
//        System.out.println(a);

//        String name = null;
//        name.contains("abc"); //•	NullPointerException
        String str = "123abc";
        int a = Integer.parseInt(str); // •	NumberFormatException

        System.out.println("Chương trình kết thúc không lỗi lầm!!!");
    }
}
