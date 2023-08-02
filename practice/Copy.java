package practice;

public class Copy {
    int a;
    String b;
    Copy(int a, String b){
        this.a=a;
        this.b=b;
    }
    Copy(Copy copy1){
    }

//    @Override
//    public String toString() {
//        return "Copy{" +
//                "a=" + a +
//                ", b='" + b + '\'' +
//                '}';
//    }
}//
class Copy2 {
    public static void main (String [] args){
        Copy copy1 = new Copy(10, "Sandesh");
        Copy copy2 = new Copy(copy1);
        System.out.println(copy1.a+ " "+ copy1.b);
        System.out.println(copy2);
    }
}