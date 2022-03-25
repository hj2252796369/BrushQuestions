package com.demo.niuke;

import java.util.*;

/**
 * https://www.nowcoder.com/practice/03ba8aeeef73400ca7a37a5f3370fe68?tpId=37&rp=1&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei&difficulty=&judgeStatus=&tags=&title=&sourceUrl=&gioEnter=menu
 *
 * @program: BrushQuestions
 * @ClassName HJ27_查找兄弟单词
 * @description:
 * @author: huJie
 * @create: 2022-03-25 13:41
 **/
public class HJ27_查找兄弟单词 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int num = Integer.valueOf(split[0]);

        int findIdex = Integer.valueOf(split[split.length - 1]);
        String matchWord = split[split.length - 2];

        char[] chars = matchWord.toCharArray();
        Map<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], (Integer) hashMap.get(chars[i]) + 1);
            } else {
                hashMap.put(chars[i], 1);
            }
        }

        List resultList = new ArrayList();
        for (int i = 1; i < split.length - 2; i++) {
            boolean flag = match(split[i], hashMap, matchWord);
            if (flag) {
                resultList.add(split[i]);
            }
        }

        Collections.sort(resultList);
        System.out.println(resultList.size());
        if(resultList.size() >= findIdex){
            System.out.println(resultList.get(findIdex - 1));
        }


    }

    private static boolean match(String s, Map matchMap, String matchWord) {
        if (s.length() != matchWord.length()) {
            return false;
        }

        if (s.equals(matchWord)) {
            return false;
        }

        Map<Character, Integer> needMatchMap = new HashMap();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (needMatchMap.containsKey(chars[i])) {
                needMatchMap.put(chars[i], needMatchMap.get(chars[i]) + 1);
            } else {
                needMatchMap.put(chars[i], 1);
            }
        }

        Iterator iterator = needMatchMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

            if (!matchMap.containsKey(next)) {
                return false;
            }else{
                if(needMatchMap.get(next) != matchMap.get(next)){
                    return false;
                }
            }
        }

        return true;

    }
}
