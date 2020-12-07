package module04.lesson40_threads.lesson;

/**
 * Класс Example
 *
 * @author Kamila Meshcheryakova
 * created 07.12.2020
 */
public class Example {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getName() + " state = " + thread.getState());
        System.out.println(thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());

        System.out.println(Thread.currentThread().getName() + " state = " +
                Thread.currentThread().getState());
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        Thread.yield();
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();


    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i + " ");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i + " ");
        }
    }
}