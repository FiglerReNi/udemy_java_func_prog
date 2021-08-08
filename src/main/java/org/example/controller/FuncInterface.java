package org.example.controller;

import org.example.utils.FuncInterfaceConstants;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuncInterface {

    private static final Predicate<Integer> isEvenPredicateExample = new Predicate<Integer>() {
        @Override
        public boolean test(Integer x) {
            return x % 2 == 0;
        }
    };


    private static final Function<Integer, Integer> squareFunctionExample = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
            return x * x;
        }
    };


    private static final Consumer<Integer> sysoutConsumerExample = new Consumer<Integer>() {
        @Override
        public void accept(Integer x) {
            System.out.println(x);
        }
    };


    private static final BinaryOperator<Integer> sumBinaryOperatorExample = new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer x, Integer y) {
            return x + y;
        }
    };

    public static void getSquareOfNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(FuncInterfaceConstants.IS_EVEN_PREDICATE)
                .map(FuncInterfaceConstants.SQUARE_FUNCTION)
                .forEach(FuncInterfaceConstants.SYS_OUT_CONSUMER);
    }

    public static void getSquareOfNumbersExample(List<Integer> numbers){
        numbers.stream()
                .filter(isEvenPredicateExample)
                .map(squareFunctionExample)
                .forEach(sysoutConsumerExample);
    }

    public static int getSumOfNumber(List<Integer> numbers){
        return numbers.stream()
                .reduce(0, FuncInterfaceConstants.SUM_BINARY_OPERATOR);
    }

    public static int getSumOfNumberExample(List<Integer> numbers){
        return numbers.stream()
                .reduce(0, sumBinaryOperatorExample);
    }

    public static void getNumbers(List<Integer> numbers, Predicate<Integer> predicate){
        numbers.stream()
                .filter(predicate)
                .forEach(FuncInterfaceConstants.SYS_OUT_CONSUMER);
    }

    public static List<Integer> getNumbersMultiplier(List<Integer> numbers, Function<Integer, Integer> function){
        return numbers.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public static List<String> getNumbersAsString(List<Integer> numbers){
        return numbers.stream()
                .map(FuncInterfaceConstants.STRING_OUTPUT_FUNCTION)
                .collect(Collectors.toList());
    }


}
