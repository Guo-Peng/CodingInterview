package com.guopeng.algorithm.real.code.DynamicProgramming;

/**
 * Created by guopeng on 17-3-20.
 */
public class MatrixChain {
    static int[][] m;

    /**
     * 给定n个矩阵的链，求完全括号化方案使标量乘法次数最少
     * p*q,q*r的矩阵相乘的乘法次数为pqr
     *
     * @param matrix
     * @comment 矩阵在k处切分i..k   k+1...j
     * 损失等于两部分的损失和再加上两部分结果的损失(pqr)
     * 先计算子结构的损失，步长依次增加
     * 计算损失时在字结构内部进行切分进行损失的计算，如两两结合时可以拆分为两个矩阵相乘的损失
     * 时间复杂度o(n^3)
     */
    public void matrixChain(int[] matrix) {
        int n = matrix.length - 1;
        if (m == null)
            m = new int[n + 1][n + 1];

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i < matrix.length - l + 1; i += 1) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int p = m[i][k] + m[k + 1][j] + matrix[i - 1] * matrix[k] * matrix[j];
                    if (p < m[i][j]) {
                        m[i][j] = p;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] matrix = {30, 35, 15, 5, 10, 20, 25};
        MatrixChain matrixChain = new MatrixChain();
        matrixChain.matrixChain(matrix);
        System.out.println(m[1][matrix.length - 1]);
    }
}
