package collectionn.Linkedlist;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<Integer> vector = new java.util.Vector<>();

        // Multiple threads modifying the Vector concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                vector.add(i);
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the vector size
        System.out.println("Vector size: " + vector.size());
    }
}

