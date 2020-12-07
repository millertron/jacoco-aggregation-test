package com.millertronics.jat.english;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelperTest {

    @Test
    public void joinStringsWithSpace_returnsStringWithSpace() {
        Assertions.assertEquals("A B", Helper.joinStringsWithSpaces("A", "B"));
        Assertions.assertEquals("Foo bar", Helper.joinStringsWithSpaces("Foo", "bar"));
    }

    @Test
    public void joinStringsWithSpace_withNulls_throwsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> { Helper.joinStringsWithSpaces(null, null); });
        Assertions.assertThrows(IllegalArgumentException.class, () -> { Helper.joinStringsWithSpaces("A", null); });
        Assertions.assertThrows(IllegalArgumentException.class, () -> { Helper.joinStringsWithSpaces(null, "B"); });
    }
}
