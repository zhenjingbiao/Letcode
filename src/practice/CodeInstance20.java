package practice;//
//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。

import java.util.Stack;

public class CodeInstance20 {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    private Integer temp;

    public static void main(String[] args) {
        CodeInstance20 instance20=new CodeInstance20();
        instance20.push(2);
        instance20.push(-4);
        instance20.push(4);
        instance20.push(0);
        instance20.push(1);
        System.out.println(instance20.top());
        System.out.println(instance20.min());

    }

    public void push(int node) {
        if (temp != null) {
            if (temp > node) {
                minStack.push(node);
                temp = node;
            }
            dataStack.push(node);
        } else {
            dataStack.push(node);
            minStack.push(node);
            temp = node;
        }

    }

    public void pop() {
        int popData = dataStack.pop();
        int minData = minStack.pop();
        if (popData != minData) {
            minStack.push(minData);
        }

    }

    public int top() {
        return dataStack.peek();

    }

    public int min() {
        return minStack.peek();

    }
}
