package com.github.reeda.exercises.stackqueue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/27/16.
 */
public class StackMinTest {

    @Test
    public void testMinOfOneItem() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        assertEquals(1, minStack.min());
    }

    @Test
    public void testMinTop() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1);
        assertEquals(1, minStack.min());
    }

    @Test
    public void testMinChangesWhenMinPopped() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1);
        minStack.pop();
        assertEquals(2, minStack.min());
    }

    @Test
    public void testMinAtBottom() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        assertEquals(1, minStack.min());
    }



}
