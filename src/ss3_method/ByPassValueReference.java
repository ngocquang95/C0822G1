package ss3_method;

import java.util.Arrays;

public class ByPassValueReference {
    public static void main(String[] args) {
        // Tham trị
        int a = 2;

//        changeData(a);
        int n = a;
        n = 100;

        int[] b = {1, 2, 3, 4, 5};
        changeData(b);

        System.out.println("b sau khi ra khỏi phương thức: ");
        System.out.println(Arrays.toString(b));
    }
    static void changeData(int[] arr) {
        arr[0] = 100;
        arr = new int[] {1, 2, 3};
        arr[1] = 200;
    }

    static void changeData(int n) {
        n = 100;
    }
}
