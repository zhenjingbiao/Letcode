package practice;//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class CodeInstance13 {

    public static void main(String[] args) {

        int []a={5,3,2,4,8,0,1,5,6};
        int []b=reOrderArr(a);
        for (int i : b) {
            System.out.println(i);
        }

    }

    public static int[] reOrderArr(int []a) {
        int oddCount=0;
        for (int i = 0; i < a.length; i++) {
            if((a[i]&1)==1){
                //奇数
                ++oddCount;
            }
        }
        int b[]=new int[a.length];
        int oddCurCount=0;
        int evenCurCount=0;
        for (int i = 0; i < a.length; i++) {
            if((a[i]&1)==1){
                //奇数
                b[oddCurCount]=a[i];
                oddCurCount++;
            }else {
                b[oddCount+evenCurCount]=a[i];
                evenCurCount++;
            }
        }
        return b;


    }


}
