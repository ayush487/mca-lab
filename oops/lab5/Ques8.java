/*
 * Name: Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 8
// Create two interfaces Flying and Swimming, each with a method void fly() and void swim() respectively. Create a class Duck that implements both interfaces and overrides both methods. Write a test class that demonstrates the Duck's ability to both fly and swim.

interface Flying {
  void fly();
}
interface Swimming {
  void swim();
}
class Duck implements Flying, Swimming {
  public void fly() {
    System.out.println("This Duck can fly!");
  }
  public void swim() {
    System.out.println("This Duck can swim!");
  }
}

class Test {
  public void swimmingGroup(Swimming s) {
    s.swim();
    System.out.println("This method is reserved for swimmers only.");
  }
  public void flyingGroup(Flying f) {
    f.fly();
    System.out.println("This method is reserved for flyers only.");
  }
}

public class Ques8 {
  public static void main(String[] args) {
    Duck duck = new Duck();
    Test test = new Test();
    test.flyingGroup(duck);
    test.swimmingGroup(duck);
  }
}
