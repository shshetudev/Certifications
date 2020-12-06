package chapter_6;

public class DemoChild extends Demo {
    DemoChild(int x) {
        System.out.println("Derived class with parameter x= " + x);
    }

    public static void main(String[] args) {
        DemoChild demoChild = new DemoChild(2);
    }
}
