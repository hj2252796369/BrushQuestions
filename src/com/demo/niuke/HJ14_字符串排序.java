package com.demo.niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: BrushQuestions
 * @ClassName HJ14_字符串排序
 * @description:
 * @author: huJie
 * @create: 2022-03-25 08:56
 **/
public class HJ14_字符串排序 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.valueOf(s);

        String[] strs = new String[num];
        for (int i = 0; i < num; i++) {
            String line = scanner.nextLine();
            strs[i] = line;
        }
        Arrays.sort(strs);
        for (String str : strs) {
            System.out.println(str);
        }

    }
}
