package ss15_exception;

public class ExceptionStudy2 {
    public static void main(String[] args) {
        int a = 0;
        try {
            // System.exit(0);
            String str = null;
            str.contains("abc"); //NullPointerException
            a = (int) (1 / 0); // ArithmeticException
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("Bị null");
            // Bị lỗi ở khối catch => finally không được chạy
            e.printStackTrace();//Giúp lập trình viên phát hiện lỗi
        } catch (ArithmeticException e) {
            System.out.println("Chia cho 0");
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println(a);
        }

        System.out.println("Chương trình kết thúc không lỗi lầm!!!");
    }
}
