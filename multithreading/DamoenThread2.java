package multithreading;

public class DamoenThread2 extends Thread{
    public void run(){
        System.out.println("Sandesh "+Thread.currentThread().getName());
        System.out.println("Daemon "+Thread.currentThread().isDaemon());
    }


    public static void main(String[] args) throws InterruptedException {
        DamoenThread2 damoenThread2 = new DamoenThread2();
        DamoenThread2 damoenThread3 = new DamoenThread2();
        damoenThread2.start();
        damoenThread2.join();
        damoenThread3.setDaemon(true);
        damoenThread3.start();
    }
}
