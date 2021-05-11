package ua.Slivenko.hw4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int[] fillRay = fill(array);
        System.out.println("В масиве " + primeNumber(fillRay) + " простых чисел");
    }

    private static int[] fill(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    private static int primeNumber(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            if (isPrime(num)) {
                sum++;
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

