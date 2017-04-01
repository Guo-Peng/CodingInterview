package com.guopeng.algorithm.real.test;

/**
 * Created by guopeng on 17-4-1.
 */
public class LongestPalindrome {
    public static int longestPalindromeN2(String str) {
        int n = str.length();
        int max = 0;

        // 以每个元素为回文的中心进行判断
        for (int i = 0; i < n; i++) {
            // 以i为中心进行搜索，长度为奇数
            for (int j = 0; (i - j) >= 0 && (i + j < n); j++) {
                if (str.charAt(i - j) != str.charAt(i + j)) break;
                if (2 * j + 1 > max) max = 2 * j + 1;
            }

            // y以i为左侧的最右元素，长度为奇数
            for (int j = 0; (i - j) >= 0 && (i + j + 1 < n); j++) {
                if (str.charAt(i - j) != str.charAt(i + j + 1)) break;
                if (2 * j + 2 > max) max = 2 * j + 2;
            }
        }
        return max;
    }

    /**
     * 首先转换字符串将偶数或者奇数长度的回文统一转化为奇数长度
     * 回文必定以#作为结束，当中心字符为数字时 #num 为一组，#代表左侧匹配的字符，最后多一个#，因此长度为单侧的长度-1
     * 当以#为中心时num#为一组，#代表左侧匹配的字符中心的#多余，因此实际回文长度也为单侧长度-1
     * pos[i]代表以i为中心的单侧回文长度，实际的长度为pos[i]-1
     *
     * @param str
     * @return
     */
    public static int longestPalindrome(String str) {
        str = fill(str);
        int[] pos = new int[str.length()];
        int id = 0, mx = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            /**
             * mx为之前的回文子串右侧的最远字符(不包含)
             * id为最远回文子串的中心
             * 2×id-i为i关于中心的对称点、
             * pos[i]的初始化：
             * 如果mx大于当前的i时
             *      i附近的字符可以与对称点的字符一直，其回文子串的长度也一致 pos[i] = pos[2 * id - i]
             *      但i的子串可能会突破mx到达更远的位置 pos[i] = mx-i
             *      此时取二者的最小值进行初始化
             * 如果mx不大于当前的i则无法对i的回文字符进行猜测
             *      此时将pos[i]初始化为1
             *
             * 以i为中心，pos[i]为当前最近不匹配的字符开始检测，如果匹配则pos[i]++以扩展至更远的字符
             * 扩展结束后如果最近的不匹配字符的位置大于mx则更新mx和id
             *
             */
            pos[i] = mx > i ? Math.min(pos[2 * id - i], mx - i) : 1;
            while (str.charAt(i + pos[i]) == str.charAt(i - pos[i]))
                pos[i]++;
            if (i + pos[i] > mx) {
                mx = i + pos[i];
                id = i;
            }
        }

        int max = 0, index = -1;
        for (int i = 0; i < pos.length; i++) {
            if (pos[i] > max) {
                max = pos[i];
                index = i;
            }
        }
        // index - max + 1 ~ index + max -1
        System.out.println(str.substring(index - max + 1, index + max).replace("#", ""));
        return max - 1;
    }

    /**
     * 字符串填充
     * 首字符为$可以避免第一个字符进行比较时str.charAt(i - pos[i])的越界
     * 结束字符使用-并在i指向最后一个#时结束就可以避免str.charAt(i + pos[i])的越界
     * 结束开始的标记不一样防止被计入并越界
     *
     * @param str
     * @return
     */
    private static String fill(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("$#");
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(String.format("%s#", str.charAt(i)));
        }
        stringBuilder.append("-");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "XMADAMYX";
        System.out.println(longestPalindrome(str));
    }
}
