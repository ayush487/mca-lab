// Create a class Rectangle with two constructors: one that accepts both width and height, and another that only accepts width and sets a default height. Use the this() constructor chaining to avoid redundancy.

public class Ques2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,8);
        Rectangle r2 = new Rectangle(9);
        System.out.println("Rectangle 1 :");
        r1.info();
        System.out.println("Rectangle 2 :");
        r2.info();
    }
}

class Rectangle {

    public int height;
    public int width;
    
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int width) {
        this(10, width);
    }

    public void info() {
        System.out.printf("Height of Rectangle : %d\nWidth of Rectangle : %d\n", this.height, this.width);
    }
}