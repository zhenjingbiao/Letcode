package practice;//
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

import java.util.ArrayList;

public class CodeInstance19 {

    public static void main(String[] args) {

        int [][]a={{1,2, 3 ,4},{5 ,6, 7, 8},{9, 10, 11, 12},{13 ,14, 15, 16}};
        printMatrix(a);


    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
       int r=matrix.length;//行
       int c=matrix[0].length;//列
       int layer=(Math.min(r,c)-1)/2+1;
       for (int i=0;i<layer;i++){
           for(int m=i;m<c-i;++m){
               System.out.println(matrix[i][m]);//从左到右
           }
           for(int n=i+1;n<r-i;++n){
               System.out.println(matrix[n][c-i-1]);//从上到下
           }
           for(int p=c-i-2;p>=i;p--){
               System.out.println(matrix[r-i-1][p]);//从右到左
           }

           for (int q=c-i-2;q>i;--q){
               System.out.println(matrix[q][i]);//从下到上
           }
       }



        return null;
    }


}
