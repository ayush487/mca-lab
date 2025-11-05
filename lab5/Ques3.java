/*
 * Name : Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 3
// Design a class ComplexNumber that models complex numbers. Write a copy constructor that takes another ComplexNumber object and initializes the current object’s real and imaginary parts with the copied values.

class ComplexNumber {
  public double real;
  public double imaginary;
  public ComplexNumber (double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }
  public ComplexNumber(ComplexNumber anotherComplexNumber) {
    this(anotherComplexNumber.real, anotherComplexNumber.imaginary);
  }
  public String getDisplayNumber() {
    return real + " + " + imaginary + "i";
  }
}

public class Ques3 {
  public static void main(String[] args) {
    ComplexNumber num1 = new ComplexNumber(5, 4);
    ComplexNumber num2 = new ComplexNumber(num1);
    System.out.println(num1.getDisplayNumber());
    System.out.println(num2.getDisplayNumber());
  }
}
