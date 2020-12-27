package chapter_6.this_keyword_for_an_interface;


public class Manager implements Interviewer{

    @Override
    public String print() {
        System.out.println("Static Instance variable: " + Interviewer.MIN_SAL);
        return ("I am " + this);
    }
}
