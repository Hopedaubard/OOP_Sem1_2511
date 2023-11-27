package HomeWork;

import java.time.LocalDate;

public class Monkey extends Animal {
    public Monkey() {
        super();
    }

    public Monkey(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void toFly() {
    }
}
