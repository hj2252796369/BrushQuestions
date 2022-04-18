package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: BrushQuestions
 * @ClassName Q_4_寻找两个正序数组的中位数
 * @description:
 * @author: huJie
 * @create: 2022-04-18 21:17
 **/
public class Q_0004_寻找两个正序数组的中位数 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};

        int[] nums2 = {3, 4};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;

        int aLength = 0;
        int bLength = 0;
        if (nums1.length >= nums2.length) {
            aLength = nums1.length;
            bLength = nums2.length;
        } else {
            aLength = nums2.length;
            bLength = nums1.length;
        }

        int midLeft = 0;
        int midRight = 0;

        int rightNum = 0;
        int leftNum = 0;

        if (((aLength % 2) + (bLength % 2)) % 2 == 0) {
            // 偶数
            midRight = bLength + (aLength - bLength) / 2;
            midLeft = (bLength + (aLength - bLength) / 2) -1;
        } else {
            // 奇数个
            midLeft = bLength + (aLength - bLength) / 2;
            midRight = bLength + (aLength - bLength) / 2;
        }


        List<Integer> list = new ArrayList<>();
        int listIndex = 0;

        for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
            if(i != nums1.length && j != nums2.length){


                if (nums1[i] > nums2[j]) {
                    list.add(nums2[j]);
                    if (j < nums2.length-1) {
                        j++;
                    } else {
                        i++;
                    }
                } else {
                    list.add(nums1[i]);
                    if (i < nums1.length-1) {
                        i++;
                    } else {
                        j++;
                    }
                }

            }
            if( i == nums1.length){
                list.add(nums2[j]);
                j++;
            }
            if( j == nums2.length){
                list.add(nums1[i]);
                i++;
            }

            listIndex ++;

            if((i + j-1) == midLeft){
                leftNum = list.get(listIndex-1);
            }

            if((i + j-1) == midRight){
                rightNum = list.get(listIndex-1);
                break;
            }
        }

        return (leftNum + rightNum) / 2;
    }
}
