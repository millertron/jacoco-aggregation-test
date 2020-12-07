package com.millertronics.jat.english;

import org.apache.commons.lang3.StringUtils;

public class Helper {

    public static String joinStringsWithSpaces(String a, String b) {
        if (StringUtils.isNotBlank(a) && StringUtils.isNotBlank(b)) {
            return a + " " + b;
        }
        throw new IllegalArgumentException();
    }
}

