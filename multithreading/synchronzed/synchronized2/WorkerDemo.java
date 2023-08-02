package multithreading.synchronzed.synchronized2;

public class WorkerDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();

        Thread thread = new Thread( () -> {
            try {
                worker.sendMessage();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });


        Thread thread2 = new Thread(
                () -> {
                    try {
                        worker.receiveMessage();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });

        thread.start();
        thread2.start();
    }
}
