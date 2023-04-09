package ooptask;
/*
Create two classes to represent a cat and a dog. It must contain fields, constructors and methods.
Then create another class to create instances of Dog and Cat classes and use the methods of this classes.
 */

public class TaskOne { //this is a separate class to create instances of dog and cat and use their methods

    public static void main(String[] args) {

        TaskOne taskOne = new TaskOne();

        //object creation
        Animal cat = new Cat("Tom", 5);
        Animal dog = new Dog("Pike", 7);

        taskOne.action(cat);
        taskOne.action(dog);

    }

    //apply this specific behaviour to all animals
    private void action(Animal animal) {
        animal.move();
        animal.askToPlay();
        animal.play();
        animal.askToPlay();
    }

    private void sleep(Animal animal) {
        animal.sleep();
    }

}
