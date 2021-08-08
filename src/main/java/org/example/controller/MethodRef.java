package org.example.controller;

import org.example.service.MethodRefService;

import java.util.List;
import java.util.function.Supplier;

public class MethodRef {

    private final Supplier<String> supplier = () -> new String();
    private final Supplier<String> supplierWithMethodRef = String::new;

    public static void doUpperCaseWithLambda(List<String> courses){
        courses.stream()
                .map(c -> c.toUpperCase())
                .forEach(c -> System.out.println(c));
    }

    public static void doUpperCaseWithStaticMethod(List<String> courses){
        courses.stream()
                .map(c -> c.toUpperCase())
                .forEach(MethodRefService::print);
    }
    public static void doUpperCaseWithMethodRef(List<String> courses){
        courses.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


}
