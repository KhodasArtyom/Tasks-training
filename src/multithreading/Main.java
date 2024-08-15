package multithreading;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println(Thread.currentThread().getName());
        final Thread thread = new MyThread();
        thread.start();
    }

    private static final class MyThread extends Thread {
        @Override
        public void run() {
            out.println(currentThread().getName());
        }
    }
}
