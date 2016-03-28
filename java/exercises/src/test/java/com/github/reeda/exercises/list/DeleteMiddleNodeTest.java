package com.github.reeda.exercises.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/27/16.
 */
public class DeleteMiddleNodeTest {

    @Test
    public void testDeleteMiddle() {
        int toDeleteValue = 2;
        Node<Integer> list = LinkedLists.generateIntegerList(1, 2, 3, 4, 5, 6);
        Node<Integer> deleteMe = list;
        while(deleteMe.value != toDeleteValue) {
            deleteMe = deleteMe.next;
        }
        LinkedLists.deleteMe(deleteMe);
        assertEquals("13456", list.toString());
    }

}
