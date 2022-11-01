package ss11_stack_queue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(10);
        list.add("10");
        list.add(10.0);

        //Tính tổng
        double total = 0;
        for (Object item : list) {
            if (item instanceof String) {
                total += Double.parseDouble((String) item);
            } else if (item instanceof Integer) {
                total += (Integer) item;
            } else if (item instanceof Double) {
                total += (Double) item;
            }
        }
    }
}
