package org.example.controller;

import org.example.model.Course;
import org.example.service.CourseService;

import java.util.*;
import java.util.stream.Collectors;

public class CourseController {

    public static boolean allMatchExample1(List<Course> courseList) {
        return courseList.stream()
                .allMatch(c -> c.getReviewScore() > 90);
    }

    public static boolean allMatchExample2(List<Course> courseList) {
        return courseList.stream()
                .allMatch(c -> c.getReviewScore() > 95);
    }

    public static boolean allMatchExampleWithPredicate(List<Course> courseList) {
        return courseList.stream()
                .allMatch(CourseService.REVIEW_SCORE_EXAMINE2);
    }

    public static boolean noneMatchExampleWithPredicate(List<Course> courseList) {
        return courseList.stream()
                .noneMatch(CourseService.REVIEW_SCORE_EXAMINE1);
    }

    public static boolean noneMatchExample1(List<Course> courseList) {
        return courseList.stream()
                .noneMatch(c -> c.getReviewScore() < 90);
    }

    public static boolean anyMatchExampleWithPredicate1(List<Course> courseList) {
        return courseList.stream()
                .anyMatch(CourseService.REVIEW_SCORE_EXAMINE1);
    }

    public static boolean anyMatchExampleWithPredicate2(List<Course> courseList) {
        return courseList.stream()
                .anyMatch(CourseService.REVIEW_SCORE_EXAMINE2);
    }

    public static boolean anyMatchExample(List<Course> courseList) {
        return courseList.stream()
                .anyMatch(c -> c.getReviewScore() < 90);
    }

    public static List<Course> sortedExample1(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER)
                .collect(Collectors.toList());
    }

    public static List<Course> sortedExample2(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_REVERSE)
                .collect(Collectors.toList());
    }

    public static List<Course> sortedExample3(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED)
                .collect(Collectors.toList());
    }

    public static List<Course> sortedExample4(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_INT)
                .collect(Collectors.toList());
    }

    public static List<Course> sortedExample5(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_REVERSE_INT)
                .collect(Collectors.toList());
    }

    public static List<Course> sortedExample6(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT)
                .collect(Collectors.toList());
    }

    public static List<Course> limitExample(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT)
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Course> skipExample(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT)
                .skip(1)
                .collect(Collectors.toList());
    }

    public static List<Course> skipLimitExample(List<Course> courseList) {
        return courseList.stream()
                .sorted(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT)
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
    }

    public static List<Course> takeWhileExample(List<Course> courseList) {
        return courseList.stream()
                .takeWhile(c -> c.getReviewScore() >= 95)
                .collect(Collectors.toList());

    }

    public static List<Course> dropWhileExample(List<Course> courseList) {
        return courseList.stream()
                .dropWhile(c -> c.getReviewScore() >= 95)
                .collect(Collectors.toList());

    }

    public static Optional<Course> maxExample1(List<Course> courseList) {
        return courseList.stream()
                .max(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT);
    }

    public static Optional<Course> maxExample2(List<Course> courseList) {
        return courseList.stream()
                .max(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_INT);
    }

    public static Optional<Course> minExample1(List<Course> courseList) {
        return courseList.stream()
                .min(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT);
    }

    public static Optional<Course> minExample2(List<Course> courseList) {
        return courseList.stream()
                .min(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_INT);
    }

    public static Optional<Course> maxNoResultExample1(List<Course> courseList) {
        return courseList.stream()
                .filter(c -> c.getReviewScore() < 90)
                .max(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_INT);
    }

    public static Course maxNoResultExample2(List<Course> courseList) {
        return courseList.stream()
                .filter(c -> c.getReviewScore() < 90)
                .max(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_INT)
                .orElse(new Course("Default", "Default", 0, 0));
    }

    public static Course maxNoResultExample3(List<Course> courseList) {
        return courseList.stream()
                .filter(c -> c.getReviewScore() < 90)
                .max(CourseService.COMPARING_STUDENTS_NUMBER_AND_REVIEW_INT)
                .orElseThrow(NoSuchElementException::new);
    }

    public static Optional<Course> findFirstExample(List<Course> courseList) {
        return courseList.stream()
                .filter(c -> c.getReviewScore() < 95)
                .findFirst();
    }

    public static Optional<Course> findAnyExample(List<Course> courseList) {
        return courseList.stream()
                .filter(c -> c.getReviewScore() < 95)
                .findAny();
    }

    public static int sumExample(List<Course> courseList){
        return courseList.stream()
                .filter(CourseService.REVIEW_SCORE_EXAMINE2)
                .mapToInt(Course::getNumberOfStudents)
                .sum();
    }

    public static double averageExample(List<Course> courseList){
        return courseList.stream()
                .filter(CourseService.REVIEW_SCORE_EXAMINE2)
                .mapToInt(Course::getNumberOfStudents)
                .average()
                .orElse(0);
    }

    public static long countExample(List<Course> courseList){
        return courseList.stream()
                .filter(CourseService.REVIEW_SCORE_EXAMINE2)
                .mapToInt(Course::getReviewScore)
                .count();
    }

    public static int maxExample3(List<Course> courseList){
        return courseList.stream()
                .filter(CourseService.REVIEW_SCORE_EXAMINE2)
                .mapToInt(Course::getNumberOfStudents)
                .max()
                .orElse(0);
    }

    public static Map<String,List<Course>> groupExample1(List<Course> courseList){
        return courseList.stream()
                .collect(Collectors.groupingBy(Course::getCategory));
    }

    public static Map<String,Long> groupExample2(List<Course> courseList){
        return courseList.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()));
    }

    public static Map<String,Optional<Course>> groupExample3(List<Course> courseList){
        return courseList.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore))));
    }

    public static Map<String,List<String>> groupExample4(List<Course> courseList){
        return courseList.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList())));
    }
}
