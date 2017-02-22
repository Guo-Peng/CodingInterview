package com.guopeng.algorithm.codeinterview.chapter4;

import com.guopeng.algorithm.codeinterview.utils.Print;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/13.
 */

/**
 * 包含min函数的栈
 *
 * @param <T>
 * @comment 定义一个最小值的栈来记录每个元素压入时刻的最小值
 */
public class MinInStack<T extends Comparable> {
    private Stack<T> stack;
    private Stack<T> minStack;

    public MinInStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(T element) {
        stack.push(element);
        if (minStack.isEmpty() || minStack.peek().compareTo(element) > 0) minStack.push(element);
        else minStack.push(minStack.peek());
    }

    public T pop() {
        minStack.pop();
        return stack.pop();
    }

    public T min() {
        return minStack.peek();
    }

    public void print() {
        System.out.println("normal stack");
        Print.stackPrint(stack);

        System.out.println("min stack");
        Print.stackPrint(minStack);
    }
}
