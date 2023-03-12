package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AnimalFarm {
    ArrayList<String> farmAnimals;

    public AnimalFarm(ArrayList<String> newFarmAnimals) {
        this.farmAnimals = newFarmAnimals;
    }

    public HashMap<Animal, Integer> countedAnimals(Integer count) {
        HashMap<Animal, Integer> countAnimals = new HashMap<>();
        for (String element : farmAnimals) {
            String[] elements = element.trim().split(" ");
            try {
                countAnimals.put(Animal.valueOf(elements[0]), count);
            } catch (IllegalArgumentException exception) {
                System.out.println("Please correct string " + element + ". Нет, блять, такого животного");
            }
        }
        return countAnimals;
    }

    public HashSet<String> uniqueNames() {
        HashSet<String> uniqueNames = new HashSet<>();
        for (String element : farmAnimals) {
            String[] elements = element.trim().split(" ");
            try {
                uniqueNames.add(elements[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please correct string " + element.trim() + ". 1 только элемент в массиве");
            }
        }
        return uniqueNames;
    }

    public void addAnimal(Animal animal, String name){
        farmAnimals.add(animal.name() + " " + name);
    }

    public void addAnimal(Animal animal){
        farmAnimals.add(animal.name() + " N");
    }

    public void addAnimal(String name){
        farmAnimals.add(Animal.NOT_DEFINED.name() + " " + name);
    }

    @Override
    public String toString(){
        String farmString = "";
        for (String element : farmAnimals) {
            farmString += element.trim() + "\n";
        }
        return farmString;
    }
}
