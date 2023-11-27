package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();
        dog.toSwim();
// В main добиться того, чтобы при вызове метода действия, которое конкретное
// животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)
    }
}
