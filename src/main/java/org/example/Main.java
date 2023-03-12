package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myFarmList = new ArrayList<>();

        myFarmList.add("CAT Жужа");
        myFarmList.add("DOG");
        myFarmList.add("Шарик");
        myFarmList.add("Бобик1 ");
        myFarmList.add(" Бобик2 ");
        myFarmList.add(" Бобик3");
        myFarmList.add("CAT ");
        myFarmList.add(" CAT ");
        myFarmList.add(" CAT");
        AnimalFarm myFarm = new AnimalFarm(myFarmList);

        myFarm.addAnimal("Шарик");
        myFarm.addAnimal(Animal.DOG, "Шарик");
        myFarm.addAnimal(Animal.DOG);
        System.out.println(myFarm.toString());
        System.out.println(myFarm.countedAnimals(3));
        System.out.println(myFarm.uniqueNames());
    }
}