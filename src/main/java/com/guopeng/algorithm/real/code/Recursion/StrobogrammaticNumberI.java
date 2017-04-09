package com.guopeng.algorithm.real.code.Recursion;

import java.util.HashMap;

/**
 * Created by guopeng on 17-3-14.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * <p>
 * Write a function to determine if a number is strobogrammatic. The number is represented as a string.
 * <p>
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 */
public class StrobogrammaticNumberI {
    static HashMap<Character, Character> dict = new HashMap<>();

    static {
        dict.put('0', '0');
        dict.put('1', '1');
        dict.put('6', '9');
        dict.put('8', '8');
        dict.put('9', '6');
    }

    /**
     * 检查数字是否对称
     *
     * @param num
     * @return
     * @comment 两个指针分别指示当前 位及其对称位，比较是否该数字对称
     */
    public boolean isStrobogrammatic(String num) {
        if (num == null) return false;

        for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
            if (!dict.containsKey(num.charAt(i)) || num.charAt(j) != dict.get(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new StrobogrammaticNumberI().isStrobogrammatic("010"));
    }
}
