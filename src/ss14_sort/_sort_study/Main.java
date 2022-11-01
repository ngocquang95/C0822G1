package ss14_sort._sort_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, -3, -4, 5, 100, -920);

        Collections.sort(list, Collections.reverseOrder());

        list = list.stream().sorted().collect(Collectors.toList());
        list = list.stream().map(item -> item = item * 2).collect(Collectors.toList());

        System.out.println(list);
    }
}
