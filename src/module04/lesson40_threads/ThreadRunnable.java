package module04.lesson40_threads;

/**
 * Класс ThreadRunnable
 *
 * @author Kamila Meshcheryakova
 * created 23.11.2020
 */
public class ThreadRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        thread1.start();
        Thread thread2 = new Thread(new MyThread4());
        thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("privet");
            }
        }).start();

        new Thread(() -> System.out.println("poka")).start();

    }
}

class MyThread3 implements Runnable {

    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.print(i + " ");
        }
    }
}

class MyThread4 implements Runnable {

    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}