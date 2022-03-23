package com.demo.niuke;

import java.util.HashMap;

/**
 * @program: JavaDemo
 * @ClassName 两数之和
 * @description:
 * @author: huJie
 * @create: 2022-03-23 15:02
 **/
public class 两数之和 {
    public static void main(String[] args) {
int[] numbers = {3,2,4};
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
                return new int[]{hashMap.get(temp) + 1, i + 1};
            }
        }
        return new int[]{};
    }

}
