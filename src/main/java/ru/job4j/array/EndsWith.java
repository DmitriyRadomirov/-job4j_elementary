package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
          for (int i = 0; i < post.length - 1; i++) {
            for (int j = 0; j < post.length - 1; j++) {
                if (word[word.length - 1 - i] != post[post.length - 1 - j]) {
                    result = false;
                }
            }
        }
    return result;
    }
}
