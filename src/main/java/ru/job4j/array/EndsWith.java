package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int difference = word.length - postfix.length;
        for (int index = postfix.length - 1; index >= 0; index--) {
            if (postfix[index] != word[index + difference]) {
                result = false;
                    break;
            }
        }
        return result;
    }
}