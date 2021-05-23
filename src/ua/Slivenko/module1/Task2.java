package ua.Slivenko.module1;

import java.util.Scanner;

public class Task2 {
    private final static String X = "ABCDEFGH";
    private final static String Y = "12345678";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Укажите начальную клетку (Например: D4)");
        String current = input.nextLine();
        System.out.println("Укажите клетку на которую хотите походить (Например: E2)");
        String next = input.nextLine();
        System.out.println("Вы можите сюда походить? " + checkTheMoves(current, next));
    }

    static boolean checkTheMoves(String currentCell, String nextCell) {
        String current = currentCell.toUpperCase();
        String next = nextCell.toUpperCase();
        int x = Difference(current.charAt(0), next.charAt(0), Task2.X);
        int y = Difference(current.charAt(1), next.charAt(1), Task2.Y);
        return (x == 2 && y == 1) || (x == 1 && y == 2);
    }

    static int Difference(char current, char next, String reference) {
        return Math.abs(reference.indexOf(current) - reference.indexOf(next));
    }
}
