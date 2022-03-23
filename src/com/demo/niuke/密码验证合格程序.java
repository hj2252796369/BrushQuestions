package com.demo.niuke;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @program: JavaDemo
 * @ClassName 密码验证合格程序
 * @description:
 * @author: huJie
 * @create: 2022-03-23 17:47
 **/
public class 密码验证合格程序 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();

            if (!checkParam(s)) {
                System.out.println("NG");
                continue;
            }

            if (checkSubStr(s, 0, 3)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }

    }

    private static boolean checkSubStr(String s, int l, int r) {
        if (r > s.length()) {
            return true;
        }

        if (s.substring(r).contains(s.substring(l, r))) {
            return false;
        } else {
            return checkSubStr(s, l + 1, r + 1);
        }
    }

    private static boolean checkParam(String s) {
        if (s.length() <= 8) {
            return false;
        }

        int count = 0;
        Pattern p1 = Pattern.compile("[A-Z]");
        if (p1.matcher(s).find()) {
            count++;
        }

        Pattern p2 = Pattern.compile("[a-z]");
        if (p2.matcher(s).find()) {
            count++;
        }

        Pattern p3 = Pattern.compile("[0-9]");
        if (p3.matcher(s).find()) {
            count++;
        }

        Pattern p4 = Pattern.compile("[^a-zA-Z0-9]");
        if (p4.matcher(s).find()) {
            count++;
        }

        if (count < 3) {
            return false;
        }

        return true;

    }
}
