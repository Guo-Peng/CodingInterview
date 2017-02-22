package com.guopeng.algorithm.codeinterview.chapter4;


/**
 * Created by guopeng on 2017/2/13.
 */
public class PrintMatrixClockWisely {
    /**
     * 顺时针打印矩阵  画图找规律
     *
     * @param matrix
     * @return
     * @comment 按圈打印元素，记每圈左上角为起始元素
     * 方阵时结束点的起始X Y 均为总坐标的均值
     * 1*1 : (0,0)  2*2 : (0,0) 3*3 : (1,1) 4*4 : (1,1) 5*6 : (2,2) 6*6 : (2,2)
     * 不是方阵时按最短边退化为方阵情形
     * end = (n-1)/2
     */
    public String printMatrixClockWisely(int[][] matrix) {
        String result = "";
        for (int start = 0; start <= (matrix.length - 1) / 2 && start <= (matrix[0].length - 1) / 2; start++) {
            result += printOneCircle(matrix, start);
        }
        return result;
    }

    private String printOneCircle(int[][] matrix, int start) {
        String result = "";
        int endX = matrix[0].length - 1 - start;
        int endY = matrix.length - start - 1;

        // 第一步 必然存在 从至右打印一行
        // row : start  col : start ~ endX
        for (int i = start; i <= endX; i++)
            result += matrix[start][i];

        // 第二步 行数大于2则从上之下从第二个元素开始打印
        // row : start+1  ~ endY col : endX
        if (endY > start)
            for (int i = start + 1; i <= endY; i++)
                result += matrix[i][endX];

        // 第三步 行数大于2 列数大于2 从右到左
        // row : endY col : endX -1 ~ start
        if (endY > start && endX > start)
            for (int i = endX - 1; i >= start; i--) {
                result += matrix[endY][i];
            }

        // 第四步 行数大于3 列数大于2 从下到上
        // row : endX-1 ~ start+1 col : start
        if (endX > start && endY - 1 > start)
            for (int i = endY - 1; i > start; i--) {
                result += matrix[i][start];
            }
        return result;
    }
}
