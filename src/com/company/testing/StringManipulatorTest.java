package com.company.testing;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

class StringManipulator {
    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}

public class StringManipulatorTest {
    @Test
    public void testConcatenateStrings() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.concatenateStrings("Hello", "World");
        assertEquals("HelloWorld", result);
    }

}
