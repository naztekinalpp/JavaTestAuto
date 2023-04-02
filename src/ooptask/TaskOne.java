package ooptask;
/*
Create two classes to represent a cat and a dog. It must contain fields, constructors and methods.
Then create another class to create instances of Dog and Cat classes and use the methods of this classes.
 */


public class TaskOne { //this is a seperate class to create instances of dog and cat and use their methods

    public static void main(String[] args) {
        //object creation
        Cat cat = new Cat("Tom", 5);
        Dog dog = new Dog("Pike", 7);

        //now we are ready to use their methods
        cat.eat();
        dog.eat();

    }

}
