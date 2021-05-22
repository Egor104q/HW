package ua.Slivenko.hw7;

import java.util.Random;

public class Vector {
    protected int x;
    protected int y;
    protected int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    double root(Vector vector) {
        return Math.abs(Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));
    }

    Vector crossProduct(Vector vector) {
        int i = (y * vector.z - z * vector.y);
        int j = (z * vector.x - x * vector.z);
        int k = (x * vector.y - y * vector.x);
        return new Vector(i, j, k);
    }

    public double cosineOfAnAngle(Vector vector) {
        int scalarProduct = x * vector.x + y * vector.y + z * vector.z;
        double lengthOfVector1 = Math.abs(Math.sqrt(Math.pow(x, 2)
                + Math.pow(y, 2) + Math.pow(z, 2)));
        double lengthOfVector2 = Math.abs(Math.sqrt(Math.pow(vector.x, 2)
                + Math.pow(vector.y, 2) + Math.pow(vector.z, 2)));
        return scalarProduct / (lengthOfVector1 * lengthOfVector2);
    }

    public Vector addition(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector Subtraction(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] returning(int r) {
        Random random = new Random();
        Vector[] vectors = new Vector[r];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(random.nextInt(5), random.nextInt(5), random.nextInt(5));
        }
        return vectors;
    }
}

