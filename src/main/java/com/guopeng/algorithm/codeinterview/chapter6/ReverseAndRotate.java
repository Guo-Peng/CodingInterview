package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/20.
 */
public class ReverseAndRotate {
    /**
     * 翻转句子中的单词顺序
     *
     * @param sentence
     * @return
     * @comment 先将字母顺序全部翻转，然后翻转每个单词
     */
    public char[] reverseWordInSentence(char[] sentence) {
        if (sentence == null) return null;

        int lo = 0, hi = sentence.length - 1;
        reverse(sentence, lo, hi);

        hi = lo;
        while (hi <= sentence.length) {
            if (hi == sentence.length || sentence[hi] == ' ') {
                reverse(sentence, lo, hi - 1);
                lo = ++hi;
            } else hi++;
        }
        return sentence;
    }

    private void reverse(char[] sentence, int lo, int hi) {
        if (sentence == null || lo == hi) return;

        while (lo < hi)
            exchange(sentence, lo++, hi--);
    }

    private void exchange(char[] sentence, int lo, int hi) {
        char tmp = sentence[lo];
        sentence[lo] = sentence[hi];
        sentence[hi] = tmp;
    }

    /**
     * 左旋字符串
     *
     * @param sentence
     * @param n
     * @return
     * @throws Exception
     * @comment 字符串全部翻转后将前n个移至最后，然后分部翻转
     */
    public char[] leftRotateString(char[] sentence, int n) throws Exception {
        if (sentence == null) return null;
        if (n > sentence.length || n < 0) throw new Exception("Invalid Input");

        if (n == 0) return sentence;

        reverse(sentence, 0, sentence.length - 1);
        reverse(sentence, 0, sentence.length - n - 1);
        reverse(sentence, sentence.length - n, sentence.length - 1);
        return sentence;
    }
}
