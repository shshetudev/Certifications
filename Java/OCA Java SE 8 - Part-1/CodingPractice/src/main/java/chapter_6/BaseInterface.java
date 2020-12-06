package chapter_6;

public interface BaseInterface extends BaseInterface1,BaseInterface2{
    // overriding
    @Override
    default void getName() {
        BaseInterface1.super.getName();
//        BaseInterface2.super.getName();
    }
}
