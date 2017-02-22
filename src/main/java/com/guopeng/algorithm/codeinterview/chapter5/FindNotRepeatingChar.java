package com.guopeng.algorithm.codeinterview.chapter5;

/**
 * Created by guopeng on 2017/2/16.
 */
public class FindNotRepeatingChar {
    /**
     * 找到第一个只出现一次的字符
     *
     * @param str
     * @return
     * @comment 遍历数组将字符存至hash表并记录次数
     * 遍历第二遍并找到第一个只出现一次的字符
     * 由于字符只有256个，所以可以使用大小为256的数组作为hash表
     * 字符的ascii码为索引
     */
    public char findNotRepeatingChar(String str) throws Exception {
        if (str == null) throw new Exception("Invalid Input");
        int[] table = new int[256];

        for (int i = 0; i < str.length(); i++) {
            table[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (table[str.charAt(i)] == 1) return str.charAt(i);
        }
        throw new Exception("Invalid Input");
    }
}
