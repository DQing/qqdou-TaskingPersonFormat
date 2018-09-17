package com.thoughtworks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ApplicationTest {
    private Application application = new Application();
    @Test
    void should_get_format_list() {
        //given
        String input = "huang lizheng,zuo peixi";
        //when
        List<String> formatNames = application.getFormatNames(input);
        //then
        List<String> excepted = Arrays.asList("HUANG,LIZHENG", "ZUO,PEIXI");
        assertIterableEquals(excepted, formatNames);
    }

    @Test
    void should_get_sorted_person() {
        // given
        String input = "huang lizheng,zuo peixi";
        List<String> formatNames = new Application().getFormatNames(input);
        // when
        List<Person> persons = application.getSortedPersons(formatNames);
        //then
        List<Person> excepted = Arrays.asList(new Person("HUANG,LIZHENG"), new Person("ZUO,PEIXI"));
        assertIterableEquals(excepted, persons);
    }

    @Test
    void should_get_person_name_sort_and_format() {
        String input = "huang lizheng,zuo peixi,dou qingqing,liu yanping";
        List<Person> peoples = application.getPersons(input);
        List<Person> excepted = Arrays.asList(new Person("DOU,QINGQING")
                , new Person("HUANG,LIZHENG")
                , new Person("LIU,YANPING")
                , new Person("ZUO,PEIXI"));
        assertIterableEquals(excepted, peoples);
    }
}
