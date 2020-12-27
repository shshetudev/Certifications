package chapter_6;

public interface BaseInterface1 {
    default void getName() {
        System.out.println("BaseInterface1:: getName()");
    }
}
