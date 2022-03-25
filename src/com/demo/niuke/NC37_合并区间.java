package com.demo.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program: BrushQuestions
 * @ClassName vv
 * @description:
 * @author: huJie
 * @create: 2022-03-25 14:48
 **/
public class NC37_合并区间 {
    public static void main(String[] args) {


        ArrayList<Interval> arrayList = new ArrayList<>();
        arrayList.add(new Interval(2, 3));
        arrayList.add(new Interval(2, 2));
        arrayList.add(new Interval(3, 3));
        arrayList.add(new Interval(1, 3));
        arrayList.add(new Interval(5, 7));
        arrayList.add(new Interval(2, 2));
        arrayList.add(new Interval(4, 6));

        ArrayList<Interval> merge = merge(arrayList);
        System.out.println(merge);

    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        ArrayList<Interval> result = new ArrayList<>();
        int index = -1;

        for (Interval interval : intervals) {
            if (index == -1 || interval.start > result.get(index).end) {
                result.add(interval);
                index++;
            } else {
                result.get(index).end = Math.max(result.get(index).end, interval.end);
            }
        }


        return result;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
