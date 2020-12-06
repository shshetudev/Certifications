package chapter_6;

public interface InterFace2 {
    void print();

    static String printStatic(){
        System.out.println("InterFace2: static method execution");
        return "static method";
    }
}
