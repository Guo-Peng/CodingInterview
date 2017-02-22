package com.guopeng.algorithm.codeinterview.chapter3;

/**
 * Created by guopeng on 2017/2/7.
 */
public class Power {
    static double delta = 0.0000001;

    /**
     * 计算double 数值的n次方
     *
     * @param base
     * @param exponent
     * @return
     * @throws Exception
     * @comment float double的计算及表示都有误差，不能直接用 == 判别相等，只能判断精度  **
     * 指数为负数则取倒数，此时底数为0则抛出异常
     * /2可以用右移运算符代替 %2可用与1求与代替  **
     */
    public double power(double base, int exponent) throws Exception {
        if (equal(exponent, 0)) return 1;
        else if (exponent < 0)
            if (base == 0) throw new Exception("can not divided by 0");
            else return 1 / power(base, -exponent);

        double sqrt = power(base, exponent >> 1);
        if ((exponent & 1) == 0) return sqrt * sqrt;
        else return sqrt * sqrt * base;
    }

    private Boolean equal(double d1, double d2) {
        return (d1 - d2 < delta) && (d1 - d2 > -delta);
    }
}
