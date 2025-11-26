// Create a parent class  Animal  with a method  makeSound()  and a subclass  Dog  that overrides this method. Use the  super  keyword to call the parent class's method in the overridden version.

public class Ques4 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog barks!!!");
    }
}