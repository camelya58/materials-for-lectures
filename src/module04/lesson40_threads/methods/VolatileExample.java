package module04.lesson40_threads.methods;

/**
 * Класс VolatileExample
 *
 * @author Kamila Meshcheryakova
 * created 07.12.2020
 */
public class VolatileExample extends Thread {

    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while(b) {
            counter++;
        }
        System.out.println("Loop finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();
        Thread.sleep(3000);
        System.out.println("awake after 3 seconds");
        thread.b = false;
        thread.join();
        System.out.println("End of the program");
    }
}
