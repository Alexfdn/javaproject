package lr4;

public class Example1_12 {
    public static class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                try {
                    throw new IllegalArgumentException("Строка введена неверно");
                } catch (IllegalArgumentException e) {

                }
            }
            if (chislo > 0.001) {
                try {
                    throw new IllegalArgumentException("Неверное число");
                } catch (IllegalArgumentException e) {

                }
            }
        }
    }
    public static void main(String[] args) {
        Main.m(null, 0.000001);
    }
}

