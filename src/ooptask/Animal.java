package ooptask;

public abstract class Animal implements Movable, Playable {
    String name;
    int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void sleep(); //abstract, if we have an abstract method, class must be abstract
    abstract void eat();
    abstract void makeSound();


}
