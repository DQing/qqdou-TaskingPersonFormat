package com.thoughtworks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class PersonUtilTest {
    private PersonUtil personUtil = new PersonUtil();
    @Test
    void should_get_format_list() {
        String input = "huang lizheng,zuo peixi";
        List<String> formatNames = personUtil.getFormatNames(input);
        List<String> excepted = Arrays.asList("HUANG,LIZHENG", "ZUO,PEIXI");
        assertIterableEquals(excepted, formatNames);
    }

    @Test
    void should_get_sorted_person() {
        String input = "huang lizheng,zuo peixi";
        List<String> formatNames = new PersonUtil().getFormatNames(input);
        List<Person> persons = personUtil.getSortedPersons(formatNames);
        List<Person> excepted = Arrays.asList(new Person("HUANG,LIZHENG"), new Person("ZUO,PEIXI"));
        assertIterableEquals(excepted, persons);
    }

    @Test
    void should_get_person_name_sort_and_format() {
        String input = "huang lizheng,zuo peixi,dou qingqing,liu yanping";
        List<Person> peoples = personUtil.getPersons(input);
        List<Person> excepted = Arrays.asList(new Person("DOU,QINGQING")
                , new Person("HUANG,LIZHENG")
                , new Person("LIU,YANPING")
                , new Person("ZUO,PEIXI"));
        assertIterableEquals(excepted, peoples);
    }
}
