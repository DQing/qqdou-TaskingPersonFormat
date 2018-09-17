package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

class Application {
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
}
