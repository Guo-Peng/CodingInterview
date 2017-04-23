package com.guopeng.algorithm.real.code.Math;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guopeng on 2017/4/23.
 */
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < n - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;

                for (int p = j + 1, k = n - 1; p < k; ) {
                    int sum = nums[i] + nums[j] + nums[p] + nums[k];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[k]));

                        while (++p < k && nums[p] == nums[p - 1]) ;

                        while (p < --k && nums[k] == nums[k + 1]) ;
                    } else if (sum < target)
                        p++;
                    else
                        k--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
//        System.out.println(fourSum(arr, 0));

        arr = new int[]{0, 0, 0, 0};
//        System.out.println(fourSum(arr, 0));

        arr = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        System.out.println(fourSum(arr, 0));
    }

}
