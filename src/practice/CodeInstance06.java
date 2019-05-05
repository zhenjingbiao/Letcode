package practice;

//题目：
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
// 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
public class CodeInstance06 {

    public static void main(String[] args) {
        int a[] = {3, 4, 5, 1, 2};
        printMin(a);
        printMin2(a);
    }

    private static int printMin(int a[]) {
        if (a == null || a.length < 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println(a[i + 1]);
                return a[i + 1];
            }
        }
        return 0;

    }

    //二分查找法
    private static int printMin2(int a[]) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;//防止left+right过大
            if (a[mid] > a[left]) {
                left = mid + 1;
            } else if (a[mid] == a[right]) {
                right--;
            } else {
                right = mid;
            }

        }
        System.out.println(a[left]);
        return a[left];

    }


}
