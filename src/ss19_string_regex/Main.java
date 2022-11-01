package ss19_string_regex;

public class Main {
    public static void main(String[] args) {
        String name1 = "Hello";
        String name2 = "Nguyễn Văn A";

        name1 = name1.concat(name1);
//        System.out.println();
//
//        String name4 = name1 + name2; //Quá tải toán tử

//        System.out.println(name1);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append("Nguyễn Văn A");
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i; // Trừ nữa tháng lương
            stringBuilder.append(i); // Nâng lương
        }

        String str2 = stringBuilder.toString(); // CHuyển đổi từ stringBuilder -> String
        StringBuilder str3 = new StringBuilder(str2); // CHuyển đổi từ String -> stringBuilder

        System.out.println(stringBuilder);
    }

    public void test() {
        //Test
        //Bất đồng bộ => Cho 100 người cùng sử dụng phương thức
        //Đồng bộ => Người này xong rồi mới được người kia vào
    }
}
