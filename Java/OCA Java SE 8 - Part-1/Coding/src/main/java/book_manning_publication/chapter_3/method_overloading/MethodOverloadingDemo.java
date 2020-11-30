package book_manning_publication.chapter_3.method_overloading;

public class MethodOverloadingDemo {
    public static void main(String[] args) {

    }
    // No compilation error occurs
    // Not overloading based on return type starts
//    double calcAverage(int marks1 , int marks2){
//        return (marks1 + marks2) / 2.0;
//    }
//    int calcAverage(double marks1 , int marks2){
//        return ((int)marks1 + marks2) / 2;
//    }
    // Not overloading based on return type ends

    // No compilation error occurs
    // Not overloading based on access level starts
//    public double calcAverage(double marks1 , int marks2){
//        return (marks1 + marks2) / 2.0;
//    }
//    private double calcAverage(int marks1 , int marks2){
//        return (marks1 + marks2) / 2.0;
//    }
    // Not overloading based on access level ends

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
