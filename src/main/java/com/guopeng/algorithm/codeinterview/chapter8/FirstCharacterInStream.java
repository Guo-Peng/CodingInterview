package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 2017/2/25.
 */
public class FirstCharacterInStream {
    /**
     * 字符串第一次出现的数字
     *
     * @param str
     * @return
     * @throws Exception 出现则将其置为i+1 ，数字不为0则出现过将其置为-1
     *                   找到最小的索引值
     */
    public char firstCharacterAppearingOnce(String str) throws Exception {
        if (str == null) throw new Exception("Invalid Input");
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] != 0) arr[str.charAt(i)] = -1;
            else arr[str.charAt(i)] = i + 1;
        }

        int index = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (arr[i] > 0) {
                if (arr[i] < index) index = arr[i];
            }
        }
        if (index > str.length()) throw new Exception("Invalid Input");

        return str.charAt(index - 1);

    }
}
