package class_and_Object;
//Create a class named 'PrintNumber' to print various numbers of
//        different datatypes by creating different methods with
//        the same name 'printn' having a parameter for each datatype.
public class Printnumber {
    public void printn(byte n){
        System.out.println( "byte number "+n);
    }
    public void printn(short n){
        System.out.println( "short number "+n);
    }
    public void printn(int n){
        System.out.println( "Integer number "+n);
    }
    public void printn(float n){
        System.out.println( "Float number "+n);
    }
    public void printn(long n){
        System.out.println( "long number "+n);
    }
    public void printn(double n){
        System.out.println( "double number "+n);
    }

    public static void main(String[] args) {
        Printnumber print = new Printnumber();
        print.printn(1);
        print.printn(2);
        print.printn(1000);
        print.printn(45.0);
        print.printn(15987563824L);
        print.printn(155.20);

    }


    }



