package module04.lesson40_threads;

/**
 * Класс ThreadMethods
 *
 * @author Kamila Meshcheryakova
 * created 23.11.2020
 */
public class ThreadMethods {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new YieldRunnable(100));
        Thread thread2 = new Thread(new YieldRunnable(200));
        thread1.start();
        thread2.start();
    }
}

class YieldRunnable implements Runnable {

    private int index;

    public YieldRunnable(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println("begin-" + index);
        Thread.yield();
        System.out.println("end-" + index);
    }
}
