package com.guopeng.algorithm.codeinterview.utils;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/10.
 */
public class Print {
    public static <T> void arrPrint(T[] arr) {
        System.out.print("[ ");

        for (T element : arr) {
            System.out.print(element + " ");
        }

        System.out.println("]");
    }

    public static void arrPrint(int[] arr) {
        System.out.print("[ ");

        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println("]");
    }

    public static <T> void stackPrint(Stack<T> stack) {
        System.out.println(stack.toString());
    }
}
