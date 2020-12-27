package chapter_6.default_method_of_interface_testing;

public class Animal implements Jumpable,Moveable{
    @Override
    public void relax() {
        System.out.println("Watch Movie");
    }
}
