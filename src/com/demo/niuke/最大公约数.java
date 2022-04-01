package com.demo.niuke;

/**
 * @program: BrushQuestions
 * @ClassName 最大公约数
 * @description:
 * @author: huJie
 * @create: 2022-04-01 15:50
 **/
public class 最大公约数 {
    public static void main(String[] args) {

        int a = 9;
        int b = 24;

        int i = maxCommonDivisor(9, 24);
        System.out.println(i);
    }

    public static int maxCommonDivisor(int m, int n) {
        // 保证m 是大于n的
        if(m < n){
            int temp = m;
            m = n;
            n = temp;
        }

        while(m % n != 0 ){
            int mod = m % n;
            m = n;
            n = mod;
        }

        return n;

    }
}
