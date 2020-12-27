package chapter_7.exception.checked_exception_checking;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {

        try{
            FileInputStream fileInputStream = new FileInputStream("file.txt");

        }catch (RuntimeException re){
           throw new RuntimeException();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
