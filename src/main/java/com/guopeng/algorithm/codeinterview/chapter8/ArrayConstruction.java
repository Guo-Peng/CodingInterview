package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 2017/2/25.
 */
public class ArrayConstruction {
    public int[] arrayConstruction(int[] arr) {
        if (arr == null) return null;

        int[] under = new int[arr.length];
        int[] upper = new int[arr.length];

        int end = arr.length - 1;
        upper[end] = 1;
        under[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            under[i] = under[i - 1] * arr[i - 1];
            upper[end - i] = upper[end - i + 1] * arr[end - i + 1];
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = under[i] * upper[i];
        }

        return result;
    }
}
