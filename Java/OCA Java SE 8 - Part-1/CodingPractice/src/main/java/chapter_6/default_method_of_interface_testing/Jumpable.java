package chapter_6.default_method_of_interface_testing;

public interface Jumpable {
    default void relax(){
        System.out.println("No jumping");
    }
}
