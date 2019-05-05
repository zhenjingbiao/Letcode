package practice;

//题目：
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
//n<=39
public class CodeInstance08 {

    public static void main(String[] args) {
        int i = 7;
        System.out.println(printN2(i));
    }
    //非递归
    private static int printN2(int n) {
        int x = 1, y = 2, z = 1;
        if (n < 3) return n;
       /* while (n >= 2) {
            z = x + y;
            x = y;
            y = z;
            n--;
        }*/
        for (int i = 3; i <=n; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.println("printN2输出-----"+z);
        }
        return z;
    }


}
