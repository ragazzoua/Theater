package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented");
        languages.put("Python", "an interpreteted, object-oriented");
        languages.put("Algol", "an algoritmic languages");
        languages.put("BASIC", "Beginers All purposes");
        languages.put("Lisp", "Therein lies madnes");

        if (languages.containsKey("Java")) {
            System.out.println("java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("========================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algoritmic languages1")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if (languages.replace("Lisp","Therein lies madnes", "a functional programing language")){
            System.out.println("Lisp replaced");
        }
        else {
            System.out.println("Lisp was not replaced");
        }
        //System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
