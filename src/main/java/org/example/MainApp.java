package org.example;

import java.util.ArrayList;


public class MainApp {
//    ArrayList<Animal> animalList=new ArrayList<>();
//    animalList.add(new DairyCow(101));
//
//    double amount=animalList.get(0).milk();
//    BeefCow beefCow1=new BeefCow(501);
    //beefCow.milk();

    //--milk all the animals?--NO-only milkable
    //for(Animal animal:animalList){
    //if(animal instanceOf IMilkable){
    //int amount=animal.milk();
    //totalMilk+=amount;
    //}
    //}

    //FarmSimulator
    //MilkTank milkTank=new MilkTank();
    //Shed shed1=new Shed(tank);
    //MilkingMachine m1=new MilkingMachine();
    //shed1.installMilkingMachine(m1);
    //shed1.milkAllAnimals();
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        MainApp app = new MainApp();
        app.start();
    }
    public void start() {

        DairyCow DC1=new DairyCow("kosy");
        System.out.println(DC1.toString());

        DairyCow DC2=new DairyCow();
        System.out.println(DC2.toString());

        DairyCow DC3=new DairyCow();
        System.out.println(DC3.toString());

        System.out.println("Using ArrayList<Animal>");

        ArrayList<Animal> cowList=new ArrayList<>();
        cowList.add(DC1);
        cowList.add(DC2);
        cowList.add(DC3);
        displayAnimalList(cowList);

        MilkTank milkTank1=new MilkTank("DairyCowTank",1500);
        milkTank1.addToTank(1300);
        MilkingMachine milkingMachine1=new MilkingMachine();
        milkingMachine1.setMilkTank(milkTank1);
        Shed shed1=new Shed(milkTank1);
        shed1.addAnimal(cowList);
        shed1.installMilkingMachine(milkingMachine1);
        System.out.println(shed1.toString());
//


    }
    public void displayAnimalList(ArrayList<Animal> list)
    {
        for (Animal animal:list)
        {
            System.out.println(animal.toString());

        }

    }
    public void displayShedList(ArrayList<Shed> list)
    {
        for (Shed shed:list)
        {
            System.out.println(shed.toString());

        }

    }
}
