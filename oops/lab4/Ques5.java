// Write a class  Person  with a constructor that accepts  name  and  age. Create a subclass Employee that accepts name, age, and salary, and use super() to initialize the name and age.

public class Ques5 {
    public static void main(String[] args) {
        Person p = new Employee("Ritesh Sharma", 4, 200000);
        System.out.println(p);
    }
}

class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}

class Employee extends Person {
    public int salary;
    public Employee(String name, int age,int salary) {
        super(name, age);
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}