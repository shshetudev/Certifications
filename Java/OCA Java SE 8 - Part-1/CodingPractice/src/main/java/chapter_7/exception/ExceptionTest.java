package chapter_7.exception;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

    }

    // Compilation error will be thrown if We create an object of Exception class
    static void testException() throws IOException,Exception {
        throw new Exception();
    }
}
