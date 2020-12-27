package chapter_4;

public class StringTest {
    public static void main(String[] args) {
        // String can take : char array, string but not single character
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuffer.append('d').append('e');
        stringBuilder.append('d').append('e');
        String str1 = new String(stringBuffer);
        String str2 = new String(stringBuilder);
        String nullstring= null;
        stringBuffer.append(nullstring);
        System.out.println(new Double(2.2));
    }
}
