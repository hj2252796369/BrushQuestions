package com.demo.niuke;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: JavaDemo
 * @ClassName 字符个数统计
 * @description:
 * @author: huJie
 * @create: 2022-03-23 16:00
 **/
public class 字符个数统计 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<String, Integer> hashMap = new HashMap();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!hashMap.containsKey(chars[i])){
                hashMap.put(chars[i]+"", 1);
            }
        }
        System.out.println(hashMap.size());
    }
}
