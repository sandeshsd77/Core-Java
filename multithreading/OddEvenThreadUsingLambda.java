package multithreading;

public class OddEvenThreadUsingLambda {
    static Thread odd;

    public static void main(String[] args) throws InterruptedException {
        Thread even = new Thread(() -> {
            for (int index = 1; index < 100; index++) {
                if ((index % 2 == 0)) {
                    try {
                        odd.join(1000);
                        System.out.println(index + " " + Thread.currentThread().getName());
//                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "Even");
        odd = new Thread(() -> {
            for (int index = 1; index < 100; index++) {
                if (index % 2 != 0) {
                    try {
                        System.out.println(index + " " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "Odd");
        even.start();
        odd.start();
    }
}
