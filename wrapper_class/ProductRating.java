package wrapper_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProductRating {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3, 2, 5};
        ArrayList<Integer> newRatings = new ArrayList<>(
                Arrays.asList(5, null, 4, 3, null, 5)
        );
        ArrayList<Integer> combined = new ArrayList<>();
        for (int r : oldRatings) {
            combined.add(r);
        }
        combined.addAll(newRatings);
        System.out.println("Combined Ratings (with nulls): " + combined);
        List<Integer> validRatings = combined.stream()
                .filter(Objects::nonNull)
                .toList();
        System.out.println("Valid Ratings: " + validRatings);
        double sum = 0;
        for (int val : validRatings) {
            sum += val;
        }
        double average = validRatings.isEmpty() ? 0 : sum / validRatings.size();
        System.out.println("Average Rating: " + average);
    }
}
