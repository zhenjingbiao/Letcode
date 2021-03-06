package practice;

//题目：在二维数组中查询是否包含此数，二维数组从左到右递增，从上到下递增
public class CodeInstance01 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        boolean isContain = isContainObj(a, 8);//O(m+n)m行n列
        boolean isContain2 = isContainNum(a, 8);//O(mlog2n)
        System.out.println(isContain+""+isContain2);

    }

    public static boolean isContainObj(int[][] a, int target) {
        int r = 0, c = a[0].length - 1;
        while (r <= a.length - 1 && c >= 0) {
            if (a[r][c] > target) {
                c--;
            } else if (a[r][c] == target) {
                return true;
            } else {
                r++;
            }
        }
        return false;
    }
    public static boolean isContainNum(int [][]a,int target){
        for (int i=0;i<a.length;i++){
            int left=0,right=a[i].length-1;
            while (left<=right){
                int mid=(left+right)>>1;
                if(a[i][mid]>target){
                    right=mid-1;
                }else if(a[i][mid]<target){
                    left=mid+1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

}
