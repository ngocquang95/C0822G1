package ss19_string_regex;

public class RegexStudy {
    public static void main(String[] args) {
        String regex = "abc";

        System.out.println("abc".matches(regex));
        System.out.println("abc".equals(regex));


        //Dấu ngoặc vuông [...] => Đại điện cho một ký tự
        System.out.println("a".matches("[abc]"));

        //Dấu gạch ngang (-) : Tự động tạo cho chúng ta một dãy các ký tự liên tục
        System.out.println("12".matches("[a-zA-Z0-9]"));

        // Dấu mũ (^) : Ngoại trừ tập hợp ký tự mẫu khi nằm trong []
        System.out.println("4".matches("[abc]"));
        System.out.println("4".matches("^[abc]$"));

        // Sử dụng ký tự * => 0 hoặc nhiều lần lặp lại 
        System.out.println("Sabc".matches("[A-Z][a-z]*"));

        // Sử dụng ký tự + => 1 hoặc nhiều lần

        // Sử dụng ký tự ? => 0 hoặc 1 lần

        //Sử dụng ký tự ngoặc ngọn {}
        // Có n ký tự
        System.out.println("SV***".matches("SV[^0-9]{3}"));

        //3~5 số
        System.out.println("SV12345".matches("SV[0-9]{3,5}"));

        //3 số trở lên
        System.out.println("SV12345234234676573426675423547".matches("SV[0-9]{3,}"));

        //SV từ 100 > 500
        System.out.println("SV125".matches("SV[1-5]\\d{2}"));

        //Số lẻ
        //SV01
        //SV0123
        //SV012345
        System.out.println("SV0123455".matches("SV(\\d\\d)+"));

        //Từ G đến M nhưng không có chữ J
        System.out.println("5".matches("[0-46-9]"));
    }
}
