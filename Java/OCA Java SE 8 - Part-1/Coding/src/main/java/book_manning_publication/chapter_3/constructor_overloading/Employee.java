package book_manning_publication.chapter_3.constructor_overloading;

public class Employee {
    void Employee(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Employee employee = new Employee(); // did not call void type method: Employee()
    }
}
