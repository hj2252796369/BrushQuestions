package com.demo.other;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @program: BrushQuestions
 * @ClassName Demo02
 * @description:
 * @author: huJie
 * @create: 2022-04-03 10:33
 **/
public class Demo02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer integer = Integer.valueOf(scanner.nextLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < integer; i++) {
            int num = scanner.nextInt();
            set.add(num);
        }

        List<Integer> collect = set.stream().sorted().collect(Collectors.toList());
        for (Integer n: collect
             ) {
            System.out.println(n);
        }

    }
}
