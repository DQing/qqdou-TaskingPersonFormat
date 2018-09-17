package com.thoughtworks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ApplicationTest {
    @Test
    void should_get_format_list() {
        //given
        String input = "huang lizheng,zuo peixi";
        //when
        List<String> stringList = new Application().getFormatNames(input);
        //then
        List<String> excepted = Arrays.asList("HUANG,LIZHENG", "ZUO,PEIXI");
        assertIterableEquals(excepted, stringList);
    }
}
