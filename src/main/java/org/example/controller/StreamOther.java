package org.example.controller;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOther {

    public static long createStreamAndCount(){
        return Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count();
    }

    public static long createStreamAndSum(){
        return Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum);
    }

    public static void streamReferenceOrPrimitive(List<Integer> numbers){
        System.out.println(numbers.stream());
        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
        System.out.println(Arrays.toString(numberArray));
        System.out.println(Arrays.stream(numberArray));
    }

    public static void streamWithArray(){
        int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
        System.out.println(Arrays.stream(numberArray).count());
        System.out.println(Arrays.stream(numberArray).sum());
        System.out.println(Arrays.stream(numberArray).average());
        System.out.println(Arrays.stream(numberArray).min());
        System.out.println(Arrays.stream(numberArray).max());
    }

    public static void dynamicStream1(){
        IntStream.range(0,101).forEach(System.out::println);
        IntStream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
    }

    public static void dynamicStream2(){
        System.out.println(IntStream.range(0,10).sum());
        System.out.println(IntStream.rangeClosed(0,10).sum());
    }

    public static void dynamicStream3(){
        System.out.println(IntStream.iterate(1, n -> n + 2).limit(10).peek(System.out::println).sum());
        System.out.println(IntStream.iterate(2, n -> n + 2).limit(10).peek(System.out::println).sum());
    }

    public static void dynamicStream4(){
        System.out.println(IntStream.iterate(2, n -> n * 2).limit(10).peek(System.out::println).sum());
    }

    public static void intStreamToList(){
        System.out.println(IntStream.iterate(2, n -> n * 2).limit(10).boxed().collect(Collectors.toList()));
    }

    public static void dynamicStream5(){
        System.out.println(IntStream.rangeClosed(1,50).reduce(1, (x,y)-> x*y));
        System.out.println(LongStream.rangeClosed(1,50).reduce(1, (x, y)-> x*y));
        System.out.println(LongStream.rangeClosed(1,20).reduce(1, (x, y)-> x*y));
    }

    public static void bigInteger(){
        System.out.println(LongStream.rangeClosed(1,40)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply));
    }

    public static String streamStringJoining(List<String> courses){
        return courses.stream()
                .collect(Collectors.joining(", "));
    }

    public static String stringJoining(List<String> courses){
        return String.join(", ", courses);
    }

    public static List<String> stringExample1(List<String> courses){
        return courses.stream()
                .map(c -> c.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<List<String>> stringExample2(List<String> courses, List<String> coursesCopy){
        return courses.stream()
                .flatMap(c -> coursesCopy.stream().map(c2 -> List.of(c, c2)))
                .collect(Collectors.toList());
    }

    public static List<List<String>> stringExample3(List<String> courses, List<String> coursesCopy){
        return courses.stream()
                .flatMap(c -> coursesCopy.stream().map(c2 -> List.of(c, c2)))
                .filter(l -> !(l.get(0).equals(l.get(1))))
                .collect(Collectors.toList());
    }

    public static List<List<String>> stringExample4(List<String> courses, List<String> coursesCopy){
        return courses.stream()
                .flatMap(c -> coursesCopy.stream().filter(c2 -> c2.length() == c.length()).map(c2 -> List.of(c, c2)))
                .filter(l -> !(l.get(0).equals(l.get(1))))
                .collect(Collectors.toList());
    }

    public static List<String> stringExample5(List<String> courses){
        courses.replaceAll(String::toUpperCase);
        return courses;
    }

    public static List<String> stringExample6(List<String> courses){
        courses.removeIf(c -> c.length() < 6);
        return courses;
    }

    public static String intermediateOperationWorks1(List<String> courses){
        return courses.stream()
                .peek(System.out::println)
                .filter( c -> c.length() > 11)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .findFirst()
                .orElse(null);
    }

    public static List<String> intermediateOperationWorks2(List<String> courses){
        return courses.stream()
                .peek(System.out::println)
                .filter( c -> c.length() > 11)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static long parallelExample1(){
        return LongStream.range(0, 1000000000).sum();
    }

    public static long parallelExample2(){
        return LongStream.range(0, 1000000000).parallel().sum();
    }


}
