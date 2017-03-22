package com.guopeng.algorithm.real.qihu360;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by guopeng on 17-3-22.
 */
public class Running {
    static DecimalFormat df = new DecimalFormat("0.000");

    public static void rec(int L, int R) {
        double theta = (L % (2 * Math.PI * R)) / R;

        theta = 2 * Math.PI - theta;
        System.out.println(df.format(Math.cos(theta) * R) + " " + df.format(Math.sin(theta) * R));
        theta = 2 * Math.PI - theta;
        System.out.println(df.format(Math.cos(theta) * R) + " " + df.format(Math.sin(theta) * R));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        rec(L, R);
    }
}
