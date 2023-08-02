package oops.anonymousClass;

public class PrintNameImpl implements PrintName{

    @Override
    public void sendName() {
        System.out.println();
    }

    public static void main(String[] args) {
        PrintName p = new PrintNameImpl(){
            @Override
            public void sendName() {
                System.out.println("Sandesh");
            }
        };
        p.sendName();
    }
}
