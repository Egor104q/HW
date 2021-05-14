package ua.Slivenko.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = namb(5);
        System.out.println(Arrays.toString(array));
        System.out.println(mat(array));
    }

    private static boolean mat(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] namb(int nambers) {
        int[] array = new int[nambers];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        return array;
    }

}

