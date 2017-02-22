package com.guopeng.algorithm.codeinterview.chapter5;

/**
 * Created by guopeng on 2017/2/16.
 */
public class NumberOf1Between1AndN {
    /**
     * 1-n 整数中1出现的数目 *****
     *
     * @param n
     * @return
     * @comment 每个数字单独判断或者根据数字的规律进行排列组合
     */
    public int numberOf1Between1AndN(int n) {
        if (n <= 0) return 0;

        String num = String.valueOf(n);
        return numberOf1(num);
    }

    /**
     * 最高位： 为1 则1的数目等于剩余数字的数目+1，不为1则将最高位置1其他全排列
     * 例如 21345  最高位为2 则最高位为1时得到的1的数目为 10^4
     * <p>
     * 剩余位： 固定任一位为1 将剩余位全排列
     * 例如 21345 固定第二位 则为2*10^3 * 4
     * 此时得到的1的次数相当于 0~20000 或者 1346 ~ 21345(将20000~21345 对应为0~1345) 中除了最高位的1的数目
     * <p>
     * 递归迭代剩余数字 1345
     *
     * @param num
     * @return
     */
    private int numberOf1(String num) {
        if (num.equals("")) return 0;

        int count = 0;
        int high = num.charAt(0) - '0';

        if (high != 0 && num.length() == 1) return 1;
        if (high == 0 && num.length() == 1) return 0;

        if (high > 1) count += powerOf10(num.length() - 1);
        else if (high == 1 && num.length() > 1) count += Integer.valueOf(num.substring(1)) + 1;

        count += high * (num.length() - 1) * powerOf10(num.length() - 2); //num.length()=1时只剩最后一位，此时在前面直接返回
        return count + numberOf1(num.substring(1));
    }

    private int powerOf10(int n) {
        if (n < 0) return 0;

        int count = 1;
        for (int i = 0; i < n; i++)
            count *= 10;
        return count;

    }
}
