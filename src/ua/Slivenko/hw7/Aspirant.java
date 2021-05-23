package ua.Slivenko.hw7;

public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);

    }

    @Override
    public int getScholarship() {
        if (averageMark >= 5) {
            return 200;
        }
        else if (averageMark < 5) ;
        {
            return 180;
        }
    }
}
