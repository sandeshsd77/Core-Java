package multithreading;

public class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("Job of worker");
    }

//    public static class Worker2 extends Thread {
//        @Override
//        public void run() {
//            System.out.println("worker doing job");
//        }

        public static void main(String[] args) {
            Worker worker = new Worker();
            worker.start();
//            Worker2 worker2 = new Worker2();
//            worker2.start();

        }
    }

