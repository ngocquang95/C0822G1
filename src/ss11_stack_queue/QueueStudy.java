package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.peek());
    }
}
