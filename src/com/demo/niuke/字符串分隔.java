package com.demo.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: LeetCode
 * @ClassName 字符串分隔
 * @description:
 * @author: huJie
 * @create: 2022-03-23 08:50
 **/
public class 字符串分隔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> list = new ArrayList();

        char[] chars = s.toCharArray();
        int mod = chars.length % 8;


        int index = 0;
        String str = "";
        for (int i = 0; i <= chars.length + (8 - mod); i++) {
            if (index < 8 && i >= chars.length) {
                str += "0";
                index++;
                continue;
            }

            if (index == 8 && i >= chars.length) {
                list.add(str);
                break;
            }

            if (index == 8) {
                list.add(str);
                index = 0;
                str = "";
            }

            str += chars[i];
            index++;
        }
        for (String s1 : list) {
            System.out.println(s1);
        }

    }
}
