package ooptask.protectedexample;

import ooptask.Animal;

public class Caw extends Animal {

    public static void main(String[] args) {
        Animal animal = new Animal();

        // animal.makeSound(); //cannot be accessible because package it's package private
        // animal.eat(); //not accessible because it's in another package

    }
}
