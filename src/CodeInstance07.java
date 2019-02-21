//题目：
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
public class CodeInstance07 {

    public static void main(String[] args) {
        int i = 7;
        System.out.println(printN1(i));
        System.out.println(printN2(i));
    }

    /*递归方法*/
    private static int printN1(int n) {
        if (n < 2) {
            return n;
        } else if (n == 2) {
            return 1;
        } else {
            System.out.println("printN1输出-----"+n);
            return printN1(n - 2) + printN1(n - 1);
        }
    }

    //非递归
    private static int printN2(int n) {
        int x = 0, y = 1, z = 1;
        if (n < 2) return n;
       /* while (n >= 2) {
            z = x + y;
            x = y;
            y = z;
            n--;
        }*/
        for (int i = 2; i <=n; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.println("printN2输出-----"+z);
        }
        return z;
    }

}
