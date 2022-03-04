package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[4];
        surnames[0] = "Spartak";
        surnames[1] = "Ben";
        surnames[2] = "Iggi";
        surnames[3] = "Harry";
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);

    }
}
