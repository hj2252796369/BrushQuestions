package com.demo.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/practice/b9eae162e02f4f928eac37d7699b352e?tpId=37&tags=&title=HJ28&difficulty=&judgeStatus=&rp=1&gioEnter=menu&sourceUrl=
 *
 * @program: BrushQuestions
 * @ClassName HJ28_素数伴侣
 * @description:
 * @author: huJie
 * @create: 2022-04-01 16:14
 **/
public class HJ28_素数伴侣 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        Integer integer = Integer.valueOf(nextLine);


        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < integer; i++) {
            int i1 = scanner.nextInt();
            if (i1 % 2 == 0) {
                even.add(i1);
            } else {
                odd.add(i1);
            }
        }


        // 偶数是否匹配上
        int[] evenMaths = new int[even.size()];
        // 已匹配的数量
        int count = 0;
        for (int i = 0; i < odd.size(); i++) {
            int[] used = new int[even.size()];
            if( find(used, even, odd.get(i), evenMaths)){
                count++;
            }

        }
        System.out.println(count);
    }

    private static boolean find(int[] used, List<Integer> even, Integer odd, int[] evenMaths) {
        for (int i = 0; i < even.size(); i++) {
            // 判断该位置的偶数是否被访问到
            if (matchIsSuShu(odd + even.get(i)) && used[i] == 0) {
                used[i] = 1;
                /*如果i位置偶数还没有伴侣，则与x组成伴侣，如果已经有伴侣，并且这个伴侣能重新找到新伴侣，则把原来伴侣让给别人，自己与x组成伴侣*/
                if (evenMaths[i] == 0 || find(used, even, evenMaths[i], evenMaths)) {
                    evenMaths[i] = odd;
                    return true;
                }
            }

        }
        return false;

    }


    public static boolean matchIsSuShu(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
