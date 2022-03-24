package com.demo.niuke;

import java.util.Scanner;

/**
 * @program: BrushQuestions
 * @ClassName HJ106_字符逆序
 * @description:
 * @author: huJie
 * @create: 2022-03-24 17:42
 **/
public class HJ106_字符逆序 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());

    }
}
