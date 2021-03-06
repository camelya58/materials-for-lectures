package module04.lesson40_threads;

/**
 * Class ThreadStates
 *
 * @author Kamila Meshcheryakova
 * created by 20.11.2020
 */
public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        System.out.println(thread.getName() + " in a state = " + thread.getState());

        System.out.println(Thread.currentThread().getName() + " in a state = " + Thread.currentThread().getState());

        thread.start();
        System.out.println(thread.getName() + " in a state = " + thread.getState());

        Thread.sleep(500);
        System.out.println(thread.getName() + " in a state = " + thread.getState());

    }
}
