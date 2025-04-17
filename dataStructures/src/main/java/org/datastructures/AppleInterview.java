package org.datastructures;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class AppleInterview {
    public static void main(String[] args) {
        String input = "2025-04-01,E101,IN,09:00|2025-04-04,E101,OUT,09:15|2025-04-01,E101,IN,14:00|2025-04-01,E101,OUT,18:30";

        processString(input);
    }

    public static void processString(String input) {
        String[] records = input.split("\\|");
        Map<String, LocalTime> checkInMap = new HashMap<>();
        Map<String, Duration> totalDurationMap = new HashMap<>();

        for (String record : records) {
            String[] details = record.split(",");
            String date = details[0];
            String empId = details[1];
            String status = details[2];
            LocalTime time = LocalTime.parse(details[3]);

            String mapKey = date + "-" + empId;

            if ("IN".equals(status)) {
                checkInMap.put(mapKey, time);
            } else if ("OUT".equals(status)) {
                if (checkInMap.containsKey(mapKey)) {
                    Duration workDuration = Duration.between(checkInMap.get(mapKey), time);
                    totalDurationMap.put(mapKey, totalDurationMap.getOrDefault(mapKey, Duration.ZERO).plus(workDuration));
                    System.out.println(totalDurationMap);
                    checkInMap.remove(mapKey);
                } else {
                    System.out.println("Warning: OUT entry without a matching IN entry for " + mapKey);
                }
            }
        }

        for (Map.Entry<String, Duration> entry : totalDurationMap.entrySet()) {
            System.out.println(entry.getKey() + " worked for " + entry.getValue().toHours() + " hours and " + entry.getValue().toMinutesPart() + " minutes.");
        }
    }
}
