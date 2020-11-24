package module04.lesson40_threads;

/**
 * Class CaughtExceptions
 *
 * @author Kamila Meshcheryakova
 * created 23.11.2020
 */
public class CaughtExceptions {

    public static void main(String[] args) {
        Thread thread = new DownloadThread();
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("thread name - " + t.getName() + " : exception - " + e.getClass().getName() + " = " +
                        e.getMessage());
            }
        });
        thread.start();
    }
}

class DownloadThread extends Thread {

    public void run() {
        System.out.println("Start");
        try {
            Thread.sleep(5000);
        } catch (Exception ignored) {
        }
        System.out.println("Here's a mistake");
        int a = 1/0;
    }
}