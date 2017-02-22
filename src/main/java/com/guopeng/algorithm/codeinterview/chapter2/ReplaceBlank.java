package com.guopeng.algorithm.codeinterview.chapter2;

/**
 * Created by guopeng on 2017/2/1.
 */
public class ReplaceBlank {
    /**
     * 将给定数组中的空格替换为%20(url编码)
     *
     * @param str
     * @return
     * @comment 从前向后进行替换会将后续元素搬移多次
     * 从后向前替换即可只搬移一次元素(修改原数组的情况下)
     */
    public char[] replaceBlank(char[] str) {
        if (str == null) return null;

        int count = 0;
        for (char c : str) if (c == ' ') count++;

        if (count == 0) return str;

        char[] result = new char[str.length + count * 2];
        System.arraycopy(str, 0, result, 0, str.length);

        for (int i = str.length - 1, j = result.length - 1; j >= 0 && i >= 0; ) {
            if (result[i] == ' ') {
                i--;
                result[j--] = '0';
                result[j--] = '2';
                result[j--] = '%';
            } else {
                result[j--] = result[i--];
            }
        }

        return result;
    }
}
