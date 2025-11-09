/*
 * Name: Ayush Kumar (2)
 * Enrollment Number : 491168
 * Course : MCA 1st Semester
 * Subject : Object Oriented Programming Using Java
 */

// Question 4
// Implement a singleton class DatabaseConnection using a private onstructor. Ensure that the class restricts object creation to only one instance and provides a global access point using a static method.

class DatabaseConnection {

  private static DatabaseConnection instance = null;
  public int connectionId;

  private DatabaseConnection(int connectionId) {
    this.connectionId = connectionId;
  }

  public static DatabaseConnection getConnection() {
    if (instance == null) {
      instance = new DatabaseConnection((int) (Math.random() * 100));
    }
    return instance;
  }
}

public class Ques4 {
  public static void main(String[] args) {
    DatabaseConnection dbConn1 = DatabaseConnection.getConnection();
    DatabaseConnection dbConn2 = DatabaseConnection.getConnection();
    System.out.println("Connection ID of dbConn1: " + dbConn1.connectionId);
    System.out.println("Connection ID of dbConn2: " + dbConn2.connectionId);
    System.out.println("Are both connections the same ? " + (dbConn1 == dbConn2));
  }
}
