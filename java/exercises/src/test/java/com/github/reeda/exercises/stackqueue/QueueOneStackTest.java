package com.github.reeda.exercises.stackqueue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/27/16.
 */
public class QueueOneStackTest {

    @Test
    public void testOneItem() {
        QueueTwoStacks<Integer> queue = new QueueTwoStacks<Integer>();
        queue.enqueue(1);
        assertEquals(1, queue.dequeue().intValue());
    }

    @Test
    public void testTwoItems() {
        QueueTwoStacks<Integer> queue = new QueueTwoStacks<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue().intValue());
        assertEquals(2, queue.dequeue().intValue());
    }

    @Test
    public void testEnqueueDequeueEnqueueDequeue() {
        QueueTwoStacks<Integer> queue = new QueueTwoStacks<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue().intValue());
        queue.enqueue(3);
        assertEquals(2, queue.dequeue().intValue());
        assertEquals(3, queue.dequeue().intValue());
    }
}
