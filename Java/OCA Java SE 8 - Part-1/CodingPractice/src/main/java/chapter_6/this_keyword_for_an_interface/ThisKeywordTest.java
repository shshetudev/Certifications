package chapter_6.this_keyword_for_an_interface;

public class ThisKeywordTest {
    public static void main(String[] args) {
        Interviewer interviewer = new Manager();
        interviewer.submitInterviewStatus();
    }
}
