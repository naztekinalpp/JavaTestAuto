package ooptask;

public class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    public void eat() { //method overriding
        System.out.println("Dog is eating");
    }

    private void play(){
        
    }

}
