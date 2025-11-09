/*
 * Name: Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 7
// Create an interface Shape that has methods double area() and double perimeter() . Implement this interface in two classes: Circle and Rectangle. The Circle class should calculate the area and perimeter using the radius, and the Rectangle class should use the length and width

interface Shape {
  double area();
  double perimeter();
}

class Circle implements Shape {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle implements Shape {
  public double length;
  public double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return 2 * (length + width);
  }
}

public class Ques7 {
  public static void main(String[] args) {
    Shape circle = new Circle(7);
    Shape rectangle = new Rectangle(5, 2);
    System.out.println("Circle Area : " + circle.area() + " Perimeter : " + circle.perimeter());
    System.out.println("Rectangle Area : " + rectangle.area() + " Perimeter : " + rectangle.perimeter());
  }
}