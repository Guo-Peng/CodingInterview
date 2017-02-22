package com.guopeng.algorithm.codeinterview.chapter4;

/**
 * Created by guopeng on 2017/2/14.
 */
public class VerifySequenceOfBST {
    /**
     * 判断数组是否为二叉树的后序遍历的结果
     *
     * @param arr
     * @return
     * @comment 依次判断每一个根节点是否满足
     * 找到大于根节点的第一个节点，之后的元素为右子树，所有的元素应大于等于根节点
     */
    public Boolean verifySequenceOfBST(int[] arr) {
        if (arr == null) return false;

        return verifyOneNode(arr, 0, arr.length - 1);
    }

    private Boolean verifyOneNode(int[] arr, int start, int end) {
        if (start == end) return true;

        int index = start;
        while (arr[index] < arr[end]) index++;

        for (int i = index; i < end; i++) if (arr[i] < arr[end]) return false;

        if (index == start) return verifyOneNode(arr, index, end - 1);
        else if (index == end) return verifyOneNode(arr, start, index - 1);
        else return verifyOneNode(arr, start, index - 1) && verifyOneNode(arr, index, end - 1);
    }
}
