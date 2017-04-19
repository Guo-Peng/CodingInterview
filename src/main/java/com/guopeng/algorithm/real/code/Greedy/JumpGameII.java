package com.guopeng.algorithm.real.code.Greedy;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * For example:
 * Given array A = [2,3,1,1,4]
 * <p>
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class JumpGameII {

    public static int jump(int[] arr) {
        int count = 0;
        int end = 0;
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, i + arr[i]);
            if (i == end) {
                count++;
                end = max;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4}; //2
        System.out.println(jump(arr));

        arr = new int[]{1, 3, 2}; // 2
        System.out.println(jump(arr));

        arr = new int[]{3, 2, 1}; // 1
        System.out.println(jump(arr));

        arr = new int[]{2, 3, 1}; // 1
        System.out.println(jump(arr));

        arr = new int[]{1, 1, 1, 1}; //3
        System.out.println(jump(arr));

        arr = new int[]{4, 1, 1, 3, 1, 1, 1}; //2
        System.out.println(jump(arr));
    }
}
