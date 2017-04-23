package com.guopeng.algorithm.real.code.Math;

/**
 * Created by guopeng on 2017/4/23.
 */
public class GreatestCommonDivisor {
    /**
     * 求最大公约数
     *
     * @param a
     * @param b
     * @return 令r = a%b = a - kb
     * 假设d为b r的公约数则 a = r + kb可以整除d
     * 因此b r的最大公约数等价于a b的最大公约数
     */
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
