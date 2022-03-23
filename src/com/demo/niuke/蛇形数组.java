package com.demo.niuke;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @program: JavaDemo
 * @ClassName 蛇形数组
 * @description:
 * @author: huJie
 * @create: 2022-03-23 17:15
 **/
public class 蛇形数组 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(";");

        Set set = new HashSet();
        set.add("A");
        set.add("S");
        set.add("W");
        set.add("D");

        int l = 0;
        int w = 0;

        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            try {
                int number = Integer.parseInt(s1.substring(1, s1.length()));
                if (number >=0 && number <100){
                    if("A".equals(s1.substring(0, 1))){
                        w -= number;
                    }
                    if("D".equals(s1.substring(0, 1))){
                        w += number;
                    }
                    if("W".equals(s1.substring(0, 1))){
                        l += number;
                    }
                    if("S".equals(s1.substring(0, 1))){
                        l -= number;
                    }
                }
            } catch (Exception e) {
            }
        }

        System.out.println(w+","+l);
    }
}
