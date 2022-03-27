package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int rst2 = max(first, second);
        return  max(rst2, third);
    }

    public static int max(int first, int second, int third, int four) {
        int rst2 = max(first, second, third);
              return max(rst2, four);
    }
}
