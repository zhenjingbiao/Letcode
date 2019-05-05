package practice;//
//输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
//输入描述:
//输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。

import java.util.Stack;

public class CodeInstance27 {

    public static void main(String[] args) {
        CodeInstance27 instance21=new CodeInstance27();
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
