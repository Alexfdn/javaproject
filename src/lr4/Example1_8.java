package lr4;

public class Example1_8 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }
    }
        public static void main(String[] args) {
            System.out.println(Main.m());
        }
    }


