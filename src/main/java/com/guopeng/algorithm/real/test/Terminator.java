package com.guopeng.algorithm.real.test;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by guopeng on 2017/3/25.
 */


public class Terminator {

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long[][] arr = new long[n][2];
        int res = 0;
        Set<Long> set = new HashSet<>();
        // 获取边界
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            arr[i][0] = a;
            arr[i][1] = arr[i][0] + b;
            set.add(arr[i][0]);
            set.add(arr[i][1]);
        }

        for (Long l : set) {
            res = Math.max(terminator(l, arr), res);
        }
        System.out.println(res);
    }

    /**
     * 从区间的中间切割时可以调整至最近的一个边界，杀敌数不变
     * 得到第一次切割后，建立坦克变化数组，遍历边界得到坦克变化值
     * 变化值得最大值为第二次切割的杀敌数，第一次的边界切割获得的set为第一次杀敌数
     * 遍历边界得到最大值即可
     *
     * @param first
     * @param arr
     * @return
     */
    public static int terminator(long first, long[][] arr) {
        int res = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (arr[i][0] <= first && arr[i][1] >= first) {
                long temp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = temp;
                s.add(i);
            }
        }

        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= arr[i][1]) {
                continue;
            }
            int a = map.getOrDefault(arr[i][0], 0);
            map.put(arr[i][0], a + 1);
            int b = map.getOrDefault(arr[i][1] + 1, 0);
            map.put(arr[i][1] + 1, b - 1);
        }
        int large = 0;
        int cur = 0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            cur += map.get(it.next());
            large = Math.max(large, cur);
        }

        for (Integer l : s) {
            long temp = arr[l][0];
            arr[l][0] = arr[l][1];
            arr[l][1] = temp;
        }
        return res + s.size() + large;
    }
}
