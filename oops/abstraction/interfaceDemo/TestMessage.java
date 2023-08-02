package oops.abstraction.interfaceDemo;

public class TestMessage {
    public static void main(String[] args) {
        MessageService messageService1 = new PushNotificationService();
        messageService1.sendMessage();
        MessageService messageService2 = new EmailService();
        messageService2.sendMessage();
        MessageService messageService3 = new TestMessageService();
        messageService3.sendMessage();
        MessageService messageService4 = new WhatsappMessageService();
        messageService4.sendMessage();
    }
}
