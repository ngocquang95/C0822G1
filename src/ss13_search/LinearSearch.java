package ss13_search;

public class LinearSearch {
    public static void main(String[] args) {
        // Cho mảng 1 chiều, tìm kiếm k có tồn tại trong mảng hay không, nếu tìm thấy thì trả về vị trí index?
//        int[] arr = {5, 3, 6, 1, -100, 100};
//
//        System.out.println(linearSearch(arr, 50));

        System.out.println(factorial(-1));
    }

    public static int linearSearch(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // Đệ quy => Tính giai thừa

    /**
     * 5! = 1 * 2 * 3 * 4 * 5 = 120
     *
     * n = 3=> factorial(3) = 3 * factorial(2) = 3 * 2 = 6
     * factorial(2) = 2 * factorial(1) = 2 * 1 = 2
     * factorial(1) = 1
     */
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
