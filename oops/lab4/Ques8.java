// Create a class  Building  with overloaded constructors. Then create a class  House  that extends Building, and use super() to call different constructors from the superclass based on input parameters.

public class Ques8 {
    public static void main(String[] args) {
        new House();
        new House(5);
        new House(3, 9);
    }
}

class Building {
    public int floors;
    public int rooms;
    public Building() {
        this.floors = 10;
        this.rooms = 100;
        System.out.println("New Building created with 10 floors and 100 rooms");
    }
    public Building(int floors) {
        this.floors = floors;
        this.rooms = 100;
        System.out.println("New Building created with " + floors + " floors and 100 rooms");
    }
    public Building(int floors, int rooms) {
        this.floors = floors;
        this.rooms = rooms;
        System.out.println("New Building created with " + floors + " floors and " + rooms + " rooms");
    }
}

class House extends Building {
    public House() {
        super();
    }
    public House(int floors) {
        super(floors);
    }
    public House(int floors, int rooms) {
        super(floors,rooms);
    }
}