package com.guopeng.algorithm.codeinterview.chapter3;

/**
 * Created by guopeng on 2017/2/8.
 */
public class Print1ToMaxOfNDigits {

    /**
     * 按顺序打印从1到最大的n位十进制数
     *
     * @param n
     * @throws Exception
     * @comment 涉及到大数问题，使用数组或者字符串代替数字
     * 从0-9依次设置各个位，设置到最低位时打印数字
     * maxBit标志数字的真正起始点，为n则数字为0
     */
    public void print1ToMaxOfNDigits(int n) throws Exception {
        if (n <= 0) return;

        StringBuilder num = new StringBuilder();
        num.setLength(n);
        setNBit(0, num, n);
    }

    private void setNBit(int n, StringBuilder num, int maxBit) {
        if (n == num.length()) {
            if (maxBit != n)
                System.out.println(num.substring(maxBit));
            return;
        }

        for (int i = 0; i < 10; i++) {
            num.setCharAt(n, (char) (i + '0'));
            if (i != 0 && maxBit > n) maxBit = n;
            setNBit(n + 1, num, maxBit);
        }
    }
}
