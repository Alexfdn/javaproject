package lr5;
import java.util.Arrays;
import java.util.OptionalInt;
public class Example5 {
    static int[] array = {75, 11, 34, 199, 679, 9, 0};
    public static int ElementMax = 0;

    static class t extends Thread {
        public t(String s) {
            super(s);
        }

        @Override
        public synchronized void run() {
            OptionalInt max = Arrays.stream(array).max();
            ElementMax = max.getAsInt();
            System.out.println(ElementMax);
            this.interrupt();
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Thread t = new Thread(new t("tread"));
            t.start();
        }

        }
    }





