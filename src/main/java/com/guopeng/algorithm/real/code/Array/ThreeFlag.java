package com.guopeng.algorithm.real.code.Array;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 2017/4/25.
 */
public class ThreeFlag {
    public static void threeFlag(int[] arr) {
        if (arr == null) return;

        int n = arr.length;
        for (int start = 0, end = n - 1, cur = 0; cur <= end; ) {
            if (arr[cur] == 0) {
                if (cur != start)
                    exchange(arr, cur, start);
                start++;
                cur++;
                continue;
            }

            if (arr[cur] == 1) {
                cur++;
                continue;
            }

            if (arr[cur] == 2) {
                if (arr[end] == 2) {
                    end--;
                    continue;
                }
                exchange(arr, cur, end);
            }
        }
    }

    private static void exchange(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 2, 1, 1, 1, 0};
        threeFlag(arr);
        Print.arrPrint(arr);

    }
}
