import java.util.Stack;

//题目：
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class CodeInstance05 {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int i : a) {
            push(i);
        }
        for (int i : a) {
            pop();
        }
    }

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int popValue = stack2.pop();
        System.out.println(popValue);
        return popValue;
    }


}
