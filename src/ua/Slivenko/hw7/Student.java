package ua.Slivenko.hw7;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {

        for (int i = 5; i <= averageMark; i++) {
            return 100;
        }
        for (int i = 5; i > averageMark; i++) {
            return 80;
        }
        return 0;
    }
}