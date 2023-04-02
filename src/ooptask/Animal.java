package ooptask;

public class Animal {
    String name;
    int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void sleep() {

    }


    void makeSound() {
        System.out.println("Animal is making sound");
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }
}
