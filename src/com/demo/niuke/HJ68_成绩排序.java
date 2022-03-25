package com.demo.niuke;

import java.util.*;

/**
 * https://www.nowcoder.com/practice/8e400fd9905747e4acc2aeed7240978b?tpId=37&rp=1&ru=%2Fta%2Fhuawei&qru=%2Fta%2Fhuawei&difficulty=&judgeStatus=&tags=&title=&sourceUrl=&gioEnter=menu
 *
 * @program: BrushQuestions
 * @ClassName HJ68_成绩排序
 * @description:
 * @author: huJie
 * @create: 2022-03-25 15:24
 **/
public class HJ68_成绩排序 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        String orderStr = scanner.nextLine();
        Integer num = Integer.valueOf(numStr);

        List<Student> students = new ArrayList<>();

        while (num > 0) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(" ");

            Student student = new Student(split[0], Integer.valueOf(split[1]));
            students.add(student);
            num--;
        }


        // 降序
        if (orderStr.equals("0")) {

            students.sort(Comparator.comparing(Student::getSource).reversed());
        } else {
            // 升序
            students.sort(Comparator.comparing(Student::getSource));
        }

        for (Student stu : students
        ) {
            System.out.println(stu.name + " " + stu.source);
        }
    }
}

class Student {
    String name;
    int source;

    public Student() {
    }

    public Student(String name, int source) {
        this.name = name;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

}
