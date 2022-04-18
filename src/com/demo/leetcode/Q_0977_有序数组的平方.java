package com.demo.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 *
 * @program: BrushQuestions
 * @ClassName Q_977_有序数组的平方
 * @description:
 * @author: huJie
 * @create: 2022-04-01 16:48
 **/
public class Q_0977_有序数组的平方 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ints = sortedSquares(nums);
        System.out.println(ints);
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;

    }

}
