package ss1_introduction.exersice;

public class IfElseSwitchCase {
    public static void main(String[] args) {
        /*
        điểm < 5 => Rới module
        điểm < 7 & điểm >= 5 => qua module
         điểm >= 7 => Giỏi
         */

        double score = 6;
        //Cách thiếu nhi
        if (score < 5) {
            System.out.println("Rớt module");
        }
        if (score >= 5 && score < 7) {
            System.out.println("Qua module");
        }
        if (score >= 7 && score <= 10) {
            System.out.println("Giỏi");
        }

        //Cách người lớn
        if (score < 5) {
            System.out.println("Rớt module");
        } else if (score >= 5 && score < 7) {
            System.out.println("Qua module");
        } else if (score >= 7 && score <= 10) {
            System.out.println("Giỏi");
        }

        //Cách người trưởng thành
        if (score < 5) {
            System.out.println("Rớt module");
        } else if (score < 7) {
            System.out.println("Qua module");
        } else {
            System.out.println("Giỏi");
        }
    }
}
