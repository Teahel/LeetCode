package com.teahel.easy;

/**
 * TODO  该题目使用stack,预留以后做。
 *
 * @version 1.0
 * @author： L.T.J
 * @date： 2021-01-27
 *
 *  ##题目
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * ##总结：
 *
 */

public class easy_20 {
    public static void main(String args[]){
        String s = "()";
        /*"([)]"*/
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        char a[] = s.toCharArray();
        int j = 0;
        int k = 0;
        int l = 0;

        for(int i=0;i<a.length;i++){

            if(a[i] == '{'){
                j++;
            }

            if(a[i] == '['){
                k++;
            }

            if(a[i] == '('){
                l++;
            }

            if(a[i] == '}'){
                j--;
            }

            if(a[i] == ']'){
                k--;
            }

            if(a[i] == ')'){
                l--;
            }

        }

        if(j != 0 || k != 0 || l != 0){
            return false;
        }

        return true;

    }



}
