package ua.Slivenko.hw7;

public class Vector {
    protected int x;
    protected int y;
    protected int z;
    protected int x2;
    protected int y2;
    protected int z2;


}

    public int root(int x, int y, int z) {
        Math.pow(x, 2);
        Math.pow(y, 2);
        Math.pow(z, 2);
        double sum = x + y + z;
        Math.sqrt(sum);
        return (int) sum;
    }

    public int root2(int x2, int y2, int z2) {
        Math.pow(x2, 2);
        Math.pow(y2, 2);
        Math.pow(z2, 2);
        double sum2 = x2 + y2 + z2;
        Math.sqrt(sum2);
        return (int) sum2;
    }

    public int crossProduct(int x, int y, int z, int x2, int y2, int z2) {
        int i = (y * z2 - z * y2);
        int j = (z * x2 - x * z2);
        int k = (x * y2 - y * x2);
        return int(i), int(j), int(k);
    }

    public int cosineOfAnAngle(int x, int y, int z, int x2, int y2, int z2, int sum, int sum2) {
        int xyz = x * x2 + y * y2 + z * z2;
        int coal = xyz/(sum * sum2);
return coal;
    }
    public int additionAndSubtraction(int x, int y, int z, int x2, int y2, int z2) {
    int additionX = (x+x2);
    int additionY = (y+y2);
    int additionZ = (z+z2);
    int subtractionX = (x+x2);
    int subtractionY = (y+y2);
    int subtractionZ = (z+z2);
    return int(additionX), int(additionY), int(additionZ), int(subtractionX), int(subtractionY), int(subtractionZ);
    }
}

