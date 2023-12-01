package HomeWork;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    private Illness illness;
    private String ownerName;
    private LocalDate birthday;

    public Animal() {
    }
    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }

    public abstract String getName();
    public void setName(String name){
        this.name = name;
    }
    public Illness getIllness() {
        return illness;
    }
    private void toWakeUp(){
        System.out.println("Animal woke up");
    }
    private void toWakeUp(String time){
        System.out.println(getClass().getSimpleName() + " woke up is " + time);
    }
    private void eat(){
        System.out.println(getClass().getSimpleName() + " ate");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName() + " go to bed");
    }
    private void play(){
        System.out.println(getClass().getSimpleName() + " go to play");
    }
    public void liveCycle(){
        toWakeUp();
        eat();
        play();
        sleep();
    }
    public void breathe(){
        System.out.println(getClass().getSimpleName() + " already breathe, don't worry");
    }
    //Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
    public void toGo(){
        System.out.println(getClass().getSimpleName() + " goes");
    }
    public void toFly(){
        System.out.println(getClass().getSimpleName() + " flyes");
    }
    public void toSwim(){
        System.out.println(getClass().getSimpleName() + " swims");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", illness=" + illness +
                ", ownerName='" + ownerName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
