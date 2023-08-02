package multithreading.synchronzed.synchronizedd;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
       Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <1000 ; i++) {
                counter.add();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <1000 ; i++) {
                counter.add();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("count is "+counter.count);
    }
}
