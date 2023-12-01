package HomeWork;

import java.time.LocalDate;

public class Turtle extends Animal {
    public Turtle() {
        super();
    }

    public Turtle(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toFly() {
    }
}
