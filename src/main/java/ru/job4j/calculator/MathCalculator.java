package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double fourOperationsSum(double first, double second) {
        return difference(first, second)
                + division(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + differenceAndDivision(10, 2));
        System.out.println("Результат третьего расчета равен: " + fourOperationsSum(2, 1));
    }
}