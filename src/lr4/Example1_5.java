package lr4;

public class Example1_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
//        } catch (NullPointerException e) {
        } catch (RuntimeException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}

