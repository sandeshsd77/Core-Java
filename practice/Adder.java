package practice;
//method overloading with same method name but different signature
public class Adder {
     int add(int a,int b){return a+b;}
     double add(float a,int b){return a+b;}
}
class TestOverloading3 extends Adder{
    public static void main(String[] args){
//        System.out.println(Adder.add(11,21));//ambiguity
        Adder adder = new TestOverloading3();
        System.out.println(adder.add(1,2));
        System.out.println(adder.add(1.00f,5));
    }
}

