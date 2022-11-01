package ss12_map_tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Hoàng Anh Thắng");
        stringMap.put(2, "Hoàng Anh Thắng 2");
        stringMap.put(3, "Trần Thị Thuý Diễm");

        // Khi truyền vào key sẽ lấy được value
        System.out.println(stringMap.get(1));
//        System.out.println(stringMap.get(2));
        System.out.println(stringMap);

        int[] arr = {1, 2, 3};
        for (int item : arr) {
            System.out.println(item);
        }

        //Các duyệt thứ nhất
        /*
        Bước một: Chuyển stringMap thành  stringMap.entrySet()
        Bước 2: dùng Entry đề duyệt qua stringMap.entrySet()
         */
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }

        //Các duyệt thứ 2
// Lấy ra tất cả key của map
        Set<Integer> integerSet = stringMap.keySet();
        for (Integer key : integerSet) {
            System.out.printf("%s - %s\n", key, stringMap.get(key));
//            System.out.println(stringMap.get(key));
        }
    }
}
