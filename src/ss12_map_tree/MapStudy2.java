package ss12_map_tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy2 {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap<>();

        stringMap.put("Hoàng Anh Thắng", 1);
        stringMap.put("Hoàng Anh Thắng 2", 2);
        stringMap.put("Trần Thị Thuý Diễm", 3);


        Set<String> integerSet = stringMap.keySet();
        for (String key : integerSet) {
            System.out.printf("%s - %s\n", key, stringMap.get(key));
//            System.out.println(stringMap.get(key));
        }
    }
}
