package com.demo.leetcode;

/**
 * @program: BrushQuestions
 * @ClassName Q_31_下一个排列
 * @description:
 * @author: huJie
 * @create: 2022-03-29 14:53
 **/
public class Q_0031_下一个排列 {
    public static void main(String[] args) {

        int[] num = {1,3,5,4,7};
        int lengthOfLCIS = findLengthOfLCIS(num);
        System.out.println(lengthOfLCIS);
    }

    public static int findLengthOfLCIS(int[] nums) {

        int max = 1;
        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                length++;
            } else{
                length = 1;
            }
            max = Math.max(max, length);

        }

        return max;
    }

}
