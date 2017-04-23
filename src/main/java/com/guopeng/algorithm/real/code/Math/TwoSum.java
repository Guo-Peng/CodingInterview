package com.guopeng.algorithm.real.code.Math;

import com.guopeng.algorithm.codeinterview.utils.Print;

import java.util.HashMap;

/**
 * Created by guopeng on 2017/4/23.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static int[] twoSumSorted(int[] nums, int target) {
        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (nums[i] + nums[j] == target)
                return new int[]{i, j};
            else if (nums[i] + nums[j] < target)
                i++;
            else j--;
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 11, 15};
        Print.arrPrint(twoSum(arr, 9));

        arr = new int[]{3, 2, 4};
        Print.arrPrint(twoSum(arr, 6));

    }
}
