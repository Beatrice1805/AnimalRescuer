package org.fasttrackit;

public class ToyAnimal extends Pet {
    private String name = "Bishon";

    public static void main(String[] args) {
        ToyAnimal myToyAnimal = new ToyAnimal();
        myToyAnimal.bark();
        System.out.println(myToyAnimal.name + "");
    }
    public void hopper() {
        System.out.println("Tup Tup!");
    }
}