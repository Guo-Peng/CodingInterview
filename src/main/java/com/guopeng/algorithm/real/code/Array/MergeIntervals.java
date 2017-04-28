package com.guopeng.algorithm.real.code.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guopeng on 17-4-28.
 */
public class MergeIntervals {
    static class com implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) return intervals;

        intervals.sort(new com());
        List<Interval> result = new LinkedList<>();
        Interval pre = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval tmp = intervals.get(i);
            if (pre.end < tmp.start) {
                result.add(pre);
                pre = tmp;
            } else if (pre.end < tmp.end) {
                pre.end = tmp.end;
            }
        }
        result.add(pre);
        return result;
    }
}
