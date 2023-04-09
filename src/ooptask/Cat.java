package ooptask;

//fields
//what can do: method
//then create constructor

 class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void sleep() {
        System.out.println("Sleep[CAT]");
    }

    void catchMice() {

    }
    public void eat() { //method overriding
        System.out.println("Cat is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Meeeow");
    }

     @Override
     public void move() {
         System.out.println("Cat run");
     }

     @Override
     public void play() {
         System.out.println("Catch mice");

     }

     @Override
     public void askToPlay() {
         System.out.println("Cat asks to play");

     }
 }
