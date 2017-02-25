package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 2017/2/25.
 */
public class RegularExpressionsMatching {
    /**
     * 正则表达式匹配
     *
     * @param reg
     * @param str
     * @return
     */
    public boolean match(String reg, String str) {
        if (reg == null || str == null) return false;

        if (reg.length() == 0 && str.length() == 0) return true;
        else if (reg.length() == 0 && str.length() != 0) return false;

        /**
         * 下一个字符为*
         * str为空则直接进入下一状态
         * 当前字符能与str匹配时 可以进入下一状态且str不变、下一状态str后移、当前状态str后移
         */
        if (reg.length() > 1 && reg.charAt(1) == '*') {
            if (str.length() != 0 && (reg.charAt(0) == str.charAt(0) || reg.charAt(0) == '.'))
                return match(reg.substring(2), str) || match(reg.substring(2), str.substring(1))
                        || match(reg, str.substring(1));
            else return match(reg.substring(2), str);
        }

        if (reg.length() != 0 && str.length() == 0) return false;

        if (reg.charAt(0) == str.charAt(0) || reg.charAt(0) == '.') return match(reg.substring(1), str.substring(1));
        else return false;
    }
}
