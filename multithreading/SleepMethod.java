package multithreading;

public class SleepMethod {
    static Thread mt;

    public static void main(String[] args) throws InterruptedException {
        mt = Thread.currentThread();
        Thread thread = new Thread(() -> {
            try {
                    mt.join(3000);
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello " + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }, "lambda");

        thread.start();
//        thread.join(2000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Heyy " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
