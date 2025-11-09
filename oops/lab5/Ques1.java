/*
 * Name : Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 1
// Write a Java class Student that has multiple constructors. One constructor should accept student name and ID, while another should accept student name, ID, and grades. Implement constructor overloading and ensure the constructors call each other using this().
 
class Student {

  private String name;
  private int id;
  private double grades;

  public Student (String name, int id, double grades) {
    this.name = name;
    this.id = id;
    this.grades = grades;
  }

  public Student (String name, int id) {
    this(name, id, 60.0);
  }

  public String getInfo() {
    StringBuilder info = new StringBuilder();
    info.append("Name : "  + this.name + "\n");
    info.append("ID : "  + this.id + "\n");
    info.append("Grades : "  + this.grades + "\n");
    return info.toString();
  }

}

public class Ques1 {

  public static void main(String[] args) {
    Student s1 = new Student("Ayush Kumar", 556, 87.3);
    Student s2 = new Student("Ritesh Sharma", 558);
    System.out.println(s1.getInfo());
    System.out.println(s2.getInfo());
  }
}