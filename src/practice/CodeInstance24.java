package practice;//
//输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下
// 一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)

import java.util.Stack;

public class CodeInstance24 {

    public static void main(String[] args) {
        CodeInstance24 instance21=new CodeInstance24();
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
