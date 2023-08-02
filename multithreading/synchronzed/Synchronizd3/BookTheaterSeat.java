package multithreading.synchronzed.Synchronizd3;

public class BookTheaterSeat {
    int total_seat = 100;

     void bookSeat(int seats) {
         synchronized (this) {

             if (seats <= total_seat) {
                 System.out.println(seats + " Seats book succesfully for : " + Thread.currentThread().getName());
                 total_seat = total_seat - seats;
                 System.out.println("Seats left " + total_seat);
             } else {
                 System.out.println("Seats cannot be booked. Available seats: " + total_seat);
             }
         }
    }
}
