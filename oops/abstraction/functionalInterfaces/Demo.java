package oops.abstraction.functionalInterfaces;

public class Demo {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessorImpl();
        System.out.println("Length of String is "+stringProcessor.process("Sandesh"));
    }
}
