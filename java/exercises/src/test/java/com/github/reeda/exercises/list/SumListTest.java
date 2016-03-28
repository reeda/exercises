package com.github.reeda.exercises.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/27/16.
 */
public class SumListTest {

    @Test
    public void testSum() {
        Node<Integer> list1 = LinkedLists.generateIntegerList(7, 1, 6);
        Node<Integer> list2 = LinkedLists.generateIntegerList(5, 9, 2);

        Node<Integer> result = LinkedLists.sum(list1, list2);
        assertEquals("219", result.toString());
    }

    @Test
    public void testUnevenSize() {
        Node<Integer> list1 = LinkedLists.generateIntegerList(1);
        Node<Integer> list2 = LinkedLists.generateIntegerList(0, 1);

        Node<Integer> result = LinkedLists.sum(list1, list2);
        assertEquals("11", result.toString());
    }

    @Test
    public void testUnevenSize2() {
        Node<Integer> list1 = LinkedLists.generateIntegerList(1);
        Node<Integer> list2 = LinkedLists.generateIntegerList(9, 1);

        Node<Integer> result = LinkedLists.sum(list1, list2);
        assertEquals("02", result.toString());
    }

    @Test
    public void testUnevenSize3() {
        Node<Integer> list1 = LinkedLists.generateIntegerList(1);
        Node<Integer> list2 = LinkedLists.generateIntegerList(9, 9);

        Node<Integer> result = LinkedLists.sum(list1, list2);
        assertEquals("001", result.toString());
    }

}
