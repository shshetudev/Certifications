package chapter_1.topic_enum.p22;

public enum Season {
    WINTER("LOW"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;
    private Season(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}

class EnumConstructorChecking{
    public static void main(String[] args) {
        Season.SUMMER.printExpectedVisitors();
    }
}
