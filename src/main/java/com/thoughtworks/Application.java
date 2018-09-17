package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Application {
    List<Person> getPersons(String input) {
        List<String> formatNames = getFormatNames(input);
        return getSortedPersons(formatNames);
    }

    List<String> getFormatNames(String input) {
        List<String> result = new ArrayList<>();
        String[] names = input.split(",");
        for (String name : names) {
            String[] splitName = name.split(" ");
            String finalName = splitName[0].toUpperCase() + "," + splitName[1].toUpperCase();
            result.add(finalName);
        }
        return result;
    }

    List<Person> getSortedPersons(List<String> formatNames) {
        return formatNames.stream().sorted().map(Person::new).collect(Collectors.toList());
    }
}
