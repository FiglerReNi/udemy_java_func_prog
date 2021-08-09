package org.example;

import org.example.controller.CourseController;
import org.example.controller.MethodRef;
import org.example.model.Course;
import org.example.utils.FuncInterfaceConstants;
import org.example.controller.FuncProg;
import org.example.controller.FuncInterface;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "Api", "Microservices", "AWS", "PCF", "Azure", "Docker");
        List<Course> coursesList = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("Fullstack", "Fullstack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

/*
        System.out.println(CourseController.anyMatchExampleWithPredicate1(coursesList));
        System.out.println(CourseController.anyMatchExampleWithPredicate2(coursesList));
        System.out.println(CourseController.anyMatchExample(coursesList));
        System.out.println(CourseController.noneMatchExampleWithPredicate(coursesList));
        System.out.println(CourseController.noneMatchExample1(coursesList));
        System.out.println(CourseController.allMatchExample1(coursesList));
        System.out.println(CourseController.allMatchExample2(coursesList));
        System.out.println(CourseController.allMatchExampleWithPredicate(coursesList));

        MethodRef.doUpperCaseWithLambda(courses);
        MethodRef.doUpperCaseWithMethodRef(courses);
        MethodRef.doUpperCaseWithStaticMethod(courses);

        System.out.println(FuncInterface.getSumOfNumber(numbers));
        System.out.println(FuncInterfaceConstants.SUM_INT_BINARY_OPERATOR.applyAsInt(5,7));
        System.out.println(FuncInterface.getSumOfNumberExample(numbers));
        FuncInterface.getSquareOfNumbers(numbers);
        FuncInterface.getSquareOfNumbersExample(numbers);
        FuncInterface.getNumbers(numbers, FuncInterfaceConstants.IS_EVEN_PREDICATE);
        FuncInterface.getNumbers(numbers, FuncInterfaceConstants.IS_ODD_PREDICATE);
        FuncInterface.getNumbers(numbers, FuncInterfaceConstants.IS_THREE_MULTIPLIER_PREDICATE);
        System.out.println(FuncInterfaceConstants.IS_THREE_MULTIPLIER_INT_PREDICATE.test(3));
        FuncInterfaceConstants.SYS_OUT_INT_CONSUMER.accept(3);
        System.out.println(FuncInterface.getNumbersMultiplier(numbers, FuncInterfaceConstants.SQUARE_FUNCTION));
        System.out.println(FuncInterfaceConstants.SQUARE_FUNCTION_WITH_TYPE.apply(3));
        System.out.println(FuncInterface.getNumbersMultiplier(numbers, FuncInterfaceConstants.CUBE_FUNCTION));
        System.out.println(FuncInterface.getNumbersMultiplier(numbers, FuncInterfaceConstants.DOUBLE_FUNCTION));
        System.out.println(FuncInterface.getNumbersAsString(numbers));
        System.out.println(FuncInterfaceConstants.STRING_OUTPUT_INT_FUNCTION.apply(3));
        System.out.println(FuncInterfaceConstants.INTEGER_SUPPLIER.get());
        System.out.println(FuncInterfaceConstants.INT_SUPPLIER.getAsInt());
        System.out.println(FuncInterfaceConstants.RANDOM_INTEGER_SUPPLIER.get());
        System.out.println(FuncInterfaceConstants.UNARY_OPERATOR.apply(10));
        System.out.println(FuncInterfaceConstants.UNARY_INT_OPERATOR.applyAsInt(10));
        System.out.println(FuncInterfaceConstants.BI_PREDICATE.test(5, "beautiful"));
        System.out.println(FuncInterfaceConstants.BI_FUNCTION.apply(5, "beautiful"));
        FuncInterfaceConstants.BI_CONSUMER.accept(5, "beautiful");

        FuncProg.printAllNumbersInListStructured(numbers);
        FuncProg.printAllNumbersInListFunctional(numbers);
        FuncProg.printAllNumbersInListFunctionalSimpler(numbers);
        FuncProg.printEvenNumbersInListStructured(numbers);
        FuncProg.printEvenNumbersInListFunctional(numbers);
        FuncProg.printEvenNumbersInListFunctionalSimpler(numbers);
        FuncProg.printOddNumbersInList(numbers);
        FuncProg.printCoursesInList(courses);
        FuncProg.printCoursesInListFilterByCharacters(courses);
        FuncProg.printCoursesInListFilterByLength(courses);
        FuncProg.printSquaresOfEvenNumbers(numbers);
        FuncProg.printCubesOfOddNumbers(numbers);
        FuncProg.printNumberOfCoursesCharacter(courses);
        FuncProg.printNumberOfCoursesLength(courses);
        System.out.println(FuncProg.makeSumOfListOfNumbersStructured(numbers));
        System.out.println(FuncProg.makeSumOfListOfNumbersFunctional(numbers));
        System.out.println(FuncProg.makeSumOfListOfNumbersFunctionalSimpler(numbers));
        System.out.println(FuncProg.makeSumOfListOfNumbers(numbers));
        System.out.println(FuncProg.tryReduce1(numbers));
        System.out.println(FuncProg.tryReduce2(numbers));
        System.out.println(FuncProg.findMaxValueFromPositiveNumber(numbers));
        System.out.println(FuncProg.findMaxValue(numbers));
        System.out.println(FuncProg.findMinValue(numbers));
        System.out.println(FuncProg.makeSumOfNumbersSquare(numbers));
        System.out.println(FuncProg.makeSumOfNumbersCube(numbers));
        System.out.println(FuncProg.makeSumOfOddNumbers(numbers));
        System.out.println(FuncProg.makeSumOfEvenNumbers(numbers));
        FuncProg.printDistinctNumbers(numbers);
        FuncProg.printSortedNumbers(numbers);
        FuncProg.printDistinctSortedNumbers(numbers);
        FuncProg.printSortedCourses(courses);
        FuncProg.printSortedNaturalOrderOfCourses(courses);
        FuncProg.printSortedReverseOrderOfCourses(courses);
        FuncProg.printSortedLengthOfCourseName1(courses);
        FuncProg.printSortedLengthOfCourseName2(courses);
        List<Integer> squareNumbers = FuncProg.makeSquareOfNumbersList(numbers);
        System.out.println(squareNumbers);
        List<Integer> evenNumbers = FuncProg.makeEvenNumbersList(numbers);
        System.out.println(evenNumbers);
        List<Integer> lengthOfCourses = FuncProg.makeLengthOfCourseList(courses);
        System.out.println(lengthOfCourses);
 */
    }
}
