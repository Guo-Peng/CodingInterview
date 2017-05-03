package com.guopeng.algorithm.real.code.Array;

/**
 * Created by guopeng on 17-5-3.
 */
public class FindMinimumInRotatedSortedArray {
    /**
     * 元素大于开头及结尾则一定在右侧
     * 否则在左侧
     * 如果元素小于其前一个则该元素就是最小
     *
     * @param nums
     * @return
     */
    public static int findMin(int[] nums) {
        int n = nums.length;

        return find(nums, 0, n - 1);
    }

    private static int find(int[] nums, int low, int hi) {
        if (low >= hi) return nums[low];
        int mid = low + (hi - low) / 2;

        if (mid > 0 && nums[mid] < nums[mid - 1])
            return nums[mid];

        if (nums[mid] >= nums[low] && nums[mid] > nums[hi])
            return find(nums, mid + 1, hi);
        else return find(nums, low, mid - 1);
    }

    public static int findMinII(int[] nums) {
        int n = nums.length;

        return findII(nums, 0, n - 1);
    }

    private static int findII(int[] nums, int low, int hi) {
        if (low == hi) return nums[low];

        if (nums[low] < nums[hi]) return nums[low];

        int mid = low + (hi - low) / 2;
        if (nums[low] == nums[mid] && nums[hi] == nums[mid])
            return Math.min(findII(nums, low, mid - 1), findII(nums, mid + 1, hi));

        if (nums[mid] >= nums[low]) {
            return Math.min(nums[mid], findII(nums, mid + 1, hi));
        } else return Math.min(nums[mid], findII(nums, low, mid - 1));
    }

    public static int findMinIII(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r--;  //nums[mid]=nums[r] no idea, but we can eliminate nums[r];
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(arr));

        arr = new int[]{3, 1, 2};
        System.out.println(findMin(arr));
    }
}
