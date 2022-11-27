package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Shed {
    private ArrayList<Animal> animalList;
    private MilkingMachine milkingMachine;
    private MilkTank milkTank;
    //Constructor
    public Shed(MilkTank tank){
        this.milkTank=tank;
        this.animalList=new ArrayList<>();
    }
    public void addAnimal(Animal animal){
         animalList.add(animal);
    }

    public void installMilkingMachine(MilkingMachine milkingMachine){
        this.milkingMachine=milkingMachine;
        milkingMachine.setMilkTank(this.milkTank);
    }
public void milkAnimal(Animal animal){
        if(animal instanceof IMilkable)
        {
            milkingMachine.milk((IMilkable) animal);
        }
}
public void milkAnimal(Collection<Animal> animals){
    for(Animal animal:animals){
    if(animal instanceof IMilkable){
    milkingMachine.milk((IMilkable) animal);
    }
    }
}

    @Override
    public String toString() {
        return "Shed{" +
                "animalList=" + animalList +
                ", milkingMachine=" + milkingMachine +
                ", milkTank=" + milkTank +
                '}';
    }
//milkingMachine.milk(animalList);

    //--milk all the animals?--NO-only milkable
    //method milkAllAnimals()
    //for(Animal animalList:animalList){
    //if(animalList instanceOf IMilkable){
     //mikingMachine.milk(animalList);
    //}
    //}
}
