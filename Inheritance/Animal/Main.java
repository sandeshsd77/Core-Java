package Inheritance.Animal;

public class Main {
    public static void main(String[] args) {


        Tiger tigger = new Tiger(3, "Brown","black");
        System.out.println("colour of animal= " +tigger.colour);
        System.out.println("legs of animal= "+tigger.legs);
        System.out.println("furcolour of tiger= "+tigger.furcolour);
       tigger.eat();
       tigger.roar();

    }
}