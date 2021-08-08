package org.example.utils;

import java.util.Random;
import java.util.function.*;

public class FuncInterfaceConstants {

    public static final Predicate<Integer> IS_ODD_PREDICATE = x -> x % 2 != 0;
    public static final Predicate<Integer> IS_EVEN_PREDICATE = x -> x % 2 == 0;
    public static final Predicate<Integer> IS_THREE_MULTIPLIER_PREDICATE = x -> x % 3 == 0;
    public static final IntPredicate IS_THREE_MULTIPLIER_INT_PREDICATE = x -> x % 3 == 0;
    public static final Function<Integer, Integer> SQUARE_FUNCTION = x -> x * x;
    public static final Function<Integer, Integer> SQUARE_FUNCTION_WITH_TYPE = (Integer x) -> x * x;
    public static final Function<Integer, Integer> CUBE_FUNCTION = x -> x * x * x;
    public static final Function<Integer, Integer> DOUBLE_FUNCTION = x -> x + x;
    public static final Function<Integer, String> STRING_OUTPUT_FUNCTION = x -> x + " ";
    public static final IntFunction<String> STRING_OUTPUT_INT_FUNCTION = x -> x + " ";
    public static final Consumer<Integer> SYS_OUT_CONSUMER = System.out::println;
    public static final IntConsumer SYS_OUT_INT_CONSUMER = System.out::println;
    public static final BinaryOperator<Integer> SUM_BINARY_OPERATOR = Integer::sum;
    public static final IntBinaryOperator SUM_INT_BINARY_OPERATOR = Integer::sum;
    public static final Supplier<Integer> INTEGER_SUPPLIER = () -> 2;
    public static final IntSupplier INT_SUPPLIER = () -> 2;
    public static final Supplier<Integer> RANDOM_INTEGER_SUPPLIER = () -> {
        Random random = new Random();
        return random.nextInt(1000);
    };
    public static final UnaryOperator<Integer> UNARY_OPERATOR = x -> 3 * x;
    public static final IntUnaryOperator UNARY_INT_OPERATOR = x -> 3 * x;
    public static final BiPredicate<Integer, String> BI_PREDICATE = (x, str) -> x > str.length();
    public static final BiFunction<Integer, String, Integer> BI_FUNCTION = (x, str) -> x + str.length();
    public static final BiConsumer<Integer, String> BI_CONSUMER= (x, str) -> System.out.println(x + " " + str);
}
