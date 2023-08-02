package multithreading;

public class AdditionThread1 extends Thread{
    @Override
    public void run() {
        AdditonTask additonTask = new AdditonTask(1,1000);
        additonTask.add();
    }
}
