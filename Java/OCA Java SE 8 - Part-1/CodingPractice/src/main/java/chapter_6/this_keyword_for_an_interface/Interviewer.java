package chapter_6.this_keyword_for_an_interface;

public interface Interviewer {
    int MIN_SAL = 9999;
    default void submitInterviewStatus(){
        System.out.println(this);
        System.out.println(this.MIN_SAL);
        System.out.println(this.print());
    }
    // abstract method
    String print();
}
