package ua.Slivenko.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        String text = new Scanner(System.in).nextLine();
        String text2 = removeSpaces(text);
        System.out.println(text2);
        System.out.println(isPalindrome(text2) ? text2 + " это палиндром" : text2 + " это не палиндромом");
    }

    private static String removeSpaces(String text) {
        return text.replaceAll("\\s", "");
    }

    private static boolean isPalindrome(String text2) {
        StringBuilder textReverse = new StringBuilder(text2);
        textReverse.reverse();
        System.out.println(textReverse);
        String textR = textReverse.toString();
        return text2.equalsIgnoreCase(textR);
    }
}