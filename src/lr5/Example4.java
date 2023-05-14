package lr5;

public class Example4 {
    static class evenThread implements Runnable {
        private int number;

        public evenThread(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Thread " + number);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(new evenThread(i));
            t.start();
        }
    }
}

