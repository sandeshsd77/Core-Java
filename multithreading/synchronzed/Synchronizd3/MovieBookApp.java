package multithreading.synchronzed.Synchronizd3;

import java.util.Scanner;

public class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Total Seats available for theater are 100");

        BookTheaterSeat bookTheaterSeat = new BookTheaterSeat();
        Thread thread1 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the seats you want to book");
            try {
                int seats = scanner.nextInt();
                bookTheaterSeat.bookSeat(seats);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        },"sandesh");

        Thread thread2 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the seats you want to book");
            try {
                int seats = scanner.nextInt();
                bookTheaterSeat.bookSeat(seats);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        },"Vikas");

        Thread.currentThread().join(2000);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();

    }
}
