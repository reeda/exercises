package com.github.reeda.exercises.stringarray;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by areed on 3/26/16.
 */
public class PalindromePermutationTest {

    @Test
    public void testTactCoa() {
        String input = "Tact Coa";
        assertTrue(StringsAndArrays.isPalindromePermutation(input));
    }

}
