package com.demo.niuke;

import java.util.*;

/**
 * https://www.nowcoder.com/practice/c466d480d20c4c7c9d322d12ca7955ac?tpId=196&tqId=37066&rp=1&ru=/exam/oj&qru=/exam/oj&sourceUrl=%2Fexam%2Foj%3Ftab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196%26page%3D1%26search%3Dnc28&difficulty=undefined&judgeStatus=undefined&tags=&title=nc28
 *
 * @program: BrushQuestions
 * @ClassName NC28_最小覆盖子串
 * @description:
 * @author: huJie
 * @create: 2022-03-31 13:53
 **/
public class NC28_最小覆盖子串 {
    public static void main(String[] args) {
        String S = "BBaa";
        String T = "aa";
        String s = minWindow(S, T);
        System.out.println(s);

    }


    /**
     * @param S string字符串
     * @param T string字符串
     * @return string字符串
     */
    public static String minWindow(String S, String T) {
        if(S.equals(T)){
            return S;
        }

        // write code here
        char[] chars = S.toCharArray();

        int sStartIndex = 0;
        int sEndIndex = 0;

        Map<Character, Integer> tHasItemMap = new HashMap();
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (tHasItemMap.containsKey(c)) {
                tHasItemMap.put(c, tHasItemMap.get(c) + 1);
            } else {
                tHasItemMap.put(c, 1);
            }
        }

        int minLen = S.length()-1;
        int begin = 0;

        Map<Character, Integer> winMap = new HashMap<>();
        int winLength = 0;
        while (sEndIndex < chars.length) {
            char aChar = chars[sEndIndex];

            if (winMap.containsKey(aChar)) {
                winMap.put(aChar, winMap.get(aChar) + 1);
            } else {
                winMap.put(aChar, 1);
            }

            if (tHasItemMap.containsKey(aChar) && tHasItemMap.get(aChar) >= winMap.get(aChar)) {
                winLength++;
            }


            while (winLength == T.length()) {
                if (sEndIndex - sStartIndex < minLen) {
                    minLen = sEndIndex - sStartIndex;
                    begin = sStartIndex;
                }

                char aChar1 = chars[sStartIndex];

                if (tHasItemMap.containsKey(aChar1) && ( tHasItemMap.get(aChar1) >= winMap.get(aChar1))) {
                    winLength--;
                }

                winMap.put(chars[sStartIndex], winMap.get(chars[sStartIndex])-1);


                sStartIndex++;
            }
            sEndIndex++;

        }
        if(minLen == sStartIndex+1 || minLen == sStartIndex){
            return "";
        }
        String substring = S.substring(begin, begin + minLen+1);
        return substring;

    }

}
