package com.guopeng.algorithm.real.code.Math;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guopeng on 2017/4/23.
 */
public class ThreeSum {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> result = new LinkedList<>();

    public static List<List<Integer>> threeSumWithDup(int[] nums) {
        sum(nums, 0, 0);
        return result;
    }

    public static void sum(int[] nums, int sum, int index) {
        if (list.size() == 3 || index == nums.length) {
            if (sum == 0 && list.size() == 3)
                result.add(new LinkedList<>(list));
            return;
        }

        list.add(nums[index]);
        sum(nums, sum + nums[index], index + 1);
        list.removeLast();
        sum(nums, sum, index + 1);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new LinkedList<>();
        if (n < 3) return result;

        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;

            for (int j = i + 1, k = n - 1; j < k; ) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (++j < k && nums[j] == nums[j - 1]) ;
                    while (--k > j && nums[k] == nums[k + 1]) ;
                } else if (nums[i] + nums[j] + nums[k] < 0)
                    while (++j < k && nums[j] == nums[j - 1]) ;
                else
                    while (--k > j && nums[k] == nums[k + 1]) ;

            }
        }
        return result;
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if (n < 3) return 0;

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int min = Math.abs(target - (nums[0] + nums[1] + nums[2]));
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1, k = n - 1; j < k; ) {
                if (Math.abs(target - (nums[i] + nums[j] + nums[k])) < min) {
                    min = Math.abs(target - (nums[i] + nums[j] + nums[k]));
                    result = nums[i] + nums[j] + nums[k];
                }
                if (target - (nums[i] + nums[j] + nums[k]) == 0)
                    return target;
                else if (target - (nums[i] + nums[j] + nums[k]) > 0)
                    j++;
                else
                    k--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));

        arr = new int[]{1, -1, -1, 0};
        System.out.println(threeSum(arr));

        arr = new int[]{-2, 0, 0, 2, 2};
        System.out.println(threeSum(arr));

        arr = new int[]{-1, 2, 1, -4};
        System.out.println(threeSumClosest(arr, 1));

    }
}
