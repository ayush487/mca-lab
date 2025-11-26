// Implement a Human class with two constructors. Create a Student class that calls both the Human constructors in different ways using super().

public class Ques10 {
    public static void main(String[] args) {
        Student s1 = new Student("Ayush", 44);
        Student s2 = new Student("Ritesh", 140, 30);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Human {
    public String name;
    public int age;
    public Human(String name) {
        this.name = name;
        this.age = 0;
    }
    public Human(String name, int age) {
        this(name);
        this.age = age;
    }
}

class Student extends Human {
    public int roll;
    public Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }
    public Student(String name, int roll, int age) {
        super(name,age);
        this.roll = roll;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", roll=" + roll + "]";
    }
    
}
