package com.guopeng.algorithm.real.ali;

import java.util.HashSet;

/**
 * Created by guopeng on 17-3-9.
 */
public class LongestUnRepeatedSubStr {
    public String getLongestUnRepeatedSubStr(String str) {
        if (str == null) return null;
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int max = -1;
        int mstart = 0;
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                if (i - start > max) {
                    max = i - start;
                    mstart = start;
                }
                start = i;
                set.clear();
            }
            set.add(str.charAt(i));
        }

        if (str.length() - start > max) return str.substring(start);
        return str.substring(mstart, mstart + max);
    }

    public static void main(String[] args) {
        System.out.println(new LongestUnRepeatedSubStr().getLongestUnRepeatedSubStr("abcdefgegcsgcasse"));
    }
}
