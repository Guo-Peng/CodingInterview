package com.guopeng.algorithm.real.ms;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by guopeng on 2017/4/23.
 */
public class QueenAttack {
    public static int queenAttack(int[][] points) {
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        HashMap<Integer, Integer> pos = new HashMap<>();
        HashMap<Integer, Integer> min = new HashMap<>();

        for (int[] point : points) {
            int count = 0;
            if (row.containsKey(point[0]))
                count = row.get(point[0]);
            row.put(point[0], count + 1);

            count = 0;
            if (col.containsKey(point[1]))
                count = col.get(point[1]);
            col.put(point[1], count + 1);

            count = 0;
            if (pos.containsKey(point[0] - point[1]))
                count = pos.get(point[0] - point[1]);
            pos.put(point[0] - point[1], count + 1);

            count = 0;
            if (min.containsKey(point[0] + point[1]))
                count = min.get(point[0] + point[1]);
            min.put(point[0] + point[1], count + 1);
        }

        int result = 0;
        for (int num : row.values())
            result += (num * (num - 1)) / 2;
        for (int num : col.values())
            result += (num * (num - 1)) / 2;
        for (int num : pos.values())
            result += (num * (num - 1)) / 2;
        for (int num : min.values())
            result += (num * (num - 1)) / 2;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        System.out.println(queenAttack(points));
    }
}
