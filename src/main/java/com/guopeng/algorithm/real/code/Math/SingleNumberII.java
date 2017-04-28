package com.guopeng.algorithm.real.code.Math;

/**
 * Created by guopeng on 2017/4/26.
 */
public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                count += ((nums[j] >> i) & 1);
            }
            result |= ((count % 3) << i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(singleNumber(arr));
    }
}
