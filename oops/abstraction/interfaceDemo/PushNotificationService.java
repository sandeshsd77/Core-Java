package oops.abstraction.interfaceDemo;

public class PushNotificationService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending the message with push notification");
    }
}
