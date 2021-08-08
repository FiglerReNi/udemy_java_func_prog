package org.example.controller;

import org.example.service.FuncProgService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FuncProg {

    public static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers)
            System.out.println(number);
    }

    public static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FuncProgService::print);
    }

    public static void printAllNumbersInListFunctionalSimpler(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

    public static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }

    public static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FuncProgService::isEven)
                .forEach(System.out::println);
    }

    public static void printEvenNumbersInListFunctionalSimpler(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void printOddNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }

    public static void printCoursesInList(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    public static void printCoursesInListFilterByCharacters(List<String> courses) {
        courses.stream()
                .filter(c -> c.contains("Spring"))
                .forEach(System.out::println);
    }

    public static void printCoursesInListFilterByLength(List<String> courses) {
        courses.stream()
                .filter(c -> c.length() >= 4)
                .forEach(System.out::println);
    }

    public static void printSquaresOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    public static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .forEach(System.out::println);
    }

    public static void printNumberOfCoursesCharacter(List<String> courses) {
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void printNumberOfCoursesLength(List<String> courses) {
        courses.stream()
                .map(c -> c + " " + c.length())
                .forEach(System.out::println);
    }

    public static int makeSumOfListOfNumbersStructured(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int makeSumOfListOfNumbersFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, FuncProgService::sum);
    }

    public static int makeSumOfListOfNumbersFunctionalSimpler(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public static int makeSumOfListOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static int tryReduce1(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a);
    }

    public static int tryReduce2(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> b);
    }

    //pozitív számokra működik, mert 0 a referencia (kezdő érték)
    public static int findMaxValueFromPositiveNumber(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
    }

    public static int findMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
    }

    public static int findMinValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
    }

    public static int makeSumOfNumbersSquare(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
    }

    public static int makeSumOfNumbersCube(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n * n)
                .reduce(0, Integer::sum);
    }

    public static int makeSumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);
    }

    public static int makeSumOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
    }

    public static void printDistinctNumbers(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void printSortedNumbers(List<Integer> numbers) {
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void printDistinctSortedNumbers(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static void printSortedCourses(List<String> courses){
        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void printSortedNaturalOrderOfCourses(List<String> courses){
        courses.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void printSortedReverseOrderOfCourses(List<String> courses){
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    public static void printSortedLengthOfCourseName1(List<String> courses){
        courses.stream()
                .sorted(Comparator.comparing((c -> c.length())))
                .forEach(System.out::println);
    }

    public static void printSortedLengthOfCourseName2(List<String> courses){
        courses.stream()
                .sorted(Comparator.comparing((String::length)))
                .forEach(System.out::println);
    }

    public static List<Integer> makeSquareOfNumbersList(List<Integer> numbers){
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<Integer> makeEvenNumbersList(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> makeLengthOfCourseList(List<String> courses){
        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
}
