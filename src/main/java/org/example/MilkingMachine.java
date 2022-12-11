package org.example;

public class MilkingMachine  {


    private MilkTank milkTank;//--reference to a milk tank object


    public MilkingMachine() {
     this.milkTank=null;
    }

    public MilkTank getMilkTank(){
        return this.milkTank;
    }

    public void setMilkTank(MilkTank milkTank) {
        this.milkTank = milkTank;
    }

    public double milk(IMilkable milkable){
        //one animal at a time to be milked-to be passed
        //milk(IMilkabla animal);--to call only the animals thata re milkable
        //{

        double amount = milkable.milk();
        //double amount=milkable.getCapacity();
        //add amount to the tank
        this.getMilkTank().addToTank(amount);
        return amount;
        //}
    }

    @Override
    public String toString() {
        return "{milking machine=>" + milkTank +
                '}';
    }
}
