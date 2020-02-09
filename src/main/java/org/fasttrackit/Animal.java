package org.fasttrackit;

public class Animal extends ToyAnimal {

    public String name = "Bunny";

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.hopper();
        System.out.println(myAnimal.name + "");
    }
}