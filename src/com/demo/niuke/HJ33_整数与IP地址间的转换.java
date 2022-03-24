package com.demo.niuke;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/practice/66ca0e28f90c42a196afd78cc9c496ea?tpId=37&tqId=21256&rp=1&ru=/ta/huawei&qru=/ta/huawei&difficulty=&judgeStatus=&tags=/question-ranking
 *
 * @program: BrushQuestions
 * @ClassName HJ33_整数与IP地址间的转换
 * @description:
 * @author: huJie
 * @create: 2022-03-24 15:36
 **/
public class HJ33_整数与IP地址间的转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if(s.contains(".")){
                // ip地址
                String ipToTwoStr = "";
                String[] split = s.split("\\.");
                long result = 0;
                for (int i = 0; i < split.length; i++) {
                    int parseInt = Integer.parseInt(split[i]);
                    String s1 = tenToTwo(parseInt);
                    ipToTwoStr = ipToTwoStr + s1;
                }
                result = twoToTen(ipToTwoStr);
                System.out.println(result);
            }else{
                long i = Long.valueOf(s);
                String s1 = tenToTwo(i);
                String result = "";
                for (int j = 0; j < 4; j++) {
                    String substring = s1.substring(j * 8, (j + 1) * 8);
                    long twoToTen = twoToTen(substring);
                    if(j == 3){
                        result = result + twoToTen;
                    }else{
                        result = result + twoToTen + ".";
                    }

                }
                System.out.println(result);

            }
        }
    }

    private static long twoToTen(String ipToTwoStr) {
        char[] chars = ipToTwoStr.toCharArray();
        long result = 0;
        int index = 0;
        for (int i = chars.length-1; i >=0; i--) {
            long temp = (long) (Integer.valueOf(chars[i]+"") * Math.pow(2, index));
            result+=temp;
            index++;
        }
        return result;
    }

    private static String tenToTwo(long parseInt) {
        String result = "";
        while (parseInt > 0) {
            result = parseInt % 2 + result;
            parseInt = parseInt / 2;
        }

        int i1 = result.length() % 8;
        if (i1 != 0) {
            int relaceCount = 8 - i1;
            for (int i = 0; i < relaceCount; i++) {
                result = "0" + result;
            }
        }else if("".equals(result)){
            result = "00000000";
        }
        return result;
    }


}
