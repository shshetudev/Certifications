package chapter_6;

public interface BaseInterface2 {
    default void getName() {
        System.out.println("BaseInterface2:: getName()");
    }
}
