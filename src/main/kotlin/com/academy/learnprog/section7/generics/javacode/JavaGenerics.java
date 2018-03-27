package com.academy.learnprog.section7.generics.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        // list.add(new BigDecimal(10.5)); // compile time error
        list.get(0).toUpperCase();

        List list1 = new ArrayList<>(); // bad practice to not specify the type
        list.add("Goodbye");

        // === Type Erasure ===
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        // This is the best we can do, we can't check if strings instanceof List<String>
        boolean b = strings instanceof List;
    }
}
