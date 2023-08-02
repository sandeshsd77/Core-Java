package multithreading.synchronzed;

    public class Lock {
        public static void main(String[] args) {
            final Object lock = new Object();

            // Thread A
            Thread thread1 = new Thread(() -> {
                synchronized (lock) {
                    try {
                        System.out.println("Thread A is waiting...");
                        lock.wait();
                        System.out.println("Thread A is notified and resumed.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
                    thread1.start();

            // Thread B
            Thread thread2 = new Thread(() -> {
                synchronized (lock) {
                    System.out.println("Thread B is performing some task.");
                    lock.notify();  // Notify a single waiting thread
                    // lock.notifyAll(); // Notify all waiting threads
                }
            });
            thread2.start();
        }
    }


