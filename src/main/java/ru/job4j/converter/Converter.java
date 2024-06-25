package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float euroToRuble(float value) {
        float result = value * 70;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);
        input = 3;
        expected = 210;
        output = Converter.euroToRuble(input);
        passed = expected == output;
        System.out.println("3 euros are 210 rubles. Test result : " + passed);
        input = 6;
        expected = 360;
        output = Converter.dollarToRuble(input);
        passed = expected == output;
        System.out.println("6 dollars are 360 rubles. Test result : " + passed);
    }

}
