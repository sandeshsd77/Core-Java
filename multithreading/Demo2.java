package multithreading;

public class Demo2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("start :" + i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Main Thread");
        Demo2 demo = new Demo2();
        demo.start();
        demo.join();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("start " + i);
                }
            }
        });
        thread1.setName("Custome thread ");
        thread1.start();
    }
}
