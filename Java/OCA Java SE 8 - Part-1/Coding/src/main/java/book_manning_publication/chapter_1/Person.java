package book_manning_publication.chapter_1;

public class Person {
    public static void main(String[] args) {
        final StringBuilder name = new StringBuilder("Shetu");
        name.append(" Shahariar");
        System.out.println();
        // But it will not compile
//        name = new StringBuilder();

    }
}
