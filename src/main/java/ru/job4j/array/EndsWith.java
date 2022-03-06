package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = word.length - 1; i > 0; i--) {
            for (int j = post.length - 1; j > 0; j--)
            if (word[i] == post[j] && word[i - 1] == post[j - 1]) {
                return true;
            }
        }
        return false;
    }
}