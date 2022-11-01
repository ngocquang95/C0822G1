package ss13_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-100, 1, 3, 5, 6, 100};

        System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int k, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            //Bước 2
            if (arr[mid] == k) {
                return mid;
            }
            //Bước 3
            if (k > arr[mid]) {
                return binarySearch(arr, k, mid + 1, right);
            }
            //Bước 4
            return binarySearch(arr, k, left, mid - 1);
        }

        return -1;
    }
}
