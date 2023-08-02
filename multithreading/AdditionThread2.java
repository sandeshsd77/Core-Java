package multithreading;

public class AdditionThread2 extends Thread {
    @Override
    public void run() {
        AdditonTask additonTask = new AdditonTask(1001, 2000);
        additonTask.add();
    }
}
