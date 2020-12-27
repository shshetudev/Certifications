package chapter_6;

public interface InterFace1 {
    String name = "shetu";
    void print();

    default void printNow() {
        System.out.println("InterFace1: Default method: printNow()");
    }

    static void printStatic(){
        System.out.println("InterFace1: static method execution");
    }
}
