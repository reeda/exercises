package com.github.reeda.exercises.stackqueue;

import com.google.common.collect.Lists;

import java.util.Deque;

/**
 * Created by areed on 3/27/16.
 */
public class MinStack {

    private Deque<MinWrapper> stack = Lists.newLinkedList();

    public void push(int item) {
        int min = Integer.MAX_VALUE;
        if (!stack.isEmpty()) {
            min = min();
        }
        MinWrapper newTop = new MinWrapper(item, min);
        stack.addFirst(newTop);
    }

    public int pop() {
        return stack.pop().value;
    }

    public int min() {
        return stack.peek().min;
    }

    private class MinWrapper {
        private int min;
        private int value;

        private MinWrapper(int value, int oldMin) {
            this.min = Math.min(value, oldMin);
            this.value = value;
        }
    }

}
