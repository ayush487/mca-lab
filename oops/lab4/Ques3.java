// Write a class Chain where methods step1(), step2(), and step3() return this to allow method chaining.

public class Ques3 {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.getInfo();
        chain.Step1().getInfo().Step2().getInfo().Step3().getInfo().close();
        chain.getInfo();
        chain.Step1().Step2().Step3();
    }
}

class Chain {
    public int one;
    public int two;
    public int three;
    public Chain Step1() {
        this.one = 10;
        System.out.println("Step1 is completed");
        return this;
    }
    public Chain Step2() {
        this.two = 20;
        System.out.println("Step2 is completed");
        return this;
    }
    public Chain Step3() {
        this.three = 30;
        System.out.println("Step3 is completed");
        return this;
    }
    public void close() {
        System.out.println("Chaining has been closed");
    }
    public Chain getInfo() {
        System.out.printf("Variables : \nOne:%d\nTwo:%d\nThree:%d\n", this.one, this.two, this.three);
        return this;
    }
}