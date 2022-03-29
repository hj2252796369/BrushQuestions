package com.demo.leetcode;

/**
 * https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 * @program: BrushQuestions
 * @ClassName Q_1614_括号的最大嵌套深度
 * @description:
 * @author: huJie
 * @create: 2022-03-29 09:39
 **/
public class Q_1614_括号的最大嵌套深度 {
    public static void main(String[] args) {

        String str = "(1)+((2))+(((3)))";
        int maxDepth = maxDepth(str);
        System.out.println(maxDepth);
    }


    public static int maxDepth(String s) {
        int nowDepth = 0;
        int maxDepth=0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if('(' == aChar){
                nowDepth =nowDepth+1;
                if(nowDepth >= maxDepth){
                    maxDepth = nowDepth;
                }
            }
            if(')' == aChar){
                nowDepth--;
            }
        }
        return maxDepth;
    }

}
