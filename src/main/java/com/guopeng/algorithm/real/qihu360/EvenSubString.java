package com.guopeng.algorithm.real.qihu360;

/**
 * Created by guopeng on 2017/3/25.
 */
public class EvenSubString {
    public int evenSubString(String str) {
        int count = 0;
        if (str == null || str.length() == 1) return count;

        int length = str.length();
        int[][] sub = new int[length][length];

        for (int i = 0; i < length - 1; i++) {
            sub[i][i + 1] = str.charAt(i) ^ str.charAt(i + 1);
            if (sub[i][i + 1] == 0) count++;
        }


        for (int l = 4; l <= length; l += 2) {
            for (int i = 0; i <= length - l; i++) {
                int mid = i + (l / 2) - 1;
                if (l % 4 != 0) mid++;
                int j = i + l - 1;

                sub[i][j] = sub[i][mid] ^ sub[mid + 1][j];
                if (sub[i][j] == 0) count++;
            }
        }
        return count;
    }
}
