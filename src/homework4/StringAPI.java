package homework4;

import static homework4.Constants.*;

class StringAPI {

//    Exercise #1

    String getCharAtIndex(String input, int k) {
        if (input == null || input.isEmpty()) {
            return OUT_OF_BOUNDS;
        }

        if (k < 0 || k > input.length()) {
            return OUT_OF_BOUNDS;
        }

        return String.valueOf(input.charAt(k));

    }

//    Exercise #4

    String checkBrackets(String input) {
        if (input == null || input.isEmpty()) {
            return INVALID;
        }
        int length = input.length();
        if (length % 2 != 0) {
            return INVALID;
        }

        if (input.matches("[()]+")) {
            if (input.replace(")", "").length() == length / 2) {
                return VALID;
            } else {
                return INVALID;
            }
        } else {
            return INVALID;
        }
    }

    //    Exercise #9

    String[] divideString(String input, int part) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        if (part <= 0 || input.length() / part != 0) {
            return null;
        }
        int partSize = input.length() / part;
        String[] parts = new String[part];
        int index = 0;

        for (int i = 0; i < input.length(); i += partSize) {

            parts[index] = input.substring(i, i + partSize);
            index++;
        }
        return parts;
    }

    //    Exercise #2

    int getNumberOfWords(String input) {
        if (input == null || input.isEmpty()) {
            return Integer.parseInt(OUT_OF_BOUNDS);
        }
        String[] test = input.split(" ");
        for (String a : test)
            System.out.println(a);
        return test.length;
    }

    //    Exercise #3

    boolean isStringPalindrome(String input) {

        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            if (input.charAt(i) != input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    //    Exercise #5

    boolean containsXSequence(String str1, String str2) {
        if (str1 == null || str1.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        return str1.contains(str2);
    }

    //    Exercise #6

    boolean startsWithXChars(String str1, String str2) {
        if (str1 == null || str1.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        return str1.startsWith(str2);
    }

    //    Exercise #7

    boolean endsWithXChars(String str1, String str2) {
        if (str1 == null || str1.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        return str1.endsWith(str2);
    }

    //    Exercise #10

    String reverseString(String str) {
        if ((str == null) || (str.length() <= 1))
            return OUT_OF_BOUNDS;
        else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
            return str;
        }
    }
}

