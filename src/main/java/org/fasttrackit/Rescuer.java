package org.fasttrackit;

public class Rescuer {
    String name;
    int availableAmountOfMoney;

    public void feedAnimal(Animal animal, AnimalFood food){
        System.out.println(name + " just gave some " + food.name + "to"+ animal.name);
        animal.hungerLevel = animal.hungerLevel -2;

    }

    public void recreationActivity(Animal animal, RecreationActivity recreationActivity){

        System.out.println(name+animal.name+recreationActivity+animal.spiritLevel);

}

}


