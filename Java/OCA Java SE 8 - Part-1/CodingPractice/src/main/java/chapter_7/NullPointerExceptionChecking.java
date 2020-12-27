package chapter_7;

public class NullPointerExceptionChecking {
    static void print(){
        System.out.println("Hello exceptions!");
        try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception caught!");
        }
    }

    public static void main(String[] args) {
    print();
    }
}
