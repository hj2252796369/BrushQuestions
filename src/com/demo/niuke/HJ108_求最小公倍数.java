package com.demo.niuke;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.nowcoder.com/practice/22948c2cad484e0291350abad86136c3?tpId=37&tags=&title=HJ108&difficulty=&judgeStatus=&rp=1&gioEnter=menu&sourceUrl=
 *
 * @program: BrushQuestions
 * @ClassName HJ108_求最小公倍数
 * @description:
 * @author: huJie
 * @create: 2022-04-01 15:27
 **/
public class HJ108_求最小公倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        List<Integer> collect = Arrays.stream(nextLine.split(" ")).map(info -> Integer.valueOf(info)).collect(Collectors.toList());

        int a = collect.get(0) < collect.get(1)?collect.get(1):collect.get(0);
        int b = collect.get(0) < collect.get(1)?collect.get(0):collect.get(1);

        if (a % b == 0) {
            System.out.println(a);
            return;
        } else if (b % a == 0) {
            System.out.println(b);
            return;
        }



        int result =(a*b)/dfs(a,b);
        System.out.println(result);

    }

    private static int dfs(int a, int b) {
        return b==0?a:dfs(b, a%b);
    }
}
