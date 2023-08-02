package Inheritance.Animal;

class Tiger extends Animal {
    String furcolour;

    public Tiger(int legs, String colour, String furcolour) {
        super(legs, colour);
        this.furcolour = furcolour;
    }

    void roar() {
        System.out.println("The tiger is roaring");
    }
}