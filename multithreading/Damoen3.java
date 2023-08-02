package multithreading;

public class Damoen3 {
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Main Thread: " + Thread.currentThread().getName());

            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 6; i < 10; i++) {
                    System.out.println(i);
                }
            });

            thread1.setDaemon(true); // Set thread1 as a daemon thread
            thread1.start();
            thread2.start();
        }
    }

