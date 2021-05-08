package ua.Slivenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {
        System.out.println("Введите предложение");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Количество слов в предложении: " + countWords(text));
    }

    private static int countWords(String text) {
        String[] array = text.split("[#$%^&!?,.0-9\\s]+");
        return array.length;
    }
}