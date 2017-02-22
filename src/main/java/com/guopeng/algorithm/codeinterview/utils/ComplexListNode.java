package com.guopeng.algorithm.codeinterview.utils;

/**
 * Created by guopeng on 2017/2/14.
 */
public class ComplexListNode {
    public int value;
    public ComplexListNode next;
    public ComplexListNode slibling;

    public ComplexListNode(int value) {
        this.value = value;
    }

    public ComplexListNode cloneWithValue() {
        return new ComplexListNode(value);
    }

    public static String print(ComplexListNode head) {
        ComplexListNode cur = head;
        String result = "";

        while (cur != null) {
            result += cur.value;
            if (cur.slibling != null) result += String.format("(%s)", cur.slibling.value);
            result += ",";

            cur = cur.next;
        }
        return result.substring(0, result.length() - 1);
    }
}
