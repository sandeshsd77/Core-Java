package oops.abstraction.interfaceDemo;

public class WhatsappMessageService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending tnhe message with Whatsapp API");
    }
}
