package com.company;

import java.util.zip.CheckedInputStream;

public class Main {

    public static void main(String[] args) {
        getSquareOfTriangle(4, 6, 9, 5, 7, 3);
        checkIfNumberEven(8);
        findTheSmalLestModule(-1.8, 2, -4.7);

    }

    private static void findTheSmalLestModule(double n1, double n2, double n3) {
        double result = n1 > 0 ? n1 : -n1;
        double result1 = n2 > 0 ? n2 : -n2;
        double result2 = n3 > 0 ? n3 : -n3;
        if (result < result1 && result < result2) {
            System.out.println("Самый маленький модуль " + result);
            System.out.println();
        } else if (result1 < result1 && result1 < result2) {
            System.out.println("Самый маленький модуль " + result1);
            System.out.println();
        } else if (result2 < result && result2 < result1) {
            System.out.println("Самый маленький модуль " + result2);
            System.out.println();
        }
    }

    private static void checkIfNumberEven(int number) {
        if (number % 2 == 0) {
            System.out.println("число " + number + " чётное");
            System.out.println();
        } else {
            System.out.println("число " + number + " не чётное");
            System.out.println();
        }
    }

    private static void getSquareOfTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int square = Math.abs((x1 - x3) * (y2 - y1) - (x1 - x2) * (y3 - y1)) / 2;
        System.out.println("Площадь треугольника равна = " + square);
        System.out.println();
    }
}
