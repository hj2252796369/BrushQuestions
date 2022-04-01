package com.demo.niuke;

import java.util.*;

/**
 * https://www.nowcoder.com/practice/f9a4c19050fc477e9e27eb75f3bfd49c?tpId=37&tags=&title=&difficulty=&judgeStatus=&rp=1&gioEnter=menu
 *
 * @program: BrushQuestions
 * @ClassName HJ41_称砝码
 * @description:
 * @author: huJie
 * @create: 2022-04-01 13:44
 **/
public class HJ41_称砝码 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());

        int[] faMaWeight = new int[num];
        int[] faMaNum = new int[num];

        for (int i = 0; i < num; i++) {
            faMaWeight[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            faMaNum[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        set.add(0);

        for (int i = 0; i < num; i++) {
            int w = faMaWeight[i];
            int n = faMaNum[i];
            for (int j = 0; j < n; j++) {
                Set<Integer> temp = new HashSet<>(set);
                for (Integer tem: temp) {
                    set.add(tem + w);
                }

            }

        }

        System.out.println(set.size());
    }
}
