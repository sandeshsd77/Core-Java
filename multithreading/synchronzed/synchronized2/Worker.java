package multithreading.synchronzed.synchronized2;

public class Worker {

    synchronized void sendMessage() throws InterruptedException {
        while (true) {
//            for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Inside Send Message");
            wait();
            notify();
        }
    }
//    }

    synchronized void receiveMessage() throws InterruptedException {
        while (true) {
//            for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Inside receive message");
            notify();
            wait();

        }
    }
}
//}