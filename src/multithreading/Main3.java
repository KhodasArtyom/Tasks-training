package multithreading;

import static java.lang.System.out;
import static java.lang.Thread.currentThread;

public class Main3 {
    public static void main(String[] args) {
        Runnable task = ()->out.println(currentThread().getName());
        Thread thread = new Thread(task);
        thread.start();

    }
}
