package com.demo.niuke;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/practice/f8538f9ae3f1484fb137789dec6eedb9?tpId=37&tqId=21283&rp=1&ru=/exam/oj/ta&qru=/exam/oj/ta&sourceUrl=%2Fexam%2Foj%2Fta%3Fpage%3D1%26pageSize%3D50%26search%3DHJ60%26tpId%3D37%26type%3D37&difficulty=undefined&judgeStatus=undefined&tags=&title=HJ60
 *
 * @program: BrushQuestions
 * @ClassName HJ60_查找组成一个偶数最接近的两个素数
 * @description:
 * @author: huJie
 * @create: 2022-04-02 14:28
 **/
public class HJ60_查找组成一个偶数最接近的两个素数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer integer = Integer.valueOf(scanner.nextLine());
        match(integer);

    }

    private static void match(Integer num) {

        int minVal = 0;
        int maxVal = 0;
        int chazhi = num;


        for (int i = 2; i < num / 2 + 1; i++) {
            if(isSuShu(i) && isSuShu(num -i)){
                if(chazhi > (num -i -i)){
                    chazhi = num -i -i;
                    minVal = i;
                    maxVal = num - i;
                }
            }
        }
        System.out.println(minVal);
        System.out.println(maxVal);

    }

    private static boolean isSuShu(int n){
        for (int i = 2; i * i <= n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
