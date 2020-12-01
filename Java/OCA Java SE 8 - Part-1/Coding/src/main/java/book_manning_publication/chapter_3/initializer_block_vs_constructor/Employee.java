package book_manning_publication.chapter_3.initializer_block_vs_constructor;

public class Employee {
    Employee(){
        {
            System.out.println("Employee::constructor");
        }
    }

    {
        System.out.println("Employee::initializer-1");
    }

    {
        System.out.println("Employee::initializer-2");
    }
    public static void main(String[] args) {
    Employee employee = new Employee();
    }
}
