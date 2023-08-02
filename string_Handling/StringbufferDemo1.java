package string_Handling;

public class StringbufferDemo1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ABC");
        str.append("xyz");
        System.out.println(str);//ABCxyz

        str.insert(4,"at the beginning");
        System.out.println(str);//ABCxat the beginningyz

        str.deleteCharAt(0);
        System.out.println(str);//BCxat the beginningyz

        str.delete(0,10);
        System.out.println(str);//beginningyz

        str.replace(0,10,"Exception");
        System.out.println(str);//Exceptionz
        str.reverse();
        System.out.println(str);//znoitpecxE

        StringBuilder str2 = new StringBuilder("Collection Framework");
    }
}
