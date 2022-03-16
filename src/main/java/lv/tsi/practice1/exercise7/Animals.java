package lv.tsi.practice1.exercise7;

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("Skay");
        dog.printName();
        dog.sound();

        Cat cat = new Cat("Vee");
        cat.printName();
        cat.sound();

        Fox fox = new Fox("Kok");
        fox.printName();
        fox.sound();
    }
}
