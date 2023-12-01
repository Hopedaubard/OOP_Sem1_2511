package HomeWork;

import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toFly() {
    }

    @Override
    public void run() {
        System.out.println("dog run");
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
