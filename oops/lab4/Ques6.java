// In the class Vehicle with a method move(), create a subclass Car that overrides move(). Use super.move() to call the superclass version inside the overridden method.

public class Ques6 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.move();
    }
}

class Vehicle {
    public void move() {
        System.out.println("Vehicle will move for sure");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        super.move();
        System.out.println("Car will move faster on 4 wheels");
    }
}