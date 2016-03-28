package com.github.reeda.exercises.stackqueue;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Deque;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/27/16.
 */
public class StackSortTest {

    @Test
    public void testSingleItem() {
        Deque<Integer> stack = Lists.newLinkedList();
        stack.addFirst(1);
        StackUtils.sortStack(stack);
        assertEquals(1, stack.removeFirst().intValue());
    }

    @Test
    public void testOutOfOrder() {
        Deque<Integer> stack = Lists.newLinkedList();
        stack.addFirst(10);
        stack.addFirst(0);
        stack.addFirst(2);
        stack.addFirst(9);
        stack.addFirst(5);

        StackUtils.sortStack(stack);

        assertEquals(0, stack.removeFirst().intValue());
        assertEquals(2, stack.removeFirst().intValue());
        assertEquals(5, stack.removeFirst().intValue());
        assertEquals(9, stack.removeFirst().intValue());
        assertEquals(10, stack.removeFirst().intValue());
    }

}
