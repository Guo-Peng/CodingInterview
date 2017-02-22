package com.guopeng.algorithm.codeinterview.chapter2;


/**
 * Created by guopeng on 2017/2/2.
 */
public class QuickSort {
    /**
     * @param arr
     * @param lo
     * @param hi
     * @throws Exception
     * @comment 左侧指针指向大于索引的元素, 右侧指针指向小于索引的元素
     * 一侧满足条件则至移动另一侧
     * 两侧满足之后将指针指示的数字互换
     * 最后将索引数字与右侧指示数字(右侧起第一个不大于索引的数组)互换,索引为最小数字时,右侧指针为lo-1,不可互换
     * 索引大于lo说明有左侧数组,进行左侧递归
     * 索引小于hi说明有右侧数组,进行右侧递归
     */
    public void quickSort(int[] arr, int lo, int hi) throws Exception {
        if (arr == null || lo < 0 || lo > hi) throw new Exception("Invalid Input");
        if (lo == hi) return;

        int index = partition(arr, lo, hi);
        if (index > lo) quickSort(arr, lo, index - 1);
        if (index < hi) quickSort(arr, index + 1, hi);
    }

    /**
     * 将小于第一个数字的放在数组左侧，大于等于的放在数组右侧，最后将第一个数字与左侧的最后一个数字(index)交换
     * index位置的数组已排好序
     * 遇到大于等于num的数字i就会领先index 1
     * i与Index之间的数字均比num大
     * index指示的是最后一个小于num的数字
     * i遇到小于num的数字就将index + 1，如果index跟上i则无大于num的数组，如果二者不等则此时的index大于num将其与i交换
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public int partition(int[] arr, int start, int end) {
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[start]) {
                index++;
                if (index != i) exchange(arr, index, i);
            }
        }

        exchange(arr, start, index);
        return index;
    }

    private void exchange(int[] arr, int index1, int index2) {
        if (index1 == index2) return;

        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
