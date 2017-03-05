package com.guopeng.algorithm.real.ali;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by guopeng on 2017/3/4.
 */
public class HeartCurve {
    public double leartCurve(double mu1, double sigma1, double mu2, double sigma2) {
        Random randomX = new Random(111);
        Random randomY = new Random(222);
        double x = 0, y = 0;
        double count = 0;
        int N = 100000;

        for (int i = 0; i < N; i++) {
            x = Math.sqrt(sigma1) * randomX.nextGaussian() + mu1;

            y = Math.sqrt(sigma2) * randomY.nextGaussian() + mu2;
            if (isInHeart(x, y)) count++;
        }
        System.out.println(Double.valueOf(new DecimalFormat("0.0").format(count / N)));
        return 0;
    }

    private boolean isInHeart(double x, double y) {
        double f = Math.pow((x * x + y * y - 1), 3) - x * x * y * y * y;
        return f < 0;
    }

}
