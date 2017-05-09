package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 17-5-9.
 */
public class PathInMatrix {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] path = new boolean[rows * cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r * cols + c] == str[0]) {
                    path[r * cols + c] = true;
                    if (find(matrix, path, rows, cols, r, c, str, 1))
                        return true;
                    path[r * cols + c] = false;
                }
            }
        }
        return false;
    }

    private static boolean find(char[] matrix, boolean[] path, int rows, int cols, int curR, int curC, char[] str, int index) {
        if (index == str.length) return true;

        boolean left = false, right = false, up = false, down = false;
        if (curC != 0 && !path[curR * cols + curC - 1] && matrix[curR * cols + curC - 1] == str[index]) {
            path[curR * cols + curC - 1] = true;
            left = find(matrix, path, rows, cols, curR, curC - 1, str, index + 1);
            path[curR * cols + curC - 1] = false;
        }

        if (curC != cols - 1 && !path[curR * cols + curC + 1] && matrix[curR * cols + curC + 1] == str[index]) {
            path[curR * cols + curC + 1] = true;
            right = find(matrix, path, rows, cols, curR, curC + 1, str, index + 1);
            path[curR * cols + curC + 1] = false;
        }

        if (curR != 0 && !path[(curR - 1) * cols + curC] && matrix[(curR - 1) * cols + curC] == str[index]) {
            path[(curR - 1) * cols + curC] = true;
            up = find(matrix, path, rows, cols, curR - 1, curC, str, index + 1);
            path[(curR - 1) * cols + curC] = false;
        }

        if (curR != rows - 1 && !path[(curR + 1) * cols + curC] && matrix[(curR + 1) * cols + curC] == str[index]) {
            path[(curR + 1) * cols + curC] = true;
            down = find(matrix, path, rows, cols, curR + 1, curC, str, index + 1);
            path[(curR + 1) * cols + curC] = false;
        }
        return left || right || up || down;
    }

    public static void main(String[] args) {
        char[] matrix = "ABCESFCSADEE".toCharArray();
        int rows = 3, cols = 4;
        char[] str = "ABCCED".toCharArray();
        System.out.println(hasPath(matrix, rows, cols, str));
    }
}
