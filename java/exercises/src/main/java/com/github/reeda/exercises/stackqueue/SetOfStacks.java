package com.github.reeda.exercises.stackqueue;

import com.google.common.collect.Lists;

import java.util.Deque;
import java.util.List;

/**
 * Created by areed on 3/27/16.
 */
public class SetOfStacks<T> {

    private int maxSize;

    private List<Deque<T>> setOfStacks = Lists.newArrayList();

    public SetOfStacks(int maxSize) {
        this.maxSize = maxSize;
    }

    public T pop() {
        Deque<T> currentStack = setOfStacks.get(setOfStacks.size() - 1);
        T item = currentStack.pop();
        if (currentStack.isEmpty()) {
            setOfStacks.remove(setOfStacks.size() - 1);
        }
        return item;
    }

    public void push(T item) {
        Deque<T> currentStack = setOfStacks.get(setOfStacks.size() - 1);
        if (currentStack.size() == maxSize) {
            Deque<T> newStack = Lists.newLinkedList();
            newStack.push(item);
            setOfStacks.add(newStack);
        } else {
            currentStack.push(item);
        }
    }

}
