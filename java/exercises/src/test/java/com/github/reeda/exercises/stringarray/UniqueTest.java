package com.github.reeda.exercises.stringarray;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by areed on 3/26/16.
 */
public class UniqueTest {

    @Test
    public void testAllUniqueHash() {
        String allUniqueString = "abcdefg";
        assertTrue(StringsAndArrays.isUniqueHashSet(allUniqueString));
    }

    @Test
    public void testNotUniqueHash() {
        String allUniqueString = "aabcdefg";
        assertFalse(StringsAndArrays.isUniqueHashSet(allUniqueString));
    }

    @Test
    public void testNotUnique2Hash() {
        String allUniqueString = "abcdefga";
        assertFalse(StringsAndArrays.isUniqueHashSet(allUniqueString));
    }

    @Test
    public void testAllUniqueSort() {
        String allUniqueString = "abcdefg";
        assertTrue(StringsAndArrays.isUniqueSort(allUniqueString));
        assertTrue(StringsAndArrays.isUniqueSort(allUniqueString));
    }

    @Test
    public void testNotUniqueSort() {
        String allUniqueString = "aabcdefg";
        assertFalse(StringsAndArrays.isUniqueSort(allUniqueString));
    }

    @Test
    public void testNotUnique2Sort() {
        String allUniqueString = "abcdefga";
        assertFalse(StringsAndArrays.isUniqueSort(allUniqueString));
    }

}
