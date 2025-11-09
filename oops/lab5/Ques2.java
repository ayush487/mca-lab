/*
 * Name : Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 2
// Create a class Employee with fields name, id, designation, and salary. Implement multiple constructors that initialize different combinations of these fields, and ensure that they chain to a primary constructor using the this() keyword.

class Employee {
  private String name;
  private int id;
  private String designation;
  private int salary;

  public Employee (int id) {
    this("Ayush Kumar", id);
  }

  public Employee (String name, int id) {
    this(name, id, "Programmer");
  }
  public Employee (String name, int id, String designation) {
    this(name, id, designation, 80000);
  }
  public Employee(String name,int id, String designation, int salary) {
    this.name = name;
    this.id = id;
    this.designation = designation;
    this.salary = salary;
  }

  public String getInfo() {
    StringBuilder info = new StringBuilder();
    info.append("Name : "  + this.name + "\n");
    info.append("ID : "  + this.id + "\n");
    info.append("Designation : "  + this.designation + "\n");
    info.append("Salary : "  + this.salary + "\n");
    return info.toString();
  }
}

public class Ques2 {
  public static void main(String[] args) {
    Employee e1 = new Employee(1);
    System.out.println(e1.getInfo());
  }
}
