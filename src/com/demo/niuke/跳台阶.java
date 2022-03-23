package com.demo.niuke;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: JavaDemo
 * @ClassName 跳台阶
 * @description:
 * @author: huJie
 * @create: 2022-03-23 16:11
 **/
public class 跳台阶 {
    private static Map<Integer, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {

        int target = 7;

        int i = jumpFloor(target);
        System.out.println(i);
    }


    public static int jumpFloor(int target) {
//        if (target == 0 || target == 1) {
//            return 1;
//        }
//        if(hashMap.containsKey(target)){
//            return hashMap.get(target);
//        }
//        int i = jumpFloor(target - 1) + jumpFloor(target - 2);
//        hashMap.put(target, i);
//        return i;

        if (target <= 1) return 1;
        int towbefore = 1;
        int oneBefore = 1;
        for (int i = 2; i <= target; i++) {
            int temp = towbefore + oneBefore;
            oneBefore = towbefore;
            towbefore = temp;
        }
        return towbefore;
    }
}
