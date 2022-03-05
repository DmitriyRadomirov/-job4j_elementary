package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
         for (int index = 0; index < 1; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1];
            array[array.length - 1] = temp;
        }

        for (int index = 1; index < 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;

            }

        return array;
    }
}