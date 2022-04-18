package com.demo.leetcode;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * @program: BrushQuestions
 * @ClassName Q_35_搜索插入位置
 * @description:
 * @author: huJie
 * @create: 2022-03-31 22:05
 **/
public class Q_0035_搜索插入位置 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 3;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {

        int mid = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;

        int result = -1;

        while (left <= right) {
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }

        result = result == -1 ? left : result;

        return result;
    }
}
