package com.efrei.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Container for all Movies objects
 * ArrayList
 */
public class GradeContainer {
    private static List<Grade> gradeList = null;

    public static List<Grade> getInstance() {
        if (gradeList == null)
        {
            gradeList = buildGradeList();
        }

        return gradeList;
    }

    private GradeContainer() {
    }

    private static List<Grade> buildGradeList() {
        gradeList = new ArrayList<>();

        Grade grade = new Grade(1, 70);
        Grade grade2 = new Grade(1, 80);

        gradeList.add(grade);
        gradeList.add(grade2);

        return gradeList;
    }

    public static void addGrade(Grade Grade) {
        gradeList.add(Grade);
    }
}
