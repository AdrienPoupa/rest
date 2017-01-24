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

        gradeList.add(new Grade(1, 70));
        gradeList.add(new Grade(1, 80));

        gradeList.add(new Grade(2, 75));
        gradeList.add(new Grade(2, 88));

        gradeList.add(new Grade(3, 74));
        gradeList.add(new Grade(3, 88));

        gradeList.add(new Grade(4, 72));
        gradeList.add(new Grade(4, 87));

        gradeList.add(new Grade(5, 55));
        gradeList.add(new Grade(5, 30));

        return gradeList;
    }

    public static void addGrade(Grade Grade) {
        gradeList.add(Grade);
    }
}
