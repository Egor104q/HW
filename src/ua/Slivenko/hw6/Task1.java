package ua.Slivenko.hw6;


public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = 92492636;
        phone1.model = "Huawei";
        phone1.weight = 420;
        Phone phone2 = new Phone(738094912, "Iphone", 523);
        Phone phone3 = new Phone("GPhon", 321);
        phone3.number = 479654;
        System.out.println("Phone1 number " + phone1.number);
        System.out.println("Phone1 model " + phone1.model);
        System.out.println("phone1 weight " + phone1.weight);
        System.out.println(phone2.receiveCall());
        System.out.println(phone3.receiveCall());
        phone1.receiveCall(" Саша");
        phone2.receiveCall(" Аня");
        phone3.receiveCall(" Максим");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}

class Phone {
    int number;
    String model;
    int weight;


    Phone() {
        receiveCall();
    }

    String receiveCall() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model +
                ", weight=" + weight +
                '}';
    }
    int getNumber() {
        return this.number;
    }

    void receiveCall(String name) {
        System.out.println("call" + name);
    }


    Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }
}