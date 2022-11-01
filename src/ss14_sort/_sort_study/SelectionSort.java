package ss14_sort._sort_study;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {2, 7, 8, 9, 1, -5};

        selectSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Giả sử minIndex = i
            for (int j = i + 1; j < arr.length; j++) { // Tìm vị trí index nhỏ nhất
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { // Tùy chọn => Giúp tăng tốc độ
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
