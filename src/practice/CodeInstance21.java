package practice;//
//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
// 例如序列1,2,3,4,5是某栈的压入顺序，
// 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

import java.util.Stack;

public class CodeInstance21 {

    public static void main(String[] args) {
        CodeInstance21 instance21=new CodeInstance21();
        int []a={1,2,3,4,5};
        int []b={5,4,3,2,1};
        System.out.println(instance21.isPopList(a,b));


    }

    private boolean isPopList(int[] push, int[] pop) {
        if (pop.length == 0 || push.length != pop.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i : push) {
            stack.push(i);
            while (!stack.empty() && stack.peek() == pop[index]) {
                stack.pop();
                index++;
            }
        }

        return stack.empty();
    }


}
