package module04.lesson40_threads.lesson;

/**
 * Класс ThreadMethods2
 *
 * @author Kamila Meshcheryakova
 * created 07.12.2020
 */
public class ThreadMethods2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("all done");

    }
}
