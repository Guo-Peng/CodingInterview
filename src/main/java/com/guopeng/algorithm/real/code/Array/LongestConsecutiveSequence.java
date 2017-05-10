package com.guopeng.algorithm.real.code.Array;

import java.util.HashMap;

/**
 * Created by guopeng on 17-5-10.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num))
                continue;

            int left = count.getOrDefault(num - 1, 0);
            int right = count.getOrDefault(num + 1, 0);
            int sum = left + right + 1;
            count.put(num, sum);

            result = Math.max(result, sum);
            count.put(num - left, sum);
            count.put(num + right, sum);
        }

        return result;
    }
}
