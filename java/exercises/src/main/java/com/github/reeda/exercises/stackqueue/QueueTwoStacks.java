package com.github.reeda.exercises.stackqueue;

import com.google.common.collect.Lists;

import java.util.Deque;

/**
 * Created by areed on 3/27/16.
 */
public class QueueTwoStacks<T> {

    private Deque<T> enqueuStack = Lists.newLinkedList();
    private Deque<T> dequeueStack = Lists.newLinkedList();

    public void enqueue(T value) {
        enqueuStack.push(value);
    }

    public T dequeue() {
        if (dequeueStack.isEmpty()) {
            while (!enqueuStack.isEmpty()) {
                dequeueStack.push(enqueuStack.pop());
            }
        }
        return dequeueStack.pop();
    }
}
