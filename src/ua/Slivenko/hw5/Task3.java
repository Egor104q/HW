package ua.Slivenko.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        firstArray(array);
        for (int[] InnerArray : array) {
            System.out.println(Arrays.toString(InnerArray));
        }
        System.out.println("--------------------");
        for (int[] InnerArray2 : secondArray(array)) {
            System.out.println(Arrays.toString(InnerArray2));
        }
    }

    private static int[][] firstArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100);
            }

        }
        return array;
    }


    private static int[][] secondArray(int[][] array) {
        int[][] a = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                a[j][i] = array[i][j];
            }
        }
        return a;
    }
}
