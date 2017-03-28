package com.guopeng.algorithm.real.netease;

import java.util.Scanner;

/**
 * Created by guopeng on 17-3-27.
 */
public class DivideCookie {
    public static long divideCookie(String str, int n) {
        if (str == null || str.length() == 0) return 0;

        long [][] count = new long[2][n];

        int flag = 0;
        count[flag][0] = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) count[1 - flag][j] = 0;

            if (str.charAt(i) != 'X') {
                stateAdd(count, str.charAt(i) - '0', flag);
            } else {
                for (int j = 0; j < 10; j++) {
                    if (i == 0 && j == 0) continue;
                    stateAdd(count, j, flag);
                }
            }

            flag = 1 - flag;
        }

        return count[flag][0];
    }

    private static void stateAdd(long[][] count, int state, int flag) {
        for (int i = 0; i < count[0].length; i++) {
            count[1 - flag][(i * 10 + state) % count[0].length] += count[flag][i];
        }
    }

    public static void main(String[] args) {
        System.out.println(divideCookie("9XXXXXXXXXXXXXXXXX", 1));

//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        int n = scanner.nextInt();
//        System.out.println(divideCookie(line, n));
    }
}
