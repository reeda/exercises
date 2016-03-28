package com.github.reeda.exercises.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by areed on 3/27/16.
 */
public class KthToTheLastTest {

    @Test
    public void testThereIsNoKthToLast() {
        int k = 10;
        Node<Integer> list = LinkedLists.generateIntegerList(1, 2, 3, 4, 5, 9);
        Node<Integer> kthToLast = LinkedLists.findKthToLast(list, k);
        assertNull(kthToLast);
    }

    @Test
    public void testFindKth() {
        int expectedValue = 4;
        int k = 2;
        Node<Integer> list = LinkedLists.generateIntegerList(1, 2, 3, 4, 5, 6);
        Node<Integer> kthToLast = LinkedLists.findKthToLast(list, k);
        assertEquals(expectedValue, kthToLast.value.intValue());
    }

    @Test
    public void testFindKthIfKEqualsZero() {
        int expectedValue = 6;
        int k = 0;
        Node<Integer> list = LinkedLists.generateIntegerList(1, 2, 3, 4, 5, 6);
        Node<Integer> kthToLast = LinkedLists.findKthToLast(list, k);
        assertEquals(expectedValue, kthToLast.value.intValue());
    }

}
