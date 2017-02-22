package com.guopeng.algorithm.codeinterview.chapter2;

/**
 * Created by guopeng on 2017/2/1.
 */
public class FindInPartiallySortedMatrix {
    /**
     * 给定有序的二维数组
     * 数组按行 行列递增
     * 查询元素是否存在于数组中
     *
     * @param matrix
     * @param number
     * @return
     * @comment 选择左上或者右下开始查找时, 仅能确定当前元素不符合
     * 从右上或者左下开始查找时,每次能减少一行 或 一列 的范围
     */
    public boolean find(int matrix[][], int number) {
        if (matrix == null) return false;

        for (int row = matrix.length - 1, col = 0; row >= 0 && col < matrix[0].length; ) {

            if (number > matrix[row][col]) col++;
            else if (number < matrix[row][col]) row--;
            else return true;
        }
        return false;
    }
}
