package chapter_6.super_keyword_usage;

public class Programmer extends Employee {
    String proLanguage;

//    Programmer(){
//        super();
//    }

    Programmer(String name, String address, String proLanguage) {
        super(name, address);
        this.proLanguage = proLanguage;
    }
}
