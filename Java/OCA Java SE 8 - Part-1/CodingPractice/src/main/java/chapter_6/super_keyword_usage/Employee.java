package chapter_6.super_keyword_usage;

public class Employee {
    String name;
    String address;

    Employee(){
        this("a","f");
    }
    Employee(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }
}
