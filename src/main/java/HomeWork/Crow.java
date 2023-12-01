package HomeWork;

import java.time.LocalDate;

public class Crow extends Animal {
    public Crow() {
        super();
    }

    public Crow(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toSwim() {
    }
}
