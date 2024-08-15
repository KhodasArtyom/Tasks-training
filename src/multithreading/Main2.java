package multithreading;

import static java.lang.System.out;

public class Main2 {
    public static void main(String[] args) {
        out.println(Thread.currentThread().getName());

        final Thread thread = new Thread(){
            @Override
            public void run() {
                out.println(Thread.currentThread().getName());;
            }
        };
        thread.start();

    }
}
