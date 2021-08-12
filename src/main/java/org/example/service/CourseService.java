package org.example.service;

import org.example.model.Course;

import java.util.Comparator;
import java.util.function.Predicate;

public class CourseService {

    public static final Predicate<Course> REVIEW_SCORE_EXAMINE1 = c -> c.getReviewScore() > 90;
    public static final Predicate<Course> REVIEW_SCORE_EXAMINE2 = c -> c.getReviewScore() > 95;
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER
            = Comparator.comparing(Course::getNumberOfStudents);
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER_REVERSE
            = Comparator.comparing(Course::getNumberOfStudents).reversed();
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED
            = Comparator.comparing(Course::getNumberOfStudents)
                .thenComparing(Course::getReviewScore).reversed();
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER_INT
            = Comparator.comparingInt(Course::getNumberOfStudents);
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER_REVERSE_INT
            = Comparator.comparingInt(Course::getNumberOfStudents).reversed();
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER_AND_REVIEW_REVERSED_INT
            = Comparator.comparingInt(Course::getNumberOfStudents)
            .thenComparingInt(Course::getReviewScore).reversed();
    public static final Comparator<Course> COMPARING_STUDENTS_NUMBER_AND_REVIEW_INT
            = Comparator.comparingInt(Course::getNumberOfStudents)
            .thenComparingInt(Course::getReviewScore);
}
