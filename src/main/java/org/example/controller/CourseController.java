package org.example.controller;

import org.example.model.Course;
import org.example.utils.FuncInterfaceConstants;

import java.util.List;

public class CourseController {

    public static boolean allMatchExample1(List<Course> courseList){
        return courseList.stream()
                .allMatch(c -> c.getReviewScore() > 90);
    }

    public static boolean allMatchExample2(List<Course> courseList){
        return courseList.stream()
                .allMatch(c -> c.getReviewScore() > 95);
    }

    public static boolean allMatchExampleWithPredicate(List<Course> courseList){
        return courseList.stream()
                .allMatch(FuncInterfaceConstants.REVIEW_SCORE_EXAMINE2);
    }

    public static boolean noneMatchExampleWithPredicate(List<Course> courseList){
        return courseList.stream()
                .noneMatch(FuncInterfaceConstants.REVIEW_SCORE_EXAMINE1);
    }

    public static boolean noneMatchExample1(List<Course> courseList){
        return courseList.stream()
                .noneMatch(c -> c.getReviewScore() < 90);
    }

    public static boolean anyMatchExampleWithPredicate1(List<Course> courseList){
        return courseList.stream()
                .anyMatch(FuncInterfaceConstants.REVIEW_SCORE_EXAMINE1);
    }

    public static boolean anyMatchExampleWithPredicate2(List<Course> courseList){
        return courseList.stream()
                .anyMatch(FuncInterfaceConstants.REVIEW_SCORE_EXAMINE2);
    }

    public static boolean anyMatchExample(List<Course> courseList){
        return courseList.stream()
                .anyMatch(c -> c.getReviewScore() < 90);
    }
}
