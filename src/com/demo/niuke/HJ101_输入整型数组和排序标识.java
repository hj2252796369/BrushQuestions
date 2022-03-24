package com.demo.niuke;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/practice/dd0c6b26c9e541f5b935047ff4156309?tpId=37&tqId=21324&rp=1&ru=/ta/huawei&qru=/ta/huawei&difficulty=&judgeStatus=&tags=/question-ranking
 *
 * @program: BrushQuestions
 * @ClassName HJ101_输入整型数组和排序标识
 * @description:
 * @author: huJie
 * @create: 2022-03-24 17:21
 **/
public class HJ101_输入整型数组和排序标识 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleNum = Integer.valueOf(scanner.nextLine());

        int[] nums = new int[eleNum];

        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(i >= s1.length){
                nums[i] = 0;
                continue;
            }
            nums[i] = Integer.valueOf(s1[i]);
        }

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        Integer orderNum = Integer.valueOf(scanner.nextLine());
        int index = 0;
        if (orderNum == 1) {
            index = nums.length - 1;
        }

        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[index]);
            if(i != nums.length -1){
                System.out.print(" ");
            }
            if (orderNum == 1) {
                index--;
            }else{
                index++;
            }
        }
        System.out.println();

    }
}
