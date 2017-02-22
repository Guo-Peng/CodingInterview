package com.guopeng.algorithm.codeinterview.chapter5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by guopeng on 2017/2/16.
 */
public class PrintMinNumber {
    /**
     * 将数组中的数拼接得到的最小的数返回
     *
     * @param arr
     * @return 定义字符串 Comparator比较连接后的大小作为两个字符串的大小
     */
    public String printMinNumber(int[] arr) {
        String[] arrStr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) arrStr[i] = String.valueOf(arr[i]);
        Arrays.sort(arrStr, new Cmp());

        StringBuffer bf = new StringBuffer();
        for (String num : arrStr) bf.append(num);
        return bf.toString();
    }

    private class Cmp implements Comparator<String> {
        public int compare(String str1, String str2) {
            return (str1 + str2).compareTo(str2 + str1);
        }
    }
}
