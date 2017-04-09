package com.guopeng.algorithm.real.code.Recursion;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guopeng on 17-3-14.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * <p>
 * Find all strobogrammatic numbers that are of length = n.
 * <p>
 * For example, Given n = 2, return ["11","69","88","96"].
 */
public class StrobogrammaticNumberII {
    static HashMap<Character, Character> dict = StrobogrammaticNumberI.dict;

    /**
     * 找到n为数中的所有对称数字
     *
     * @param n
     * @return
     * @comment 依次 设置每一位，设置时需要同时设置其对称位
     */
    public List<String> findStrobogrammatic(int n) {
        if (n <= 0) return null;
        List<String> result = new LinkedList<>();
        StringBuffer num = new StringBuffer();
        num.setLength(n);

        setNum(num, 0, result);
        return result;
    }

    private void setNum(StringBuffer num, int index, List<String> result) {
        if (index > num.length() - 1 - index) return;

        for (char ch : dict.keySet()) {
            if (ch == '0' && index == 0 && num.length() != 1) continue;
            if (num.length() - 1 == 2 * index && (ch == '6' || ch == '9')) continue;

            num.setCharAt(index, ch);
            num.setCharAt(num.length() - 1 - index, ch);

            if (num.length() - 2 * index <= 2) result.add(num.toString());
            else setNum(num, index + 1, result);
        }
    }

    public static void main(String[] args) {
        List<String> l = new StrobogrammaticNumberII().findStrobogrammatic(3);
        for (String s : l) System.out.println(s);
    }
}
