package oops.abstraction.functionalInterfaces;

public class StringProcessorImpl implements StringProcessor {
    @Override
    public int process(String str) {
        return str.length();
    }
}
