package com.github.reeda.exercises.stackqueue;

import com.google.common.collect.Lists;

import java.util.Deque;

/**
 * Created by areed on 3/27/16.
 */
public class StackUtils {

    public static void sortStack(Deque<Integer> stack) {
        Deque<Integer> tempStack = Lists.newLinkedList();

        while(!stack.isEmpty()) {
            Integer item = stack.pop();
            if (tempStack.isEmpty() || tempStack.peek() < item) {
                tempStack.push(item);
            } else {
                while (!tempStack.isEmpty() && tempStack.peek() > item) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(item);
            }
        }
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
