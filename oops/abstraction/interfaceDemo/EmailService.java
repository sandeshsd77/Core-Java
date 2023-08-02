package oops.abstraction.interfaceDemo;

public class EmailService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending the message with Email");
    }
}
