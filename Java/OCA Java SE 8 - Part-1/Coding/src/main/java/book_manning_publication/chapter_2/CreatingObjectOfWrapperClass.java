package book_manning_publication.chapter_2;

public class CreatingObjectOfWrapperClass {
    public static void main(String[] args) {
        integerChecking();

    }

    static void booleanChecking(){
        Boolean bool1 = true; // Auto Boxing OR Assignment
        Boolean bool2 = new Boolean(true); // Constructor
        Boolean bool3 = new Boolean("true"); // Constructor which accepts string
        Boolean bool4 = Boolean.valueOf(true); // Static Method
        Boolean bool5 = Boolean.valueOf("TrUe"); // Static Method

        // print all
        System.out.println(
                "\nBool1: "+bool1
                        +"\nBool2: "+bool2
                        +"\nBool3: "+bool3
                        +"\nBool4: "+bool4
                        +"\nBool5: "+bool5
        );
    }

    static void integerChecking(){
        Integer i1 = new Integer(200); // Exceeds the limit of : -127 to 128har
        Integer i2 = new Integer(200);
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf(200);
        Integer i5 = 200;
        Integer i6 = 200;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);
    }
}
