package com.demo.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: BrushQuestions
 * @ClassName Demo03
 * @description:
 * @author: huJie
 * @create: 2022-04-03 10:37
 **/
public class Demo03 {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);


        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        char[] chars = nextLine.toCharArray();
        int result = 0;
        int minM = 0;
        for (int i = chars.length - 1; i > 1; i--) {
            char aChar = chars[i];
            if (map.containsKey(aChar)) {
                Integer integer = map.get(aChar);
                result = result + (int) (integer * Math.pow(16, minM));
            } else {
                Integer integer = Integer.parseInt(""+aChar);
                result = result + (int) (integer * Math.pow(16, minM));
            }
            minM++;
        }

        System.out.println(result);

    }
}
