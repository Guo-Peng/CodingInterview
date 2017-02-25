package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 2017/2/25.
 */
public class NumericStrings {
    public boolean isNumeric(String str) {
        if (str == null || str.length() == 0) return false;

        int index = 0;
        if (str.charAt(index) == '+' || str.charAt(index) == '-') index++;

        if (index == str.length()) return false; //无数字

        int tmp = index;
        index = scanInt(str, index);
        if (index == str.length()) return true;  //只有整数

        if (str.charAt(index) == '.') {  //小数
            index = scanInt(str, ++index);
            if (index - tmp == 1) return false;  //小数点前后均无数字
            if (index == str.length()) return true;  //只有小数

            if (index != str.length() && (str.charAt(index) == 'e' || str.charAt(index) == 'E')) {
                index = isExponential(str, ++index);
                return index == str.length();  //结束
            }
        } else if (str.charAt(index) == 'e' | str.charAt(index) == 'E') {  //整数
            index++;
            if (index - tmp == 1) return false;  //e前无数字
            index = isExponential(str, index);
        }
        return index == str.length();
    }

    private int scanInt(String str, int index) {
        while (index < str.length()) {
            int bit = str.charAt(index) - '0';
            if (bit >= 0 && bit <= 9) index++;
            else return index;
        }
        return index;
    }

    private int isExponential(String str, int index) {
        if (index != str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) index++;

        if (index == str.length()) return -1;

        index = scanInt(str, index);

        return index;
    }
}
