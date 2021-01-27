package com.teahel.easy;

/**
 * @version 1.0
 * @author： L.T.J
 * @date： 2021-01-27
 *
 *  给定一个矩阵 A， 返回 A 的转置矩阵。
 *
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 *
 * 类别数组
 *
 *
 */

public class easy_867 {

    public static void main(String args []){
        int a[][] ={{1,2,3},{4,5,6}};
        int b = a.length;
        int c = a[0].length;
        int d[][] = new int[c][b];
        for( int i =0 ;i<b;i++ ){
            for (int j= 0;j<c ;j++){
                d[j][i] = a[i][j];
            }
        }
        System.out.println(d);
    }

}
