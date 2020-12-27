package chapter_1.topic_enum.p22;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE; // It will print nothing
    }
}
