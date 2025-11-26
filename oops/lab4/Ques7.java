//  Write a class Parent with a method display(), and a subclass Child with a constructor that uses super() to call the parent class constructor. Use both super.display() and this.display() in the child class.

public class Ques7 {
    public static void main(String[] args) {
        Child obj = new Child("Ayush", "Kumar");
        obj.showInfo();
    }
}

class Parent {
    public String surname;
    public Parent(String surname) {
        this.surname = surname;
    }
    public void display() {
        System.out.printf("Surname : %s\n", surname);
    }
}

class Child extends Parent {
    public String name;
    public Child(String name, String surname) {
        super(surname);
        this.name = name;
    }
    @Override
    public void display() {
        super.display();
        System.out.printf("Name : %s\n", name);
    }

    public void showInfo() {
        this.display();
    }
}