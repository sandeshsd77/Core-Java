package oops.abstraction.interfaceDemo;

public class TestMessageService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sendding the message with sms ");
    }
}
