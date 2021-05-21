package ua.Slivenko.hw7;

public class Task2{
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Саша", "Любой", "ТКЛ-15-3", 4);
        students[1] = new Aspirant("Петя", "Резак", "РЛК-12-6", 4);
        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());

    }
}
