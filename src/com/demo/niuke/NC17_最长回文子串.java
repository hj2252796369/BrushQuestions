package com.demo.niuke;

/**
 * https://www.nowcoder.com/practice/b4525d1d84934cf280439aeecc36f4af?tpId=196&rp=1&ru=%2Fexam%2Foj&qru=%2Fexam%2Foj&sourceUrl=%2Fexam%2Foj%3Ftab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196&difficulty=&judgeStatus=&tags=&title=&gioEnter=menu
 *
 * @program: BrushQuestions
 * @ClassName NC17_最长回文子串
 * @description:
 * @author: huJie
 * @create: 2022-03-29 15:41
 **/
public class NC17_最长回文子串 {
    public static void main(String[] args) {
        String str = "ccbcabaabba";
        int longestPalindrome = getLongestPalindrome(str);
        System.out.println(longestPalindrome);
    }


    public static int getLongestPalindrome(String A) {
        if (A.length() == 1) {
            return 1;
        }

        // write code here
        char[] chars = A.toCharArray();
        int result = 0;

        for (int i = 0; i < chars.length; i++) {


            int left = 1;
            int right = 1;
            int index = 0;
            int width = 0;

            while (i - index >= 0 && i + 1 + index < chars.length && chars[i - index] == chars[i + 1 + index]) {
                index++;
                width += 2;
            }

            result = Math.max(result, width);
            width = 1;

            while (i - left >= 0 && i + right < chars.length && chars[i - left] == chars[i + right]) {
                left++;
                right++;
                width += 2;
            }

            result = Math.max(result, width);


        }

        return result;

    }


}
