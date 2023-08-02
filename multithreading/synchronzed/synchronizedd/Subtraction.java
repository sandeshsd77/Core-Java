package multithreading.synchronzed.synchronizedd;

public class Subtraction {
    int subtraction = 0;

    public Subtraction() {

    }

    public void subtract(int start, int end) {
        synchronized (this) {
            for (int i = start; i < end; i++) {
                subtraction = subtraction - i;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Subtraction subtraction1 = new Subtraction();
        Thread thread1 = new Thread(() -> {
            subtraction1.subtract(5, 10);
        });
        Thread thread2 = new Thread(() -> {
            subtraction1.subtract(11, 15);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Subtraction : "+subtraction1.subtraction);
    }
}