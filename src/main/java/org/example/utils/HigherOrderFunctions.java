package org.example.utils;

import org.example.model.Course;

import java.util.function.Predicate;

public class HigherOrderFunctions {

    public static final Predicate<Course> REVIEW_SCORE_EXAMINE1_TEST = getCoursePredicate(90);
    public static final Predicate<Course> REVIEW_SCORE_EXAMINE2_TEST = getCoursePredicate(95);

    private static Predicate<Course> getCoursePredicate(int reviewScore) {
        return c -> c.getReviewScore() > reviewScore;
    }
}
