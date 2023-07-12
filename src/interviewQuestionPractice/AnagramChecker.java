package interviewQuestionPractice;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and punctuation, and convert to lowercase
        String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Convert strings to character arrays
        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();

        // Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
