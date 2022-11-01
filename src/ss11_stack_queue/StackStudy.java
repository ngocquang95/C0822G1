package ss11_stack_queue;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);

//        //Con trai mà không có sự nghiệp con gái chơi xong nó pop()
//        System.out.println(stack);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//        System.out.println(stack);

        int n = 2001;

        while (n > 0) {
            stack.push(n % 2); // push phần dư vào
            n /= 2; // n = n / 2
        }

//        System.out.println(stack.get(0));
//        System.out.println(stack.get(5));

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
