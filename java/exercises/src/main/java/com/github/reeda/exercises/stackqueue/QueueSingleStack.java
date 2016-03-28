package com.github.reeda.exercises.stackqueue;

import com.google.common.collect.Lists;

import java.util.Deque;

/**
 * Created by areed on 3/27/16.
 */
public class QueueSingleStack<T> {

    private Deque<T> stack = Lists.newLinkedList();

    public void enqueue(T item) {
        stack.push(item);
    }

    public T dequeue() {
        T item = stack.pop();
        if (stack.isEmpty()) {
            return item;
        }
        T returnValue = dequeue();
        stack.push(item);
        return returnValue;
    }

}
