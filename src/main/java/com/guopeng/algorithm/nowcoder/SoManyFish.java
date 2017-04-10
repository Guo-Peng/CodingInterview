package com.guopeng.algorithm.nowcoder;

import java.util.Scanner;

/**
 * Created by guopeng on 2017/3/13.
 */
public class SoManyFish {
    public int fishCount(int[] fishes, int min, int max) {
        int count = 0;
        for (int i = 0; i < fishes.length; i++) {
            count += Math.min(0, fishes[i + 1] - fishes[i] - 1);
            count += Math.min(0, fishes[i + 1] - 10 * fishes[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int n = scanner.nextInt();

        int[] fishes = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            fishes[i] = scanner.nextInt();
        }
    }
}
