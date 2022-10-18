package ss2_array_loop;

public class Main {
    public static void main(String[] args) {
        int[] arr; // Khai báo mảng
        //arr: biến đối tượng, biến tham chiếu
        int a; //a được gọi là biến

        int[] arr1 = new int[10];
        String[] arr2 = new String[10];

        int[] arr3 = new int[] {1, 2, 3, 4, 5};
        int[] arr4;
        arr4 = new int[] {1, 2, 3, 4, 5};

        for(int item : arr4) { //foreach nè
            System.out.println(item);
        }

        //Khi khai báo và khởi tạo trên cùng 1 dòng
        int[] arr5 = {1, 2, 3, 4, 5};

        int[][] arr6 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        System.out.println(arr6[1].length);
    }
}
