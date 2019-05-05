package practice;//
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

import java.util.Stack;

public class CodeInstance26 {

    public static void main(String[] args) {
        CodeInstance26 instance21=new CodeInstance26();
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
