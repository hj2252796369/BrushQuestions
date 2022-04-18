package com.demo.leetcode;

/**
 * @program: BrushQuestions
 * @ClassName Q_278_第一个错误的版本
 * @description:
 * @author: huJie
 * @create: 2022-03-31 21:45
 **/
public class Q_0278_第一个错误的版本 {
    public static void main(String[] args) {
        int i = firstBadVersion(4);
    }

    public static int firstBadVersion(int n) {

        int k = n / 2;
        int left = 0;
        int right = n - 1;

        boolean lastVersion;
        boolean nowVersion;

        while (left <= right) {
            if (isBadVersion(k)) {
                right = k - 1;
            } else {
                left = k + 1;
            }
            k = left + (right - left) / 2;
        }
        return left;
    }

    private static boolean isBadVersion(int k) {

        return true;
    }

}
