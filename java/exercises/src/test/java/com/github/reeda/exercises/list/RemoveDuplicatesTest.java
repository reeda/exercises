package com.github.reeda.exercises.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/27/16.
 */
public class RemoveDuplicatesTest {

    @Test
    public void testNoDuplicatesIsIntactSet() {
        Node<Integer> noDuplicates = LinkedLists.generateIntegerList(1, 2, 3, 4, 5, 9);
        LinkedLists.removeDuplicatesSet(noDuplicates);
        assertEquals("123459", noDuplicates.toString());
    }

    @Test
    public void testDuplicateOfHeadSet() {
        Node<Integer> head = LinkedLists.generateIntegerList(1, 1, 3, 4, 5, 9);
        LinkedLists.removeDuplicatesSet(head);
        assertEquals("13459", head.toString());
    }

    @Test
    public void testDuplicateInMiddleSet() {
        Node<Integer> head = LinkedLists.generateIntegerList(1, 2, 3, 3, 5, 9);
        LinkedLists.removeDuplicatesSet(head);
        assertEquals("12359", head.toString());
    }

    @Test
    public void testAllDuplicatesSet() {
        Node<Integer> head = LinkedLists.generateIntegerList(1, 1, 1, 1, 1, 1, 1);
        LinkedLists.removeDuplicatesSet(head);
        assertEquals("1", head.toString());
    }

    @Test
    public void testNoDuplicatesIsIntactDoublePointer() {
        Node<Integer> noDuplicates = LinkedLists.generateIntegerList(1, 2, 3, 4, 5, 9);
        LinkedLists.removeDuplicatesDoublePointer(noDuplicates);
        assertEquals("123459", noDuplicates.toString());
    }

    @Test
    public void testDuplicateOfHeadDoublePointer() {
        Node<Integer> head = LinkedLists.generateIntegerList(1, 1, 3, 4, 5, 9);
        LinkedLists.removeDuplicatesDoublePointer(head);
        assertEquals("13459", head.toString());
    }

    @Test
    public void testDuplicateInMiddleDoublePointer() {
        Node<Integer> head = LinkedLists.generateIntegerList(1, 2, 3, 3, 5, 9);
        LinkedLists.removeDuplicatesDoublePointer(head);
        assertEquals("12359", head.toString());
    }

    @Test
    public void testAllDuplicatesDoublePointer() {
        Node<Integer> head = LinkedLists.generateIntegerList(1, 1, 1, 1, 1, 1, 1);
        LinkedLists.removeDuplicatesDoublePointer(head);
        assertEquals("1", head.toString());
    }



}
