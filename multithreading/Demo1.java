package multithreading;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        //creating a thread by extending Thread class with the help of anonymous class
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++) {
                    System.out.println(Thread.currentThread().getName() + " " + index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.setName("user-defined-thread");
        thread.start();
//        thread.join(1000);
        for (int index = 0; index < 10; index++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " " + index);
        }

    }
}
