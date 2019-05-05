package practice;//题目：
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠
// 地覆盖一个2*n的大矩形，总共有多少种方法？

public class CodeInstance10 {

    public static void main(String[] args) {

        System.out.println(RectCover(5));
    }
    public static int RectCover(int target) {
        //思路：如果第一个矩形横着放，则还有f(n-2)，如果第一个矩形竖着放则还有f(n-1)，所以f(n)=f(n-1)+f(n-2);
        int x=1,y=2,z=3;
        if(target<3)return target;
        for (int i = 3; i <=target; i++) {
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }


}
