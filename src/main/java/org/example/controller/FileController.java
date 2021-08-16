package org.example.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileController {

    public static void workWithFile1() throws IOException {
        Files.lines(Paths.get("file.txt"))
                .forEach(System.out::println);
    }

    public static void workWithFile2() throws IOException {
        Files.lines(Paths.get("file.txt"))
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static void workWithFile3() throws IOException {
        Files.list(Paths.get("."))
                .forEach(System.out::println);
    }

    public static void workWithFile4() throws IOException {
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
