package com.guopeng.algorithm.real.qihu360;

import com.guopeng.algorithm.util.collection.Tuple;
/**
 * Created by guopeng on 17-3-22.
 */
public class GodAllocation {
    private Tuple[][] tmp;

    public GodAllocation(int N) {
        tmp = new Tuple[N][N];
    }

    public Tuple godAllocation(int[] arr, int lo, int hi) {
        if (hi == lo) return new Tuple(arr[lo], 0);

        if (tmp[lo][hi] != null) return tmp[lo][hi];

        Tuple tupleLeft = godAllocation(arr, lo + 1, hi);
        Tuple tupleRight = godAllocation(arr, lo, hi - 1);
        if (tupleLeft.b + arr[lo] <= tupleRight.b + arr[hi])
            tmp[lo][hi] = new Tuple(tupleRight.b + arr[hi], tupleRight.a);
        else
            tmp[lo][hi] = new Tuple(tupleLeft.b + arr[lo], tupleLeft.a);

        return tmp[lo][hi];
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 5, 2};
        System.out.println(new GodAllocation(arr.length).godAllocation(arr, 0, arr.length - 1));

        arr = new int[]{140, 649, 340, 982, 105, 86, 56, 610, 340, 879};
        System.out.println(new GodAllocation(arr.length).godAllocation(arr, 0, arr.length - 1));
    }
}
