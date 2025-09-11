package bridgelabz_assignment;

import java.util.Scanner;

public class StringSplitWithoutSplit {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        index = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[index++] = word.toString();
            start = end + 1;
        }
        StringBuilder lastWord = new StringBuilder();
        for (int j = start; j < length; j++) {
            lastWord.append(text.charAt(j));
        }
        words[index] = lastWord.toString();

        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] customSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");
        boolean areEqual = compareArrays(customSplit, builtInSplit);
        System.out.println("\n--- Results ---");
        System.out.println("Original Text: " + text);

        System.out.println("\nCustom Split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result: " + (areEqual ? "Both are same" : "Different"));

        sc.close();
    }
}
