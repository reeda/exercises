package com.github.reeda.exercises.stringarray;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by areed on 3/26/16.
 */
public class PermutationTest {

    @Test
    public void testIsPermutation() {
        String s1 = "abcd";
        String s2 = "acdb";
        assertTrue(StringsAndArrays.isPermutationHashMap(s1, s2));
    }

    @Test
    public void testIsPermutationWithRepeats() {
        String s1 = "abcda";
        String s2 = "aacdb";
        assertTrue(StringsAndArrays.isPermutationHashMap(s1, s2));
    }

    @Test
    public void testIsNotPermutationIfLengthDifferent() {
        String s1 = "a";
        String s2 = "ab";
        assertFalse(StringsAndArrays.isPermutationHashMap(s1, s2));
    }

    @Test
    public void testIsNotPermutationSameLength() {
        String s1 = "abcd";
        String s2 = "abce";
        assertFalse(StringsAndArrays.isPermutationHashMap(s1, s2));
    }

    @Test
    public void testIsNotPermutationSameLength2() {
        String s1 = "1234";
        String s2 = "abce";
        assertFalse(StringsAndArrays.isPermutationHashMap(s1, s2));
    }

    @Test
    public void testIsPermutationSort() {
        String s1 = "abcd";
        String s2 = "acdb";
        assertTrue(StringsAndArrays.isPermutationSort(s1, s2));
    }

    @Test
    public void testIsPermutationWithRepeatsSort() {
        String s1 = "abcda";
        String s2 = "aacdb";
        assertTrue(StringsAndArrays.isPermutationSort(s1, s2));
    }

    @Test
    public void testIsNotPermutationIfLengthDifferentSort() {
        String s1 = "a";
        String s2 = "ab";
        assertFalse(StringsAndArrays.isPermutationSort(s1, s2));
    }

    @Test
    public void testIsNotPermutationSameLengthSort() {
        String s1 = "abcd";
        String s2 = "abce";
        assertFalse(StringsAndArrays.isPermutationSort(s1, s2));
    }

    @Test
    public void testIsNotPermutationSameLength2Sort() {
        String s1 = "1234";
        String s2 = "abce";
        assertFalse(StringsAndArrays.isPermutationSort(s1, s2));
    }

}
