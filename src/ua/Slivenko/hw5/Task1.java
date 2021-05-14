package ua.Slivenko.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[][] fillArray = nambers1(array);
        int[][] fillArray2 = nambers2(array);
        for (int[] nambers2 : fillArray2) {
            System.out.println(Arrays.toString(nambers2));
        }
    }

    private static int[][] nambers2(int[][] nambers1) {
        for (int i = 1; i < nambers1.length; i = i + 2) {
            for (int j = 0; j < nambers1.length; j++) {
                int min = -100;
                int max = 0;
                int diff = max - min;
                Random random = new Random();
                nambers1[i][j] = random.nextInt(diff + 1);
                nambers1[i][j] += min;
            }
        }
        return nambers1;
    }

    private static int[][] nambers1(int[][] array) {
        for (int i = 0; i < array.length; i=i+2) {
            for (int j = 0; j < array.length; j++) {
                int min = 0;
                int max = 100;
                int diff = max - min;
                Random random = new Random();
                array[i][j] = random.nextInt(diff + 1);
                array[i][j] += min;
            }
        }

        return array;
    }
}



