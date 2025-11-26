// Write a class Student with fields name and age. Create a constructor that uses the this keyword to distinguish between instance variables and parameter.

public class Ques1 {
    public static void main(String[] args) {
        new Student("Ayush Kumar", 21);
    }
}

class Student {

    public String name;
    public int age;

    public Student(String name,int age) {
        System.out.printf("Value of Instance Variables before initialization :\nName : %s\nAge : %d", this.name, this.age);
        System.out.printf("\nParameters :\nName : %s\nAge : %d", name, age);
        this.name = name;
        this.age = age;
    }
}