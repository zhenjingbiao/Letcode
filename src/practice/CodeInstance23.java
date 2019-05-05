package practice;//
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

import java.util.Stack;

public class CodeInstance23 {

    public static void main(String[] args) {
        CodeInstance23 instance21=new CodeInstance23();
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
