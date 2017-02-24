package com.guopeng.algorithm.codeinterview.chapter7;

/**
 * Created by guopeng on 2017/2/24.
 */
public class StringToInt {
    /**
     * 字符串转数字
     *
     * @param str
     * @return
     * @throws Exception
     * @comment 注意边界的考虑
     * 输入为空
     * 输入有 + -号
     * 输入含有非法字符
     * 输入溢出(提前判断标志位并用long先代替结果)
     */
    public int stringToInt(String str) throws Exception {
        if (str == null || str.equals("")) throw new Exception("Invalid Input");

        int flag = 1;
        if (str.charAt(0) == '-') {
            flag = -1;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') str = str.substring(1);

        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            int bit = str.charAt(i) - '0';
            if (bit < 0 || bit > 9) throw new Exception("Invalid Input:" + str);
            result = result * 10 + flag * bit;
            if (result > 0x7fffffff || result < 0x80000000) throw new Exception("Invalid Input:" + str);
        }
        return (int) result;
    }
}
