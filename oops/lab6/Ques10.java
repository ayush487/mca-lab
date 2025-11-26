// Question 10: Comprehensive Banking Application

import java.util.Scanner;

public class Ques10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter initial balance for the account ");
    int initialBalance = scan.nextInt();
    scan.nextLine();
    System.out.println("Set a password for your account : ");
    String password = scan.nextLine();
    BankAccount account = new BankAccount(initialBalance);
    account.setPassword(password);
    int choice;
    do {
      displayOptions();
      choice = scan.nextInt();
      switch (choice) {
        case 1: 
          System.out.println("Enter amount to deposit : ");
          int depositAmount = scan.nextInt();
          try {
            account.deposit(depositAmount);
          } catch (AccountLockedException | InvalidAmountException e) {
            System.out.println(e.getMessage());
          }
          break;
        case 2:
          System.out.println("Enter amount to withdraw : ");
          int withdrawAmount = scan.nextInt();
          try {
            account.withdraw(withdrawAmount);
          } catch (AccountLockedException | InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          System.out.println("Current Balance : " + account.getBalance());
          break;
        case 4:
          System.out.println("Enter password : ");
          String pwdToLock = scan.next();
          account.lockAccount(pwdToLock);
          break;
        case 5:
          System.out.println("Enter password : ");
          String pwdToUnlock = scan.next();
          account.unlockAccount(pwdToUnlock);
          break;
        case 0:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Please enter a valid option");
          break;
      }
    } while(choice != 0);
    scan.close();
  }

  public static void displayOptions() {
    System.out.println("Choose an option:");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Lock Account");
    System.out.println("5. Unlock Account");
    System.out.println("0. Exit");
  }
}

class BankAccount {

  private int balance;
  private boolean isLocked;
  private String password;

  public BankAccount(int initialBalance) {
    this.balance = initialBalance;
    this.isLocked = false;
  }

  public void deposit(int amount) throws AccountLockedException, InvalidAmountException {
    if (isLocked)
      throw new AccountLockedException("Account is Locked");
    if (amount <= 0)
      throw new InvalidAmountException("Amount can't be negative");
    balance += amount;
    System.out.println("Deposit of " + amount + " successful. New balance: " + balance);

  }

  public void withdraw(int amount) throws AccountLockedException, InvalidAmountException, InsufficientFundsException {
    if (isLocked)
      throw new AccountLockedException("Account is locked");
    if (amount <= 0)
      throw new InvalidAmountException("Amount can't be negative");
    if (amount > balance)
      throw new InsufficientFundsException("Withdrawal amount can't exceed balance");
    balance -= amount;
    System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
  }

  public int getBalance() {
    return this.balance;
  }

  public void lockAccount(String pwd) {
    if (!this.password.equals(pwd)) {
      System.out.println("Incorrect password. Cannot lock account.");
      return;
    }
    isLocked = true;
    System.out.println("Account locked successfully.");
  }

  public void unlockAccount(String pwd) {
    if (this.password.equals(pwd)) {
      isLocked = false;
      System.out.println("Account unlocked successfully.");
    } else {
      System.out.println("Incorrect password.");
    }
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String message) {
    super(message);
  }
}

class InvalidAmountException extends Exception {
  public InvalidAmountException(String message) {
    super(message);
  }
}

class AccountLockedException extends Exception {
  public AccountLockedException(String message) {
    super(message);
  }
}
