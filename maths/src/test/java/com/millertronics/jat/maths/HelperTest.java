package com.millertronics.jat.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelperTest {

    @Test
    public void add_with_positive_numbers() {
        Assertions.assertEquals(5, Helper.add(2, 3));
        Assertions.assertEquals(8, Helper.add(1, 7));
        Assertions.assertEquals(52, Helper.add(20, 32));
        Assertions.assertEquals(62, Helper.add(25, 37));
        Assertions.assertEquals(105, Helper.add(62, 43));
    }
}
