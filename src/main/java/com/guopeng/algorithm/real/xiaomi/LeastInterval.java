package com.guopeng.algorithm.real.xiaomi;

/**
 * Created by guopeng on 2017/4/19.
 */
public class LeastInterval {
    public static int leastInterval(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int[] result = new int[max - min + 1];
        for (int num : arr)
            result[num - min]++;

        int interval = Integer.MAX_VALUE;
        int pre = 0;
        boolean flag = true;
        for (int i = 0; i < max - min; i++) {
            if (flag) {
                if (result[i] != 0) {
                    pre = i;
                    flag = false;
                }
                continue;
            }

            if (result[i] != 0) {
                if ((i - pre) < interval)
                    interval = i - pre;
                pre = i;
            }
        }

        return interval;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 200, 16, 13};
        System.out.println(leastInterval(arr));
    }

}
