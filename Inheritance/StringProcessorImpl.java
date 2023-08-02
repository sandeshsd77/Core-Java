package Inheritance;

public class StringProcessorImpl implements StringProcessor {
    public void process(String str) {
        System.out.println("input " + str);
    }

    public static void main(String[] args) {
// Traditional Way
        StringProcessor stringProcessor = new StringProcessorImpl();
        stringProcessor.process("Sandesh");

// Anonymous way
        StringProcessor anonymousWay = new StringProcessorImpl() {
            @Override
            public void process(String str) {
                System.out.println("input " + str);
            }
        };
        anonymousWay.process("Anonymous");

// Lambda way
        StringProcessor lambda = (input) -> {
            System.out.println("Lambda" + input);
        };
        lambda.process(" Expression");


        //method reference
        StringProcessor method = StringProcessorImpl::m1;
        method.process("input");
    }

    static void m1(String str) {
        System.out.println(str);
    }
}