package multithreading;

    public class Main extends Thread {
        public void run() {
            amount++;
        }
        public static int amount = 0;

        public static void main(String[] args) {
            Main thread = new Main();
            thread.start();
            System.out.println(amount);
            amount++;
            System.out.println(amount);
        }

    }
