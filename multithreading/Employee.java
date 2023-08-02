package multithreading;

public class Employee implements Runnable{
    @Override
    public void run() {
        System.out.println(" Employee name");
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("employee is working in anonymous");
            }
        };
        runnable.run();
        Runnable runnable1 = ()->{
            System.out.println("Working in lambda");
        };
        runnable1.run();
    }

    }


