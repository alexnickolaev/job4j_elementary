package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double result = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(3, 5, 2, 1);
        System.out.println("result (3, 5) to (2, 1) " + result2);
        double result3 = Point.distance(4, 6, 8, 10);
        System.out.println("result (4, 6) to (8, 10) " + result3);
    }
}