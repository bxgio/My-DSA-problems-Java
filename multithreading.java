import java.lang.Thread;
class MyRunnable implements Runnable {
    private static final int MAX_COUNT = 5;

    private int threadId;

    public MyRunnable(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        for (int i = 0; i < MAX_COUNT; i++) {
            System.out.println("Thread " + threadId + ": Value " + i);

            // Introduce a delay to simulate some work
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multithreading {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyRunnable(1));
        Thread t2 = new Thread(new MyRunnable(2));
        Thread t3 = new Thread(new MyRunnable(3));
        Thread t4 = new Thread(new MyRunnable(4));

        t1.start();  // Start the first thread
        t2.start();  // Start the second thread
        t3.start();  // Start the third thread
        t4.start();  // Start the fourth thread
    }
}


