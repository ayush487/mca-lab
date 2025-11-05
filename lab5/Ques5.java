/*
 * Name: Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 5
// Write an abstract class Shape that has a parameterized constructor to initialize the color of the shape. Extend this class in Circle and Rectangle, which will have their own additional parameters (like radius, length, width). Ensure proper constructor calls using super().

abstract class Shape {
  public String color;
  public Shape(String color) {
    this.color = color;
  }
  public abstract void getShapeInfo();
}

class Rectangle extends Shape {
  public int height;
  public int width;
  public Rectangle (int height, int width, String color) {
    super(color);
    this.height = height;
    this.width = width;
  }
  public void getShapeInfo() {
    System.out.println("This is a Rectangle");
    System.out.println("Height : " + height + " Width : " + width + " Color : " + color);
  }
}

class Circle extends Shape {
  public int radius;
  public Circle(int radius, String color) {
    super(color);
    this.radius = radius;
  }
  public void getShapeInfo() {
    System.out.println("This is a Circle");
    System.out.println("Radius : " + radius + " Color : " + color);
  }
}

public class Ques5 {
  public static void main(String[] args) {
    Shape shape1 = new Rectangle(10, 6, "Green");
    Shape shape2 = new Circle(12, "Red");
    shape1.getShapeInfo();
    shape2.getShapeInfo();
  } 
}
