package com.guopeng.algorithm.codeinterview.chapter3;

/**
 * Created by guopeng on 2017/2/10.
 */
interface Cmp {
    Boolean isEven(int element);
}

class IsOdd implements Cmp {
    public Boolean isEven(int element) {
        return (element & 1) != 0;
    }
}

public class ReorderOddEven {
    /**
     * 调整数组使奇数位于前半部分，偶数位于后半部分
     *
     * @param arr
     * @comment 两个指针分别指向不满足的部分，同时成立则交换
     * 可以将判断部分进行抽象以复用代码
     */
    public void reorderOddEven(int[] arr, Cmp cmp) {
        if (arr == null) return;

        for (int i = 0, j = arr.length - 1; i < j; ) {
            if (!cmp.isEven(arr[i]) && cmp.isEven(arr[j])) {
                changeElement(arr, i, j);
            }

            if (cmp.isEven(arr[i])) i++;

            if (!cmp.isEven(arr[j])) j--;
        }
    }

    private void changeElement(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
