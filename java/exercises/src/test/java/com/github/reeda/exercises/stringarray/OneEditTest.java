package com.github.reeda.exercises.stringarray;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by areed on 3/27/16.
 */
public class OneEditTest {

    @Test
    public void testNoEditsIsTrue() {
        String s1 = "pale";
        String s2 = "pale";
        assertTrue(StringsAndArrays.isOneEditAway(s1, s2));

    }

    @Test
    public void testOneDeletionIsTrue() {
        String s1 = "pales";
        String s2 = "pale";
        assertTrue(StringsAndArrays.isOneEditAway(s1, s2));
    }

    @Test
    public void testOneSubstitutionIsTrue() {
        String s1 = "pale";
        String s2 = "bale";
        assertTrue(StringsAndArrays.isOneEditAway(s1, s2));
    }

    @Test
    public void testTwoEditsIsFalse() {
        String s1 = "pale";
        String s2 = "bake";
        assertFalse(StringsAndArrays.isOneEditAway(s1, s2));
    }

}
