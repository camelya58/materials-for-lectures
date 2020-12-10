package module04.lesson41_daemon;

/**
 * Class ThreadGroupExample
 *
 * @author Kamila Meshcheryakova
 * created by 10.12.2020
 */
public class ThreadGroupExample implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGroupExample runnable = new ThreadGroupExample();
        ThreadGroup threadGroup = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(threadGroup, runnable,"one");


        Thread t2 = new Thread(threadGroup, runnable,"two");

        Thread t3 = new Thread(threadGroup, runnable,"three");

//        Thread t4 = new Thread(new UserThread(), "four");
//        threadGroup.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
//        t4.start();
//        threadGroup.interrupt();

        System.out.println("Thread Group Name: "+threadGroup.getName());
        threadGroup.list();
        System.out.println(threadGroup.activeCount());
    }
}
