package ua.Slivenko.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        int[] newArray = Arrays.stream(record(array)).toArray();
        for (int a : newArray){
            System.out.println(a);
        }
    }
    private static int[] record(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) numbers[i] =0;
        }

        return numbers;
    }
}