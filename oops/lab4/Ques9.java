// Create a class with an inner class and use this to refer to the outer class’s instance variables or methods.

public class Ques9 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner innerObj = outer.new Inner();
        innerObj.myInnerFunction();
    }
}

class Outer {
    public int outerVar = 99;
    public void myFunction() {
        System.out.println("This function is inside Outer class");
    }
    class Inner {
        public void myInnerFunction() {
            myFunction();
            System.out.println("This method was called from Inner class while refering to outer class variable " + outerVar);
        }
    }
}

