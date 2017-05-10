package com.guopeng.algorithm.real.code.BackTracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guopeng on 17-4-24.
 */
public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new LinkedList<>();
        tracking(0, new boolean[n], new boolean[2 * n], new boolean[2 * n], new LinkedList<>(), result);
        return result;
    }

    private static void tracking(int r, boolean[] col, boolean[] d1, boolean[] d2, LinkedList<String> lines, List<List<String>> result) {
        int n = col.length;
        if (r == n) {
            result.add(new LinkedList<>(lines));
            return;
        }

        for (int c = 0; c < n; c++) {
            int id1 = r - c + n;
            int id2 = 2 * n - 1 - r - c;

            if (!col[c] && !d1[id1] && !d2[id2]) {
                char[] row = new char[n];
                Arrays.fill(row, '.');
                row[c] = 'Q';

                lines.add(new String(row));
                col[c] = true;
                d1[id1] = true;
                d2[id2] = true;

                tracking(r + 1, col, d1, d2, lines, result);

                col[c] = false;
                d1[id1] = false;
                d2[id2] = false;
                lines.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
