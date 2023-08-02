package oops.abstraction.abstarct;

public class MessageServiceImpl extends MessageService {

    @Override
    void instanceMethod() {
        super.instanceMethod();
        System.out.println("instance method of impl ");
    }

    @Override
    void sendMessage() {
        System.out.println("Sending Message");
    }
    MessageServiceImpl(){
        System.out.println("MessageServiceImpl Constructor ");
    }
}
