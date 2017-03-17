package com.guopeng.algorithm.real.leetcode.Recursion;

import java.util.List;

/**
 * Created by guopeng on 17-3-14.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * <p>
 * Write a function to count the total strobogrammatic numbers that exist in the range of low <= num <= high.
 * <p>
 * For example,
 * Given low = "50", high = "100", return 3. Because 69, 88, and 96 are three strobogrammatic numbers.
 * <p>
 * Note:
 * Because the range might be a large number, the low and high numbers are represented as string.
 */
public class StrobogrammaticNumberIII {
    /**
     * 计算在区间内部的对称数的个数
     *
     * @param low
     * @param high
     * @return
     * @comment 生成数字的过程中，判断是否符合区间
     */
    public int strobogrammaticInRange(String low, String high) {
        int count = 0;

        for (int i = low.length(); i <= high.length(); i++) {
            int l = 0, h = 0;

            List<String> nums = new StrobogrammaticNumberII().findStrobogrammatic(i);
            if (i == low.length())
                for (String num : nums) if (num.compareTo(low) >= 0) l++;
            if (i == high.length())
                for (String num : nums) if (num.compareTo(high) <= 0) h++;

            if (low.length() == high.length()) count += (l + h - nums.size());
            else if (i == low.length() || i == high.length()) count += (l + h);
            else count += nums.size();
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new StrobogrammaticNumberIII().strobogrammaticInRange("50", "100"));
    }
}
