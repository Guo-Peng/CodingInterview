package com.guopeng.algorithm.codeinterview.chapter4;

/**
 * Created by guopeng on 2017/2/15.
 */
public class StringPermutation {
    public void stringPermutation(char[] str) {
        if (str == null) return;

        bitPermutation(str, 0);
    }

    private void bitPermutation(char[] str, int index) {
        if (index == str.length) {
            System.out.println(str);
            return;
        }

        for (int i = index; i < str.length; i++) {
            exchange(str, index, i);
            bitPermutation(str, index + 1);
            exchange(str, i, index);
        }
    }

    private void exchange(char[] str, int index1, int index2) {
        if (index1 == index2) return;

        char tmp = str[index1];
        str[index1] = str[index2];
        str[index2] = tmp;
    }
}
