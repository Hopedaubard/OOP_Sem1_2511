package HomeWork;

import java.time.LocalDate;

public class Pigeon extends Animal {
    public Pigeon() {
        super();
    }

    public Pigeon(String name, Illness illness, String ownerName, LocalDate birthday) {
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
