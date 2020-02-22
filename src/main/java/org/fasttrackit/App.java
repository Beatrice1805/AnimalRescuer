package org.fasttrackit;

import java.time.LocalDateTime;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Rescuer Game");

        Animal animal = new Animal( "Lucky");
        animal.age = 5;
        animal.favouriteFood = "Royal";
        animal.hungerLevel = 10;
        System.out.println("Hello,! i'm Lucky , your new friend!");


        AnimalFood petFood = new AnimalFood();
        petFood.name = "Purina";
        petFood.foodLocalDate = LocalDateTime.of(2030, Month.JANUARY, 1, 10,
                10, 30);
        System.out.println("My favorite food is delicious!");

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Alina";
        rescuer.availableAmountOfMoney = 500;

        rescuer.feedAnimal(animal, petFood);
        System.out.println("Hunger level is :" + animal.hungerLevel);


        RecreationActivity recreationActivity = new RecreationActivity();
        recreationActivity.name = "listeningMusic";

        rescuer.recreationActivity(animal, recreationActivity);

        Dog dog = new Dog("Puppy");


    }
}