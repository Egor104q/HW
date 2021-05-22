package ua.Slivenko.hw7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Vector[] vector = new Vector[2];
        vector[0] = new Vector(1, 2, 3);
        vector[1] = new Vector(3, 2, 1);
        System.out.println(vector[0].crossProduct(vector[1]).toString());
        System.out.println(vector[0].cosineOfAnAngle(vector[1]));
        System.out.println(vector[0].addition(vector[1]).toString());
        System.out.println(vector[0].Subtraction(vector[1]).toString());
        System.out.println(Arrays.toString(Vector.returning(5)));
    }
}
