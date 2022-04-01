package com.demo.niuke;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.nowcoder.com/practice/b56799ebfd684fb394bd315e89324fb4?tpId=196&rp=1&ru=%2Fexam%2Foj&qru=%2Fexam%2Foj&sourceUrl=%2Fexam%2Foj%3Ftab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196%26page%3D1%26search%3Dnc28&difficulty=&judgeStatus=&tags=5054&title=&gioEnter=menu
 *
 * @program: BrushQuestions
 * @ClassName NC41_最长无重复子数组
 * @description:
 * @author: huJie
 * @create: 2022-03-31 17:04
 **/
public class NC41_最长无重复子数组 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,8,99,3};
        maxLength(arr);
    }

    /**
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxLength(int[] arr) {
        // write code here
        int left = 0;
        int right = 0;

        Set<Integer> set = new HashSet<Integer>();

        int maxLength = 0;

        while (right < arr.length) {
            int indexArr = arr[right];
            if (set.contains(indexArr)) {
                set.remove(indexArr);
                left++;
            } else {
                set.add(indexArr);
                right++;
            }
            maxLength = Math.max(set.size(), maxLength);
        }



        System.out.println(maxLength);
        return maxLength;
    }
}
