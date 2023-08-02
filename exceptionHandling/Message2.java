package exceptionHandling;

public interface Message2 {
    void printMessage();

    public static void main(String[] args) {
        Message2 message2 = new Message2() {
            @Override
            public void printMessage() {
                System.out.println("Hello");
            }
        };
        message2.printMessage();
    }
}
