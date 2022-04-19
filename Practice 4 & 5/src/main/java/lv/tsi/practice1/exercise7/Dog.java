package lv.tsi.practice1.exercise7;

public class Dog implements Animal, Domestic {
    private final String name;

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}
