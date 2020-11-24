package module04.lesson40_threads;

/**
 * Класс ExampleInterruption
 *
 * @author Kamila Meshcheryakova
 * created 23.11.2020
 */
public class ExampleInterruption {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread threadClock = new Thread(clock);
        threadClock.start();

        Thread.sleep(10000);
        threadClock.interrupt();

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
