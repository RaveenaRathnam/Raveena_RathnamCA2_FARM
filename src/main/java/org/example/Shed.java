package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Shed  {
    private int shed_ID;
    private String shed_name;
    private static int count=0;
    private ArrayList<Animal> animalList;
    private MilkingMachine milkingMachine;
    private MilkTank milkTank;
    //Constructor
    public Shed(String shed_name,MilkTank tank){
        this.animalList =new ArrayList<>();
        this.shed_ID=count++;
        this.shed_name=shed_name;
        this.milkTank=tank;
    }
    public Shed(String shed_name){
        this.animalList =new ArrayList<>();
        this.shed_ID=count++;
        this.shed_name=shed_name;
        this.milkTank=null;
    }
    public void addAnimal(Animal animal){
         animalList.add(animal);
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public MilkTank getMilkTank() {
        return milkTank;
    }

    public int getShed_ID() {
        return shed_ID;
    }

    public void setShed_ID(int shed_ID) {
        this.shed_ID = shed_ID;
    }

    public String getShed_name() {
        return shed_name;
    }

    public void setShed_name(String shed_name) {
        this.shed_name = shed_name;
    }

    public void installMilkingMachine(MilkingMachine milkingMachine){
        this.milkingMachine=milkingMachine;
        milkingMachine.setMilkTank(this.milkTank);
    }
public void milkAnimal(Animal animal){
    double amountOfMilk=0;
        if(animal instanceof IMilkable)
        {
            amountOfMilk= milkingMachine.milk((IMilkable) animal);
        }
    System.out.println("The amount of milk milked from "+animal.getClass().getName()+" is: "+amountOfMilk+" liters");
}
public void milkAllAnimal() throws IllegalStateException{
        double amountOfMilk=0;
    for(Animal animal:animalList){
    if(animal instanceof IMilkable){
    amountOfMilk=milkingMachine.milk((IMilkable) animal);
        System.out.println("The amount of milk milked from  is: "+amountOfMilk+" liters");
    }

    }
}

    @Override
    public String toString() {
        return "\nShed{" +
                "shed_ID=" + shed_ID +
                ", shed_name='" + shed_name + '\'' +
                ", animalList=" + animalList +
                ", \n milktank="+ milkTank +
                '}';
    }

}
