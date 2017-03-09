package com.guopeng.algorithm.real.xiaomi;

/**
 * Created by guopeng on 17-3-9.
 */
public class EditDistance {
    /**
     * 编辑距离
     *
     * @param str1
     * @param str2
     * @return edit[i][j] 删除一个字符的编辑距离 + 1 与 删除两个字符并比较当前字符是否相等
     */
    public int editDistance(String str1, String str2) {
        int[][] edit = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            edit[i][0] = i;
        }

        for (int i = 0; i <= str2.length(); i++) {
            edit[0][i] = i;
        }

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                int minAD = Math.min(edit[i][j - 1], edit[i - 1][j]) + 1;
                int minM = edit[i - 1][j - 1] + (str1.charAt(i - 1) == str2.charAt(j - 1) ? 0 : 1);
                edit[i][j] = Math.min(minAD, minM);
            }
        }

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                System.out.print(edit[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }

        return edit[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        System.out.println(new EditDistance().editDistance("eeba", "abac"));
    }
}
