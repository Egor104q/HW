package ua.Slivenko.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int words = 1;
        Scanner text = new Scanner(System.in);
        System.out.println("Введите предложение ");
        String str = text.nextLine();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ')
                words++;
        }
        System.out.println("Количество слов в предложении: " + words);
    }
}