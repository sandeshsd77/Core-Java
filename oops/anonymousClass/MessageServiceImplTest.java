package oops.anonymousClass;

public class MessageServiceImplTest {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

        //anonymous class = class definition + object creation
        //className  ref = object
        MessageService ref = new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("Sending Message with anonymous class");
            }
        };
        ref.sendMessage();

        Runnable runnable = new RunnableImpl();
        runnable.run();

        Runnable runnable1 = new RunnableImpl(){
            @Override
            public void run() {
//                super.run();
                System.out.println("Runnable using anonymous class");
            }
        };
        runnable1.run();

    }
}