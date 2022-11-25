package org.example;

public class MilkTank {
    public static final int STANDARD_TANK_CAPACITY = 2000;
    //fields
    private String name;
    private int  capacity;

    private int currentAmount;

    public MilkTank() {
        this.name="not named";
        this.capacity = STANDARD_TANK_CAPACITY;
        this.currentAmount = 0;
    }

    public MilkTank(String name, int customCapacity) {
        this.name = name;
        this.capacity = customCapacity;
        this.currentAmount =0;
    }

    public String getName() {
        return name;
    }



    public double getCapacity() {
        return capacity;
    }


    public double getCurrentAmount(){
        return currentAmount;
    }


    public double freeSpace(){
        return   this.capacity-this.currentAmount;
    }
    public void addToTank(double addAmount){
        for(int i=0;i<=addAmount;i++)
        {
            if(this.currentAmount<this.capacity)
            {
                this.currentAmount=this.currentAmount+1;
            }
            else
            {
                System.out.println("The tank is full!");
                break;
            }
        }
        System.out.println("The current capacity after adding is:"+this.currentAmount);
    }
    public double getFromTank(double amount)
    {
        for(int i = (int) amount; i<=0; i--)
        {
            if(currentAmount!=0)
            {
                this.currentAmount=this.currentAmount-1;
            }
            else
            {
                amount=i;
//                System.out.println("The tank is empty can not take anymore milk!");
                break;
            }
        }
//        System.out.println("The current capacity after taking is:"+currentAmount);
//        System.out.println("The  capacity taken is:"+amount);
        return amount;
    }

    @Override
    public String toString() {
        return "MilkTank{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", currentAmount=" + currentAmount +
                '}';
    }
}
