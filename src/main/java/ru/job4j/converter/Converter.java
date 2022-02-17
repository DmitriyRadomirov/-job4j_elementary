package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
            float in = 140;
            float expectedE = 2;
            float outE = Converter.rubleToEuro(in);
            boolean passedE = expectedE == outE;
            System.out.println("140 rubles are 2. Test result : " + passedE);
            float expectedD = 2.3333333f;
            float outD = Converter.rubleToDollar(in);
            boolean passedD = expectedD == outD;
            System.out.println("140 rubles are 2. Test result : " + passedD);
    }
}
