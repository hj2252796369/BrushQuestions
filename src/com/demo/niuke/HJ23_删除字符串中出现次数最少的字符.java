package com.demo.niuke;

import java.util.*;

/**
 * https://www.nowcoder.com/practice/05182d328eb848dda7fdd5e029a56da9?tpId=37&tqId=21246&rp=1&ru=/ta/huawei&qru=/ta/huawei&difficulty=&judgeStatus=&tags=/question-ranking
 *
 * @program: BrushQuestions
 * @ClassName HJ23_删除字符串中出现次数最少的字符
 * @description:
 * @author: huJie
 * @create: 2022-03-24 14:02
 **/
public class HJ23_删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> hashmap = new HashMap();
        for (int i = 0; i < chars.length; i++) {
            if (hashmap.containsKey(chars[i])) {
                hashmap.put(chars[i], (hashmap.get(chars[i]) + 1));
            } else {
                hashmap.put(chars[i], 1);
            }
        }
        Integer min = Integer.MAX_VALUE;

        Iterator<Character> iterator = hashmap.keySet().iterator();
        while (iterator.hasNext()) {
            Character next = iterator.next();
            Integer integer = hashmap.get(next);
            if (integer <= min) {
                min = integer;
            }
        }

        iterator = hashmap.keySet().iterator();
        while (iterator.hasNext()) {
            Character next = iterator.next();
            Integer integer = hashmap.get(next);
            if (integer.equals(min)) {
                s = s.replace(next + "", "");
            }
        }

        System.out.println(s);
    }
}
