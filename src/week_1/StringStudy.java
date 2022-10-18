package week_1;

public class StringStudy {
    public static void main(String[] args) {
//        Format code: Windows: Ctrl + Alt + L MacOS: ⌘⌥L
//        Xóa import dư thư viện:  Windows: Ctrl + Alt + O MacOS: ⌘⌥O
        String str1 = "Nguyễn Ngọc Quang";
        String str2 = "Nguyễn Ngọc Quang";
        String str3 = new String("Nguyễn Ngọc Quang");

        int a = 2;
        /*
        địa chỉ
        giá trị
         */

        // Tham chiếu
        /*
        địa chỉ
        giá trị
        Miền giá trị
         */

        /*
        == là so sánh giá trị => giá trị của biết đối tượng là địa chỉ bên heap
         */
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}
