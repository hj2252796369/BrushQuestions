package com.demo.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: JavaDemo
 * @ClassName 进制转换
 * @description:
 * @author: huJie
 * @create: 2022-03-23 14:36
 **/
public class 进制转换 {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap();
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int result = 0;
        int minM = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >=2 ; i--) {

            if(map.containsKey(chars[i])){
                Integer o = map.get(chars[i]);
                int i1 = (int) (o * Math.pow(16, minM));
                result += i1;
            }else{
                int i1 =(int) ( Integer.parseInt(chars[i]+"") * Math.pow(16, minM));
                result += i1;
            }
            minM++;
        }
        System.out.println(result);
    }
}
