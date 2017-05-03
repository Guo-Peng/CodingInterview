package com.guopeng.algorithm.real.code.String;

/**
 * Created by guopeng on 17-5-3.
 */
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        int start = 0;
        StringBuffer str = new StringBuffer(s.trim());
        reverse(str, 0, str.length() - 1);
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                reverse(str, start, i - 1);
                start = i + 1;
                while (i < str.length() - 1 && str.charAt(i + 1) == ' ')
                    str.deleteCharAt(i + 1);
            }
        }
        return str.toString();
    }

    private static void reverse(StringBuffer str, int low, int hi) {
        if (low >= hi) return;

        for (int i = 0; i < (hi - low + 1) / 2; i++) {
            char tmp = str.charAt(hi - i);
            str.setCharAt(hi - i, str.charAt(low + i));
            str.setCharAt(low + i, tmp);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   a   b "));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("hello world!"));
    }
}
