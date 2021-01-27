package com.teahel.easy;

/**
 * 977. 有序数组的平方
 * @version 1.0
 * @author： L.T.J
 * @date： 2021-01-27
 *
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 * 数组类别
 *
 */

public class easy_977 {

    public static void main(String args[]){

        int nums[] = {-4,-1,0,3,10};

        for (int i =0;i<nums.length;i++){
            nums [i] = nums[i]*nums[i];
        }

        for(int i=0; i<nums.length ;i++){
            for ( int j = 1 ;j <nums.length - i;j++){
                 if( nums [j-1] > nums[j]){
                     int temp = 0 ;
                     temp = nums [j-1];
                     nums [j-1] = nums[j];
                     nums[j] = temp;
                 }
            }
        }
        System.out.println();


    }

}
