package com.guopeng.algorithm.real.code.Math;

/**
 * Created by guopeng on 17-4-24.
 */
public class String2Integer {
    public static int myAtoi(String str) {
        if (str == null) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;
        if (str.equals("-2147483648"))
            return Integer.MIN_VALUE;

        int index = 0;
        int flag = 1;
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            flag = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        int result = 0;
        for (; index < str.length(); index++) {
            int bit = str.charAt(index) - '0';
            if (bit > 9 || bit < 0) break;

            int tmp = result * 10 + bit;
            if ((tmp - bit) / 10 == result && tmp >= 0)
                result = tmp;
            else {
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return result * flag;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
        System.out.println(myAtoi("-234"));
        System.out.println(myAtoi("234"));
        System.out.println(myAtoi("+-2"));
        System.out.println(myAtoi("    010"));
        System.out.println(myAtoi("  -0012a42"));
    }

}
