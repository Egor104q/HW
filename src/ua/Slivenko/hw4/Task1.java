package ua.Slivenko.hw4;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[400];
        int[] filledArray = fill(array);
        System.out.println("Среднее арифметическое " + arithmetic(filledArray));
        System.out.println("Среднее геометрическое " + geometric(filledArray));
    }

    private static double geometric(int[] array) {
        double a = 1.0;
        double mid;
        for (int element : array) {
            a *= element;
        }
        mid = Math.pow(a, 1.0 / (double) array.length);
        return mid;
    }

    private static double arithmetic(int[] array) {
        double b = 0;
        double average;
        for (int element : array) {
            b += element;
        }
        average = b / array.length;
        return average;
    }

    private static int[] fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        return array;
    }
}