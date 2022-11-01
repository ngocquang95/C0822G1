package ss12_map_tree;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapStudy3 {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new TreeMap<>(Collections.reverseOrder());

        stringMap.put(10, "Hoàng Anh Thắng");
        stringMap.put(-2, "Hoàng Anh Thắng 2");
        stringMap.put(9, "Trần Thị Thuý Diễm");
        stringMap.put(-9, "Trần Thị Thuý Diễm");
        stringMap.put(4, "Trần Thị Thuý Diễm");
        stringMap.put(100, "Trần Thị Thuý Diễm");
        stringMap.put(10000, "Trần Thị Thuý Diễm");
        stringMap.put(-500, "Trần Thị Thuý Diễm");
        stringMap.put(50, "Trần Thị Thuý Diễm");
        stringMap.put(-60, "Trần Thị Thuý Diễm");
        stringMap.put(40, "Trần Thị Thuý Diễm");
        stringMap.put(1, "Trần Thị Thuý Diễm");

//        System.out.println(stringMap);
        Set<Integer> integerSet = stringMap.keySet();
        for (Integer key : integerSet) {
            System.out.printf("%s - %s\n", key, stringMap.get(key));
        }
    }
}
