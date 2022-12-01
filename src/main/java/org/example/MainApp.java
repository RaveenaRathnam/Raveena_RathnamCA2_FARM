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


        MilkTank milkTank1=new MilkTank("DairyCowTank",1500);
        MilkingMachine milkingMachine1=new MilkingMachine();


        Shed shed1=new Shed(milkTank1);

        shed1.installMilkingMachine(milkingMachine1);

        shed1.addAnimal(DC1);
        shed1.addAnimal(DC2);
        shed1.addAnimal(DC3);


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
