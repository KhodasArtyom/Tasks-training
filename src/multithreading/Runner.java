package multithreading;

import static java.lang.System.out;
import static java.lang.Thread.currentThread;
import static java.util.stream.IntStream.range;

public class Runner {

    private static final int CREATED_THREADS_AMOUNT = 10;

    public static void main(String[] args) {
        final Runnable taskDisplayingThreadName = () -> out.println(currentThread().getName());
        final Runnable taskCreatingThreads = ()-> range(0,CREATED_THREADS_AMOUNT)
                .forEach(i->startThread(taskDisplayingThreadName));
        startThread(taskCreatingThreads);
    }

    private static void startThread(final Runnable runnable){
        final Thread thread = new Thread(runnable);
        thread.start();
    }
}
