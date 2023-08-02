package multithreading;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even :" + i);
                }
            }

        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd :" + i);
                }
            }
        });
        thread2.start();
        thread2.join();
        thread1.start();
    }
}
