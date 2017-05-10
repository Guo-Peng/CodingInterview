package com.guopeng.algorithm.real.code.BackTracking;

/**
 * Created by guopeng on 17-5-10.
 */
public class NQueensII {
    int count;

    public int totalNQueens(int n) {
        tracking(0, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return count;
    }

    private void tracking(int r, boolean[] col, boolean[] d1, boolean[] d2) {
        int n = col.length;
        if (r == n) {
            count++;
            return;
        }

        for (int c = 0; c < n; c++) {
            int id1 = n + r - c, id2 = 2 * n - 1 - r - c;

            if (!col[c] && !d1[id1] && !d2[id2]) {
                col[c] = true;
                d1[id1] = true;
                d2[id2] = true;

                tracking(r + 1, col, d1, d2);

                col[c] = false;
                d1[id1] = false;
                d2[id2] = false;
            }
        }
    }

}
