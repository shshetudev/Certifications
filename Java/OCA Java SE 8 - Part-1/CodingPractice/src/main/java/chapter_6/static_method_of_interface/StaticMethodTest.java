package chapter_6.static_method_of_interface;

public class StaticMethodTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(Jumpable.maxDistance());
        System.out.println(Moveable.maxDistance());
    }
}
