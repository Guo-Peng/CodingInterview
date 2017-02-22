package com.guopeng.algorithm.codeinterview.chapter4;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/14.
 */
public class StackPushPopOrder {
    /**
     * 第二个序列是否为该栈的弹出序列
     *
     * @param push
     * @param pop
     * @return
     * @comment 若pop的下一个数字栈顶元素则直接出栈，否则从第一个序列入栈到pop的第一个元素
     * 第一个元素已入栈但不是栈顶元素时会导致pushIndex = push.length + 1程序退出
     * 最后栈为空则为true 不为空则false
     */
    public Boolean isPopOrder(int[] push, int[] pop) {
        if (push == null || pop == null || push.length != pop.length) return false;

        Stack<Integer> pushOrder = new Stack<>();

        for (int pushIndex = 0, popIndex = 0; pushIndex <= push.length && popIndex < pop.length; popIndex++) {
            if (pushOrder.size() != 0 && pushOrder.peek() == pop[popIndex])
                pushOrder.pop();
            else {
                for (; pushIndex < push.length && push[pushIndex] != pop[popIndex]; pushIndex++) {
                    pushOrder.push(push[pushIndex]);
                }

                pushIndex++;
            }
        }

        return pushOrder.size() == 0;
    }
}
