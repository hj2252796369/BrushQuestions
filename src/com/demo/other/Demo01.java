package com.demo.other;

import java.util.Scanner;

/**
 * @program: BrushQuestions
 * @ClassName Demo01
 * @description:
 * @author: huJie
 * @create: 2022-04-03 10:27
 **/
public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Integer n = Integer.valueOf(scanner.nextLine());
            if(n == 0){
                return;
            }
            int i = find(n);
            System.out.println(i);
        }

    }

    private static int find(Integer n) {

        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }

        return find(n-2)+1;

    }
}
