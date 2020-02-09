package org.fasttrackit;

public class Animal extends ToyAnimal {

    private static final Object PetFood = "Bone";

    public Animal(PetFood petFood) {
        super(petFood);
    }

    public Animal() {
        super();
    }
}