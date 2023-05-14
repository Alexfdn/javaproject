package lr5;
import java.util.stream.IntStream;
public class Example6 {
    static int[] array = {98, 554, 876, 11, 9, 77};

    static class t extends Thread {
        public t(String s) {
            super(s);
        }

        @Override
        public synchronized void run() {
            int sum = IntStream.of(array).sum();
            System.out.println(sum);
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

