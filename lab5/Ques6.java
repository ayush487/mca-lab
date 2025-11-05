/*
 * Name: Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 6
//  Implement a class Polynomial that models a polynomial equation. Use a constructor that takes a variable number of coefficients (using varargs) and initializes the polynomial. Write a method to display the polynomial in a readable format (e.g., 3x^2 + 2x + 1).

class Polynomial {
  String polynomialString = null;

  public Polynomial(int... coefficients) {
    StringBuilder sb = new StringBuilder();
    int degree = coefficients.length - 1;
    for (int i = 0; i < coefficients.length; i++) {
      int coef = coefficients[i];
      if (coef != 0) {
        if (!sb.isEmpty()) {
          sb.append(" + ");
        }
        if (degree == 0) {
          sb.append(coef);
        } else if (degree == 1) {
          sb.append(coef + "x");
        } else {
          sb.append(coef + "x^" + degree);
        }
      }
      degree--;
    }
    this.polynomialString = sb.toString();
  }

  public String getPolynomialString() {
    return polynomialString;
  }
}

public class Ques6 {
  public static void main(String[] args) {
    Polynomial p1 = new Polynomial(4, 2, 6, 1);
    Polynomial p2 = new Polynomial(5,0,0,1,0);
    System.out.println(p1.getPolynomialString());
    System.out.println(p2.getPolynomialString()); 
  }
}
