package module04.lesson40_threads.lesson;

/**
 * Класс Methods
 *
 * @author Kamila Meshcheryakova
 * created 07.12.2020
 */
public class Methods {

    private static volatile int count;

    public static void main(String[] args) throws InterruptedException {

        Clock clock = new Clock();
        Thread thread = new Thread(clock);
        thread.start();

        Thread.sleep(10000);
        thread.interrupt();



    }
}

class Clock implements Runnable {

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while(!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println("Tik");
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}