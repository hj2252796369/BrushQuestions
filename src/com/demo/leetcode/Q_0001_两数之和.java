package com.demo.leetcode;

import java.util.HashMap;

/**
 * @program: BrushQuestions
 * @ClassName Q_01_两数之和
 * @description:
 * @author: huJie
 * @create: 2022-04-18 21:15
 **/
public class Q_0001_两数之和 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(numbers, target);
    }


    /**
     * @param numbers int整型一维数组
     * @param target  int整型
     * @return int整型一维数组
     */
    public static int[] twoSum(int[] numbers, int target) {
        // write code here
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (!hashMap.containsKey(temp)) {
                hashMap.put(numbers[i], i);
            } else {
                return new int[]{hashMap.get(temp), i};
            }
        }
        return new int[]{};
    }

}
