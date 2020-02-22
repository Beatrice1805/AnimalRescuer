package org.fasttrackit;

import java.time.LocalDateTime;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Rescuer Game");

        Animal animal = new Animal("Lucky");
        animal.age = 5;
        animal.favouriteFood = "Royal";
        animal.hungerLevel = 10;
        animal.happinessLevel = 10;
        animal.favouriteFood = "Purina";
        animal.favouriteActivity = " Chasing";
        System.out.println("Hello,! i'm Lucky , your new friend!");

        AnimalFood petFood = new AnimalFood();
        petFood.name = "Purina";
        petFood.foodLocalDate = LocalDateTime.of(2030, Month.JANUARY, 1, 10,
                10, 30);
        System.out.println("My favorite food is delicious!");


        Rescuer rescuer = new Rescuer();
        rescuer.name = "Alina";
        rescuer.availableAmountOfMoney = 500;
        rescuer.entertain = "Chasing";


        rescuer.feedAnimal(animal, petFood);
        System.out.println("Hunger level is :" + animal.hungerLevel);


        RecreationActivity recreationActivity = new RecreationActivity();
        recreationActivity.name = "listeningMusic";

        rescuer.recreationActivity(animal, recreationActivity);
        System.out.println("Spirit Level is :" + animal.happinessLevel);

        Dog dog = new Dog("Puppy");

        if (petFood.name.equals(animal.favouriteFood)) {
            System.out.println(" If the food is similar with the favorite one");
        } else {
            System.out.println(" than the happiness level is :" + (animal.happinessLevel + 1));
        }
        if (animal.favouriteActivity.equals(rescuer.entertain)) {
            System.out.println("If the entertainment is similar with the favourite one");
        } else {
            System.out.println("than the happiness level is " + (animal.happinessLevel + 2));
        }
    }
}
