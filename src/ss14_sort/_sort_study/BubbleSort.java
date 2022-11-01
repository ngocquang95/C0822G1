package ss14_sort._sort_study;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2, 7, 8, 9, 1, -5};

        bubbleSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSwap = true; //Kiểm tra mảng đã được sort hay chưa
        for (int i = 0; i < arr.length - 1 && isSwap; i++) {
            isSwap = false; // đã sắp xếp
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Mảng chưa được sắp xếp xong
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true; // Chưa được sắp xếp
                }
            }
        }
    }
}
