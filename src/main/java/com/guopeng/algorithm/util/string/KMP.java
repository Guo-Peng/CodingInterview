package com.guopeng.algorithm.util.string;

/**
 * Created by guopeng on 2017/3/8.
 */
public class KMP {
    public int search(String pattern, String str) {
        int[][] dfa = patDfa(pattern);

        int i = 0, j = 0;
        for (; i < str.length() && j < pattern.length(); i++) {
            j = dfa[str.charAt(i)][j];
        }

        if (j == pattern.length()) return i - pattern.length();
        else return -1;
    }

    /**
     * 构造DFA
     *
     * @param pattern
     * @return index of match
     * 第i列为匹配到当前字符后的状态
     * 第i列的失败等价于i-1列失败的基础上遇到第i-1个字符
     * con为第i列失败后的回溯状态
     * <p>
     * 首先将第i列的失败状态的列赋值至第i列
     * 然后将第i个字符的行置为i+1
     * 下一列的失败状态等价于当前失败状态下遇到当前字符后的状态
     */
    private int[][] patDfa(String pattern) {
        int[][] dfa = new int[256][pattern.length()];

        int con = 0;
        dfa[pattern.charAt(0)][0] = 1;
        for (int i = 1; i < pattern.length(); i++) {
            for (int j = 0; j < 256; j++)
                dfa[j][i] = dfa[j][con];
            dfa[pattern.charAt(i)][i] = i + 1;

            con = dfa[pattern.charAt(i)][con];
        }
        return dfa;
    }
}
