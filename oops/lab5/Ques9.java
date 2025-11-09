/*
 * Name: Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 9
// Create an interface PaymentMethod with a method void pay(double amount). Implement this interface in two classes: CreditCardPayment and PayPalPayment. Write a class OnlineStore that accepts a PaymentMethod in its constructor and uses it to process a payment

interface PaymentMethod {
  void pay(double amount);
}
class CreditCardPayment implements PaymentMethod {
  public void pay(double amount) {
    System.out.println("Payment initiating through your Credit Card");
    System.out.println(".");
    System.out.println("..");
    System.out.println("...");
    System.out.println("Payment successfull of INR" + amount + " from your credit card!");
  }
}
class PaypalPayment implements PaymentMethod {
  public void pay(double amount) {
    System.out.println("Payment initiating from your paypal account");
    System.out.println(".");
    System.out.println("..");
    System.out.println("...");
    System.out.println("Payment successfull of INR " + amount + " from your paypal account!");
  }
}

class OnlineStore {
  private PaymentMethod paymentMethod;
  private double billAmount = 0;
  private String storeName;
  public OnlineStore(String storeName, PaymentMethod paymentMethod) {
    this.storeName = storeName;
    this.paymentMethod = paymentMethod;
  }

  public void addToCart(double amount) {
    billAmount += amount;
    System.out.println("Alert from " + storeName + ": Added item worth INR " + amount + " to the cart.");
  }

  public void checkout() {
    System.out.println("Your total bill amount is: INR " + billAmount);
    paymentMethod.pay(billAmount);
    System.out.println("Thank you for shopping with " + storeName + "!");
  }
}

public class Ques9 {
  public static void main(String[] args) {
    PaymentMethod creditCardMethod = new CreditCardPayment();
    PaymentMethod paypalMethod = new PaypalPayment();
    OnlineStore store1 = new OnlineStore("Computer Accessories", creditCardMethod);
    store1.addToCart(4699);
    store1.addToCart(2299);
    store1.checkout();
    
    OnlineStore store2 = new OnlineStore("Gaming Shop", paypalMethod);
    store2.addToCart(349);
    store2.addToCart(559);
    store2.addToCart(99);
    store2.checkout();
  }
}
