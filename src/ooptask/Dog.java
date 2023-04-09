package ooptask;

public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void sleep() {
        System.out.println("Sleep [DOG]");
    }

    public void eat() { //method overriding
        System.out.println("Dog is eating");
    }

    @Override
    void makeSound() {
        System.out.println("wOOOOUUUFFF");

    }

    public void play(){
        System.out.println("Dog plays");

    }

    @Override
    public void askToPlay() {
        System.out.println("Dog asks to play");

    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }
}
