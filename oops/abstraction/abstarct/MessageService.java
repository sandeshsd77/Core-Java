package oops.abstraction.abstarct;

abstract public class MessageService {
    public MessageService() {
        System.out.println("Zero parameter constructor in abstract class");
    }

    int instanceVariable;
    static int staticVariable;

    void instanceMethod() {
        System.out.println("abstract class : instance method ");
    }

    static void staticmethod() {
        System.out.println("abstract class : static method");
    }

    {
        System.out.println("instance block of abstract class");
    }

    static {
        System.out.println("Static block of abstract class");
    }

    class innerClass {
    }

    static class StaticNestedClass {
    }

    abstract void sendMessage();

}
