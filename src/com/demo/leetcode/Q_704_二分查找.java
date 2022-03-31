package com.demo.leetcode;

/**
 * https://leetcode-cn.com/problems/binary-search/
 *
 * @program: BrushQuestions
 * @ClassName Q_704_二分查找
 * @description:
 * @author: huJie
 * @create: 2022-03-31 21:34
 **/
public class Q_704_二分查找 {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -1;
        int search = search(nums, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int result = -1;

        int kid = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[kid] > target) {
                right = kid -1;
            } else if(nums[kid] < target){
                left = kid + 1;
            }else{
                result = kid;
                break;
            }
            kid = (left + right) / 2;
        }

        return result;
    }
}
