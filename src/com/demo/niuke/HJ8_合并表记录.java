package com.demo.niuke;

import java.util.*;

/**
 * https://www.nowcoder.com/practice/de044e89123f4a7482bd2b214a685201?tpId=37&tqId=21231&rp=1&ru=/ta/huawei&qru=/ta/huawei&difficulty=&judgeStatus=&tags=/question-ranking
 *
 * @program: BrushQuestions
 * @ClassName HJ8_合并表记录
 * @description:
 * @author: huJie
 * @create: 2022-03-24 17:51
 **/
public class HJ8_合并表记录 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Integer sum = Integer.valueOf(s);
        Map<Integer, Integer> map = new TreeMap<>();


        while (sum > 0) {
            String oneLine = scanner.nextLine();
            String[] split = oneLine.split(" ");
            int key = Integer.valueOf(split[0]);
            int value = Integer.valueOf(split[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
            sum--;
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next +" " + map.get(next));
        }

    }
}
