package org.datastructures.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MaxArrayAvg {
    public static void main(String[] args) {
        String[][] marks = {
                {"Alice", "85"},
                {"Bob", "90"},
                {"Alice", "95"},
                {"Bob", "80"},
                {"Charlie", "88"},
                {"Charlie", "92"}
        };

        System.out.println("Maximum Average Score: " + findMaxAverage(marks));
    }

    public static double findMaxAverage(String[][] marks) {
        Map<String, List<Integer>> studentMarks = new HashMap<>();

        // Store marks in a list for each student
        for (String[] record : marks) {
            String student = record[0];
            System.out.println("Student: "+ student);
            int mark = Integer.parseInt(record[1]);
            System.out.println("Mark: "+mark);

            // Put student in map if not present
            studentMarks.putIfAbsent(student, new ArrayList<>());

            // Add mark to the student's list
            studentMarks.get(student).add(mark);
        }

        // Compute max average
        double maxAverage = 0.0;
        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            List<Integer> marksList = entry.getValue();
            System.out.println("MarksList " +marksList);
            int sum = 0;
            for (int mark : marksList) {
                sum += mark;
            }
            double average = (double) sum / marksList.size();
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
}
