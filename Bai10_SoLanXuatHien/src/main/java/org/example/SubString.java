package org.example;

public class SubString {
    public static int countSubstring(String str, String substr) {
        if (str == null || substr == null || substr.isEmpty()) {
            return -1;
        }
        int count = 0;
        int index = 0;
        while (index <= str.length() - substr.length()) {
            boolean match = true;
            for (int i = 0; i < substr.length(); i++) {
                if (str.charAt(index + i) != substr.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
                index++;
            } else {
                index++;
            }
        }

        return count;
    }
}
