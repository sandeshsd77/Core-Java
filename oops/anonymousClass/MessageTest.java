package oops.anonymousClass;

public class MessageTest {
    public static void main(String[] args) {
        Message message = new Message(){
            @Override
            public void printMessage() {
                System.out.println("Sandesh");
            }
        };
        message.printMessage();
    }


}
