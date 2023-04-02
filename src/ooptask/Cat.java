package ooptask;

//fields
//what can do: method
//then create constructor

public class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void catchMice() {

    }
    void eat() { //method overriding
        System.out.println("Cat is eating");
    }


}
