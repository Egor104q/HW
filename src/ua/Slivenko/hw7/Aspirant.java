package ua.Slivenko.hw7;

public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);

    }

    @Override
    public int getScholarship() {
            for (int i = 5; i <= averageMark ;) {
                return 200;
            }
        for (int i = 5; i > averageMark; i++) {
            return 180;
        }
            return 0;
    }
}
