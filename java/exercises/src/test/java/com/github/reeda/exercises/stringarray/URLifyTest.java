package com.github.reeda.exercises.stringarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by areed on 3/26/16.
 */
public class URLifyTest {

    @Test
    public void testJohnSmith() {
        String input = "Mr John Smith    ";
        String expected = "Mr%20John%20Smith";

        String actual = new String(StringsAndArrays.URLify(input.toCharArray()));
        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpaces() {
        String input = "12345";
        String expected = "12345";

        String actual = new String(StringsAndArrays.URLify(input.toCharArray()));
        assertEquals(expected, actual);
    }


}
