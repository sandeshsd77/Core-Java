package multithreading;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        AdditionThread1 additionThread1 = new AdditionThread1();
        additionThread1.start();
        AdditionThread2 additionThread2 = new AdditionThread2();
        additionThread2.start();
        additionThread1.join();
        additionThread2.join();
        System.out.println("sum "+AdditonTask.sum);
    }
}
