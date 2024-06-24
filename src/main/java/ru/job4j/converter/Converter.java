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

    public static float euroToRubble(float value) {
        float result = value * 70;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");
        float dollar = Converter.rubleToDollar(500);
        System.out.println("500 rubles are " + dollar + " dollars.");
        float rubleEur = Converter.euroToRubble(5);
        System.out.println("5 euros are " + rubleEur + " rubles.");
        float rubleDoll = Converter.dollarToRuble(10);
        System.out.println("10 dollars are " + rubleDoll + " rubles.");
    }
}