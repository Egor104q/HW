package ua.Slivenko.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int array[] = new int[1000];
        int[] fArray = write(array);
        System.out.println("В массиве " + compositeNumbers(fArray) + " составных чисел");
    }

    private static int[] write(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    private static int compositeNumbers(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if (compositeNumbers2(num)) {
                sum++;
            }
        }
        return sum;
    }

    private static boolean compositeNumbers2(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return true;
        }
        return false;
    }
}