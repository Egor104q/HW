package com.company;

import java.util.zip.CheckedInputStream;

public class Main {

    public static void main(String[] args) {
        getSquareOfTriangle();
        checkIfNumberEven(8);
        findTheSmalLestModule(-1.8, 2, -4.7);

    }

    private static void findTheSmalLestModule(double n1, double n2, double n3) {
        double result = n1 > 0 ? n1 : -n1;
        double result1 = n2 > 0 ? n2 : -n2;
        double result2 = n3 > 0 ? n3 : -n3;
        if (result < result1 && result < result2) {
            System.out.println("Самый маленький модуль " + result);
        } else if (result1 < result1 && result1 < result2) {
            System.out.println("Самый маленький модуль " + result1);
        } else if (result2 < result && result2 < result1) {
            System.out.println("Самый маленький модуль " + result2);

        }
    }

    private static void checkIfNumberEven(int number) {
        if (number % 2 == 0) {
            System.out.println("число " + number + " чётное");
        } else {
            System.out.println("число " + number + " не чётное");
        }
    }

    private static void getSquareOfTriangle() {
        int a = 9;
        int b = 10;
        int c = 8;
        System.out.println("Площадь треугольника равна = " + (a * b * c));
    }
}
