package com.guopeng.algorithm.real.netease;

/**
 * Created by guopeng on 2017/4/20.
 */
public class PostSearchTree {
    public static boolean postSearchTree(int[] arr, int lo, int hi) {
        if (arr.length == 0) return false;

        if (lo >= hi) return true;

        int index = check(arr, lo, hi);
        if (index == -2) return false;

        return postSearchTree(arr, lo, index) && postSearchTree(arr, index + 1, hi - 1);

    }

    private static int check(int[] arr, int lo, int hi) {
        int cur = lo - 1;
        for (int i = lo; i < hi; i++) {
            if (arr[i] < arr[hi])
                if (++cur != i) return -2;
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 8, 7, 5};
        System.out.println(postSearchTree(arr, 0, arr.length - 1));

        arr = new int[]{7, 4, 6, 5};
        System.out.println(postSearchTree(arr, 0, arr.length - 1));

        arr = new int[]{5, 4, 3, 2, 1};
        System.out.println(postSearchTree(arr, 0, arr.length - 1));

        arr = new int[]{};
        System.out.println(postSearchTree(arr, 0, arr.length - 1));

        arr = new int[]{1};
        System.out.println(postSearchTree(arr, 0, arr.length - 1));
    }
}
