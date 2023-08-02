package multithreading.synchronzed.synchronizedd;

public class Counter {
    int count = 0;

    synchronized void add() {
        count++;
    }
}
