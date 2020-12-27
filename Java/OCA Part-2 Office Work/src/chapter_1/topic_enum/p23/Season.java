package chapter_1.topic_enum.p23;

public enum Season {
    WINTER {
        @Override
        public void printHours() {
            System.out.println("9am-3pm");
        }
    },
    SPRING {
        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    },
    SUMMER {
        @Override
        public void printHours() {
            System.out.println("9am-7pm");
        }
    },
    FALL {
        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    };
    public abstract void printHours();

    public static void main(String[] args) {
       SPRING.printHours();
    }
}
