package wrapper_class;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "xyz", null, "70"};
        List<Integer> validMarks = new ArrayList<>();
        for (Object m : marks) {
            Integer val = convertToInteger(m);
            if (val != null) {
                validMarks.add(val);
            }
        }
        System.out.println("Valid Marks: " + validMarks);
        double average = validMarks.stream()
                                   .mapToInt(Integer::intValue)
                                   .average()
                                   .orElse(0);
        System.out.println("Average Marks = " + average);
    }
    public static Integer convertToInteger(Object obj) {
        try {
            if (obj == null) return null;

            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (obj instanceof String) {
                String s = (String) obj;
                if (s.equalsIgnoreCase("null")) return null;
                return Integer.parseInt(s);
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
