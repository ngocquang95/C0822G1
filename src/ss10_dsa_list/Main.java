package ss10_dsa_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        Integer a2 = a; // Cơ chế auto boxing
        int a3 = a2; //unboxing

        //Generic
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10); //Thêm phần tử
        arrayList.add(20); //Thêm phần tử
        arrayList.add(30); //Thêm phần tử
        arrayList.add(40); //Thêm phần tử
        arrayList.set(1, 100); //Chỉnh sửa
        arrayList.remove(2); // Xóa
        arrayList.add(1, 500);
        System.out.println(arrayList.contains(501));

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(10);
        integerSet.add(10);
        integerSet.add(10);
        integerSet.add(10);

        System.out.println(integerSet.size());
    }
}
