package chapter_1.topic_enum.p20;

/*; is optional in Enum, it becomes mandatory if
 * the class has other values or codes*/
public enum Season {
    WINTER, SPRING, SUMMER, FALL
}
/* Enum variables are by default static final constants*/
class ENUMCheck {
    public static void main(String[] args) {
        // todo: Uncomment the lines one by one
        /*Season season = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(season == Season.SUMMER);*/

    /* Enums can be used in for loop/ for-each loop as well*/
        /* Enums provide a static method to get an array of all values .
        * We can use this like any normal array.
        * */
       /* for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }*/

        /* We can crete an enum value from string*/
        /*Season season1 = Season.valueOf("SUMMER");
        Season season2 = Season.valueOf("summer"); */// will throw IllegalArgumentException

        /* We can use Enums in Switch Construct*/
        Season summer = Season.SUMMER;
        switch (summer) {
            case SUMMER:
                System.out.println("Time for the pool");
                break;
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}
