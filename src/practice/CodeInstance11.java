package practice;//题目：
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠
// 地覆盖一个2*n的大矩形，总共有多少种方法？

public class CodeInstance11 {

    public static void main(String[] args) {

        System.out.println(numberOf1(5));
        System.out.println(numberOf12(5));
        System.out.println(numberOf13(5));
    }
//方法一
    public static int numberOf1(int n) {
        int count=0;
        int flag=1;
        while(flag!=0){
            if((flag&n)!=0){
                count++;
            }
            flag=flag<<1;
        }
        return count;

    }
    public static int numberOf12(int n){
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

    public static int numberOf13(int n) {
        int a = 0;
        for(int i = 0;i<32;i++){
            if((n&(1<<i))==(1<<i)){
                a++;
            }
        }
        return a;
    }
    //相关题目：判断一个数是不是二的整数次方 ？
    //两个整数m,n，需要改变m的二进制表示中的多少位才能得到n

}
