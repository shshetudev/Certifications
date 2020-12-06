package chapter_6;

public class DemoInterFace implements InterFace1,InterFace2{

    @Override
    public void print() {
        System.out.println("Inside Demo Interface");
    }

    // we can either implement default method or not
}
