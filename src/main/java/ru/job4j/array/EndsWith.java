package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index <= postfix.length - 1; index++) {
            if (postfix[index] != word[index + word.length - postfix.length]) {
                result = false;
                break;
            }
        }
        return result;
    }
}