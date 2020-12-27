package chapter_6.default_method_of_interface_testing;

public interface Moveable {
    default void relax(){
        System.out.println("No moving");
    }
}
