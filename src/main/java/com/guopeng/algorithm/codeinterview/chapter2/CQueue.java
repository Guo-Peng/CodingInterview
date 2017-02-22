package com.guopeng.algorithm.codeinterview.chapter2;


import java.util.Stack;

/**
 * Created by guopeng on 2017/2/2.
 */
public class CQueue<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(T node) {
        stack1.push(node);
    }

    /**
     * 用两个栈实现队列
     *
     * @return
     * @throws Exception
     * @comment stack1负责添加 stack2负责删除
     * 删除时stack2为空则将stack1元素按序弹出至stack2完成逆序
     */
    public T deleteHead() throws Exception {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) throw new Exception("queue is empty");

            while (!stack1.isEmpty()) stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

}
