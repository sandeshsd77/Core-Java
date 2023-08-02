package oops.Inheritance.Animal;

public class Animal {
    int legs;
    String colour;

    public Animal(int legs, String colour) {
        this.legs = legs;
        this.colour = colour;
    }
    public void eat(){
        System.out.println("the animal is eating");
    }

}
